package org.example.spring.domains.services.auth.mysql.event.listener;

import ai.yue.library.base.exception.ResultException;
import lombok.extern.slf4j.Slf4j;
import org.example.spring.domains.services.auth.mysql.event.entity.UserRegistrationEvent;
import org.example.spring.domains.services.auth.mysql.vo.RegisterVo;
import org.springframework.amqp.rabbit.core.RabbitMessagingTemplate;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class UserRegistrationListener implements ApplicationListener<UserRegistrationEvent> {
    private final RabbitMessagingTemplate rabbitMessagingTemplate;

    public UserRegistrationListener(RabbitMessagingTemplate rabbitMessagingTemplate) {
        this.rabbitMessagingTemplate = rabbitMessagingTemplate;
    }

    @Override
    public void onApplicationEvent(UserRegistrationEvent userRegistrationEvent) {
        RegisterVo registerVo = userRegistrationEvent.getRegisterVo();
        RegisterVo.RegisterType type = registerVo.getType();
        switch (type) {
            case ADMIN_USER:
                handlerAdminUserRegistrationEvent(registerVo);
                break;
            case DOCTOR_USER:
                handlerDoctorUserRegistrationEvent(registerVo);
                break;
            case SELL_USER:
                handlerSellUserRegistrationEvent(registerVo);
                break;
            default:
                throw new ResultException("");
        }
    }

    /**
     * 处理销售员注册事件
     *
     * @param registerVo 注册信息实体
     */
    private void handlerSellUserRegistrationEvent(RegisterVo registerVo) {
        log.info("UserRegistrationListener.handlerSellUserRegistrationEvent");
        rabbitMessagingTemplate.convertAndSend("UserRegistration", "sellUser", registerVo.getUser());
    }

    /**
     * 处理医生注册事件
     *
     * @param registerVo 注册信息实体
     */
    private void handlerDoctorUserRegistrationEvent(RegisterVo registerVo) {
        log.info("UserRegistrationListener.handlerDoctorUserRegistrationEvent");
        rabbitMessagingTemplate.convertAndSend("UserRegistration", "doctorUser", registerVo.getUser());
    }

    /**
     * 处理管理员注册事件
     *
     * @param registerVo 注册信息实体
     */
    private void handlerAdminUserRegistrationEvent(RegisterVo registerVo) {
        log.info("UserRegistrationListener.handlerAdminUserRegistrationEvent");
        rabbitMessagingTemplate.convertAndSend("UserRegistration", "adminUser", registerVo.getUser());
    }
}
