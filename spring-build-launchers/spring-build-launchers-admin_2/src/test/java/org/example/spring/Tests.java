package org.example.spring;

import org.example.spring.infrastructures.mysql.auth.table.po.TUser;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tests {
    @Test
    void name() {
        List<Object> list = Arrays.asList("1", "2");
        for (Object o : list) {
            String s = (String) o;
            System.out.println("s = " + s);
        }
    }

    @Test
    void name1() throws IOException, ClassNotFoundException {
        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream stream = new ObjectOutputStream(arrayOutputStream);
        TUser tUser = new TUser();
        stream.writeObject(new ArrayList<TUser>(Arrays.asList(tUser, tUser, tUser)));
        byte[] bytes = arrayOutputStream.toByteArray();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        Object object = objectInputStream.readObject();
//        System.out.println("object = " + object);
        List<TUser> tUsers = (List<TUser>) object;
//        System.out.println("tUsers = " + tUsers);
        for (TUser user : tUsers) {
            System.out.println("user = " + user);
        }
    }
}