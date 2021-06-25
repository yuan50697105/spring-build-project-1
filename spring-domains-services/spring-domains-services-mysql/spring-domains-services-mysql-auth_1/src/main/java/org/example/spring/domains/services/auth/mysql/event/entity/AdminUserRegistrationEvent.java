package org.example.spring.domains.services.auth.mysql.event.entity;

import org.example.spring.domains.services.auth.mysql.vo.RegisterVo;

import java.time.Clock;

public class AdminUserRegistrationEvent extends UserRegistrationEvent {


    public AdminUserRegistrationEvent(RegisterVo registerVo) {
        super(registerVo);
    }

    public AdminUserRegistrationEvent(RegisterVo source, Clock clock) {
        super(source, clock);
    }
}