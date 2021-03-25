package org.example.applications.security;

import lombok.AllArgsConstructor;
import org.example.modules.repository.mysql.entity.vo.AccountDetailVo;
import org.example.modules.repository.mysql.repository.AccountRepository;
import org.example.plugins.security.CustomsUserDetailService;
import org.example.plugins.security.CustomsUserDetails;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CustomsUserDetailServiceImpl implements CustomsUserDetailService {
    private final AccountRepository accountRepository;
    @Override
    public UserDetails updatePassword(UserDetails user, String newPassword) {
        return null;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<AccountDetailVo> optional = accountRepository.getByUsernameOpt(username);
        if (optional.isPresent()) {
            AccountDetailVo accountDetailVo = optional.get();
            AccountDetailVo.UserInfo user = accountDetailVo.getUser();
            Set<AccountDetailVo.RoleInfo> roles = accountDetailVo.getRoles();
            return new CustomsUserDetails(accountDetailVo.getId(), user.getUsername(),user.getPassword(),user.getEnabled().equals(1), createAuthority(roles));
        } else {
            throw new UsernameNotFoundException(username + "不存在");
        }
    }

    private Set<CustomsUserDetails.CustomsGrantedAuthority> createAuthority(Set<AccountDetailVo.RoleInfo> roles) {
        return roles.stream().map(roleInfo -> new CustomsUserDetails.CustomsGrantedAuthority(roleInfo.getId(), roleInfo.getName())).collect(Collectors.toSet());
    }

    @Override
    public CustomsUserDetails loadUserById(Long id) {
        Optional<AccountDetailVo> optional = accountRepository.getByIdOpt(id);
        if (optional.isPresent()) {
            AccountDetailVo accountDetailVo = optional.get();
            AccountDetailVo.UserInfo user = accountDetailVo.getUser();
            Set<AccountDetailVo.RoleInfo> roles = accountDetailVo.getRoles();
            return new CustomsUserDetails(accountDetailVo.getId(), user.getUsername(),user.getPassword(),user.getEnabled().equals(1), createAuthority(roles));
        } else {
            return null;
        }
    }
}