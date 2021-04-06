package test;

import cn.hutool.core.util.HashUtil;
import cn.hutool.crypto.digest.DigestAlgorithm;
import cn.hutool.crypto.digest.Digester;
import cn.hutool.json.JSONUtil;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.example.modules.repository.mysql.table.po.TUser;
import org.example.modules.repository.mysql.table.query.TUserQuery;
import org.junit.jupiter.api.Test;

import javax.validation.constraints.NotEmpty;
import java.nio.charset.StandardCharsets;

public class Tests2 {
    @Test
    void t1() {
        TUser user = new TUser();
        long hash = getHash(user);
        System.out.println("hash = " + hash);
        user = new TUser();
        long hash1 = getHash(user);
        System.out.println("hash1 = " + hash1);
        System.out.println("hash1==hash = " + (hash1 == hash));

    }


    @Test
    void t2() {
        TUserQuery user = new TUserQuery();
        String digester2 = getDigester2(user);
        user = new TUserQuery();
        String digester21 = getDigester2(user);
        System.out.println("digester2 = " + digester2);
        System.out.println("digester21 = " + digester21);
    }

    private long getHash(TUser user) {
        return HashUtil.mixHash(JSONUtil.toJsonStr(user));
    }

    private String getDigester(Object object) {
        Digester digester = new Digester(DigestAlgorithm.SHA512);
        return digester.digestHex(JSONUtil.toJsonStr(object).getBytes(StandardCharsets.UTF_8));
    }
    private String getDigester2(Object object) {
        Digester digester = new Digester(DigestAlgorithm.MD5);
        String data = JSONUtil.toJsonStr(object);
        System.out.println("data = " + data);
        return digester.digestHex(data);
    }
    private String getDigester3(Object object) {
        Digester digester = new Digester(DigestAlgorithm.SHA1);
        return digester.digestHex(JSONUtil.toJsonStr(object));
    }

    @Test
    void t3() {
        Bb bb = new Bb();
        bb.setId(12L);
        System.out.println("bb = " + JSONUtil.toJsonPrettyStr(bb));
        System.out.println("bb.hashCode() = " + bb.hashCode());
        Bb.BbBuilder<?, ?> bbBuilder = bb.toBuilder();
        bb = bbBuilder.name("aaa").build();
        System.out.println("bb = " + JSONUtil.toJsonPrettyStr(bb));
        System.out.println("bb.hashCode() = " + bb.hashCode());
        Cc build = Cc.builder().id(12L).name("abc").type("aa").build();
        System.out.println("JSONUtil.toJsonPrettyStr(build) = " + JSONUtil.toJsonPrettyStr(build));
    }

    @Data
    @SuperBuilder(toBuilder = true)
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Aa {
        private Long id;
    }

    @EqualsAndHashCode(callSuper = true)
    @Data
    @SuperBuilder(toBuilder = true)
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Bb extends Aa {
        private String name;
    }


    @EqualsAndHashCode(callSuper = true)
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @SuperBuilder(toBuilder = true)
    public static class Cc extends Bb {
        private String type;
    }


}
