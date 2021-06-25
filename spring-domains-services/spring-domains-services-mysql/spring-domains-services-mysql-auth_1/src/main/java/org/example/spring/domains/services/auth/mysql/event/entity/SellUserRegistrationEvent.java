package org.example.spring.domains.services.auth.mysql.event.entity;

import org.example.spring.domains.services.auth.mysql.vo.RegisterVo;

import java.time.Clock;

public class SellUserRegistrationEvent extends UserRegistrationEvent {
    public SellUserRegistrationEvent(RegisterVo registerVo) {
        super(registerVo);
    }

    public SellUserRegistrationEvent(RegisterVo source, Clock clock) {
        super(source, clock);
    }
}