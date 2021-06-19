package org.example.spring.domains.services.mysql.auth.vo;

import cn.hutool.core.util.EnumUtil;
import lombok.Value;
import org.example.spring.repositories.commons.entity.auth.vo.UserVo;

@Value
public class RegisterVo {
    RegisterType type;
    UserVo user;

    public RegisterVo(UserVo user) {
        this.user = user;
        this.type = RegisterType.NONE;
    }

    public RegisterVo(UserVo user, RegisterType type) {
        this.type = type;
        this.user = user;
    }

    public enum RegisterType {
        NONE(Constants.NONE1, "-1","none"),
        BACKGROUND_USER(Constants.BACKGROUND_USER_HANDLER, "1", "background"),
        ;
        private final String type;
        private final String code;
        private final String name;

        RegisterType(String type, String code, String name) {
            this.type = type;
            this.code = code;
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public String getCode() {
            return code;
        }

        public String getName() {
            return name;
        }

        public static RegisterType get(String value) {
            return EnumUtil.likeValueOf(RegisterType.class, value);
        }

        public static class Constants {
            public static final String NONE1 = "NONE";
            public static final String BACKGROUND_USER_HANDLER = "backgroundUserHandler";
        }
    }
}