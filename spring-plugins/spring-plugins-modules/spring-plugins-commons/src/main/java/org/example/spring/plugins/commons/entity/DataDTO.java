package org.example.spring.plugins.commons.entity;

import lombok.Data;

@Data
public class DataDTO {
    private String privateKey;
    private String publicKey;
    private String encrptData;

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public String getEncrptData() {
        return encrptData;
    }

    public void setEncrptData(String encrptData) {
        this.encrptData = encrptData;
    }
}