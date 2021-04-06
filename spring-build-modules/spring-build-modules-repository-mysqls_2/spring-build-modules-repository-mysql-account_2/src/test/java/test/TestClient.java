package test;


import org.example.modules.repository.mysql.table.po.TUser;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestClient {
    @Test
    public void test() {
        List<TUser> strings = null;
        List<String> names = Optional.ofNullable(strings).orElse(new ArrayList<>()).stream().map(TUser::getName).collect(Collectors.toList());
        System.out.println("names = " + names);
    }
}