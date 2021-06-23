package org.example.spring.domains.services.auth.mysql.event.listener;

import org.example.spring.domains.services.auth.mysql.event.entity.AdminUserRegistrationEvent;
import org.example.spring.domains.services.auth.mysql.event.entity.DoctorUserRegistrationEvent;
import org.example.spring.domains.services.auth.mysql.event.entity.SellUserRegistrationEvent;
import org.example.spring.domains.services.auth.mysql.event.entity.UserRegistrationEvent;
import org.example.spring.domains.services.auth.mysql.vo.RegisterVo;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class UserRegistrationListener implements ApplicationListener<UserRegistrationEvent> {
    @Override
    public void onApplicationEvent(UserRegistrationEvent userRegistrationEvent) {
        if (userRegistrationEvent instanceof AdminUserRegistrationEvent) {
            handlerAdminUserRegistrationEvent(userRegistrationEvent.getRegisterVo());
        } else if (userRegistrationEvent instanceof DoctorUserRegistrationEvent) {
            handlerDoctorUserRegistrationEvent(userRegistrationEvent.getRegisterVo());
        } else if (userRegistrationEvent instanceof SellUserRegistrationEvent) {
            handlerSellUserRegistrationEvent(userRegistrationEvent.getRegisterVo());
        }
    }

    /**
     * 处理销售员注册事件
     *
     * @param registerVo 注册信息实体
     */
    private void handlerSellUserRegistrationEvent(RegisterVo registerVo) {

    }

    /**
     * 处理医生注册事件
     *
     * @param registerVo 注册信息实体
     */
    private void handlerDoctorUserRegistrationEvent(RegisterVo registerVo) {
    }

    /**
     * 处理管理员注册事件
     *
     * @param registerVo 注册信息实体
     */
    private void handlerAdminUserRegistrationEvent(RegisterVo registerVo) {

    }
}
