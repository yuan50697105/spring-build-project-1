package org.example.spring;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tk.mybatis.mapper.entity.Example;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Client {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
//        Constructor<User> constructor = User.class.getConstructor(Long.class, Boolean.class);
//        User user = constructor.newInstance(1L, true);
//        System.out.println("user = " + user);
//        Constructor<Aa> constructor = Aa.class.getConstructor(Class.class);
//        Aa aa = constructor.newInstance(User.class);
//        System.out.println("aa.getAClass() = " + aa.getAClass());
        Constructor<Example> constructor = Example.class.getConstructor(Class.class);
        Example example = constructor.newInstance(User.class);
        System.out.println("example = " + example);
    }


    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class User {
        private long id;
        private boolean aa;
    }

    @Data
    @AllArgsConstructor
    public static class Aa {
        private Class<?> aClass;
    }


}