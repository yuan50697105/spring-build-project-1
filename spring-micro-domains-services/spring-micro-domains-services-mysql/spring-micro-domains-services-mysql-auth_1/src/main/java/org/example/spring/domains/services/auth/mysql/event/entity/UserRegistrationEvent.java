package org.example.spring.domains.services.auth.mysql.event.entity;

import lombok.Getter;
import org.example.spring.domains.services.auth.mysql.vo.RegisterVo;
import org.springframework.context.ApplicationEvent;

import java.time.Clock;

@Getter
public abstract class UserRegistrationEvent extends ApplicationEvent {
    private RegisterVo registerVo;


    public UserRegistrationEvent(RegisterVo registerVo) {
        super(registerVo);
        this.registerVo = registerVo;

    }

    public UserRegistrationEvent(RegisterVo source, Clock clock) {
        super(source, clock);
    }
}