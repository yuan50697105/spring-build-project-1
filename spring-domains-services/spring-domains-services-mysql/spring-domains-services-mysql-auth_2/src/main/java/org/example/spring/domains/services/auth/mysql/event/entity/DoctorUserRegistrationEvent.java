package org.example.spring.domains.services.auth.mysql.event.entity;


import org.example.spring.domains.services.auth.mysql.vo.RegisterVo;

import java.time.Clock;

public class DoctorUserRegistrationEvent extends UserRegistrationEvent {
    public DoctorUserRegistrationEvent(RegisterVo registerVo) {
        super(registerVo);
    }

    public DoctorUserRegistrationEvent(RegisterVo source, Clock clock) {
        super(source, clock);
    }
}