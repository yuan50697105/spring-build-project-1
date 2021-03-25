package org.example.plugins.security;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Set;

@Data
public class CustomsUserDetails implements UserDetails {
    private Long id;
    private String username;
    private String password;
    private boolean accountNonExpired;
    private boolean accountNonLocked;
    private boolean credentialsNonExpired;
    private boolean enabled;
    private Set<CustomsGrantedAuthority> authorities;

    public CustomsUserDetails(Long id, String username, String password, boolean accountNonExpired, boolean accountNonLocked, boolean credentialsNonExpired, boolean enabled, Set<CustomsGrantedAuthority> authorities) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.accountNonExpired = accountNonExpired;
        this.accountNonLocked = accountNonLocked;
        this.credentialsNonExpired = credentialsNonExpired;
        this.enabled = enabled;
        this.authorities = authorities;
    }

    public CustomsUserDetails(Long id, String username, String password, boolean enabled, Set<CustomsGrantedAuthority> authorities) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.enabled = enabled;
        this.authorities = authorities;
        this.accountNonExpired = true;
        this.accountNonLocked = true;
        this.credentialsNonExpired = true;
    }

    @Data
    public static class CustomsGrantedAuthority implements GrantedAuthority {
        private Long id;
        private String authority;

        public CustomsGrantedAuthority(Long id, String authority) {
            this.id = id;
            this.authority = authority;
        }
    }
}