package org.example.plugins.commons.entity;

import lombok.Data;

@Data
public class DataDTO {
    private String privateKey;
    private String publicKey;
    private String encrptData;

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setEncrptData(String encrptData) {
        this.encrptData = encrptData;
    }

    public String getEncrptData() {
        return encrptData;
    }
}