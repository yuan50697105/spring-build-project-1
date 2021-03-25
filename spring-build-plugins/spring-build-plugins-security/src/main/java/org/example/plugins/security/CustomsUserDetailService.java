package org.example.plugins.security;

import org.springframework.security.core.userdetails.UserDetailsPasswordService;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface CustomsUserDetailService extends UserDetailsService, UserDetailsPasswordService {
    CustomsUserDetails loadUserById(Long id);
}
