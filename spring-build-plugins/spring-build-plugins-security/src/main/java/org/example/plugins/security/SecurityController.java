package org.example.plugins.security;

import ai.yue.library.base.view.R;
import ai.yue.library.base.view.Result;
import lombok.AllArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("security")
@AllArgsConstructor
public class SecurityController {
    private final CustomsUserDetailService customsUserDetailService;

    @GetMapping("logout")
    public void logout(HttpSession session) {
        session.invalidate();
        SecurityContextHolder.clearContext();
    }

    @GetMapping("details")
    public Result<CustomsUserDetails> details(Long id) {
        CustomsUserDetails details = customsUserDetailService.loadUserById(id);
        return R.success(details);
    }

}