package org.example.spring.infrastructures.mysql.auth.utils;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;

public class CopyUtils {
    public static void copyCommons(Object object1, Object object2) {
        copy(object1,object2,CopyOptions.create().ignoreNullValue().setIgnoreProperties("createDate",""));
    }

    public static void copy(Object object1, Object object2, CopyOptions option) {
        BeanUtil.copyProperties(object1, object1, option);
    }
}