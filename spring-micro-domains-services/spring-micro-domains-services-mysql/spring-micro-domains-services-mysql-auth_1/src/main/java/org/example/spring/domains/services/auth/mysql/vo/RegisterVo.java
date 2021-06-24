package org.example.spring.domains.services.auth.mysql.vo;

import cn.hutool.core.util.EnumUtil;
import lombok.Data;
import org.example.spring.repositories.commons.entity.auth.vo.UserVo;

@Data
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
        NONE(Constants.NONE1, "-1", "none"),
        ADMIN_USER(Constants.ADMIN_USER_REGISTER_HANDLER, "1", "admin"),
        SELL_USER(Constants.ADMIN_USER_REGISTER_HANDLER, "1", "sell"),
        DOCTOR_USER(Constants.DOCTOR_USER_REGISTER_HANDLER, "1", "doctor"),
        ;
        private final String type;
        private final String code;
        private final String name;

        RegisterType(String type, String code, String name) {
            this.type = type;
            this.code = code;
            this.name = name;
        }

        public static RegisterType get(String value) {
            return EnumUtil.likeValueOf(RegisterType.class, value);
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

        public static class Constants {
            public static final String NONE1 = "NONE";
            public static final String ADMIN_USER_REGISTER_HANDLER = "adminUserRegisterHandler";
            public static final String SELL_USER_REGISTER_HANDLER = "sellUserRegisterHandler";
            public static final String DOCTOR_USER_REGISTER_HANDLER = "doctorUserRegisterHandler";
        }
    }
}