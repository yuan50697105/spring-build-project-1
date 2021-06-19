package org.example.spring.domains.services.mysql.auth.vo;

import lombok.Value;
import org.example.spring.repositories.commons.entity.auth.vo.UserVo;

@Value
public class RegisterVo {
    public static final String BACKGROUND_USER_HANDLER = "backgroundUserHandler";
    RegisterType type;
    UserVo user;

    public enum RegisterType {
        BACKGROUND_USER(BACKGROUND_USER_HANDLER),
        ;
        private final String type;

        RegisterType(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }
    }
}