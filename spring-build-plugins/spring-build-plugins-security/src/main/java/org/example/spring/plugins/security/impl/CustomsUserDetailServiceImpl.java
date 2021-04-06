package org.example.spring.plugins.security.impl;

import org.example.spring.plugins.security.CustomsUserDetailService;
import org.example.spring.plugins.security.CustomsUserDetails;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class CustomsUserDetailServiceImpl implements CustomsUserDetailService {

    @Override
    public CustomsUserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }

    @Override
    public UserDetails updatePassword(UserDetails user, String newPassword) {
        return null;
    }

    @Override
    public CustomsUserDetails loadUserById(Long id) {
        return null;
    }
}