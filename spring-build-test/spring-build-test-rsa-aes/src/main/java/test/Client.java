package test;

import cn.hutool.core.codec.Base64;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.asymmetric.KeyType;
import cn.hutool.crypto.asymmetric.RSA;

import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.security.Security;

public class Client {
    static final String PRV_KEY = "MIIEwAIBADANBgkqhkiG9w0BAQEFAASCBKowggSmAgEAAoIBAQCpaVxuDbtnUnTW8H8RPiZnvqhZRlex43hRmL7b0qJERhO1AQGb5k3M1j44p6RD2aNw4XbVhVYKcIVE70D2jW5GYMrdiiZwQaUMYP03UHUQnFp30U0eu+o/53ZppzlhQmKFYZhxKyewICggWl9GoDTe3rS6UotkLKiyRbbCUlvloJ2OPl4aPzOQRQl3q6M6dSED0vLCrqu5wYRkinkY4JnqREtmcs9XZQmdluyu9NtdAPImJXKJj7BiTj5jCJqaPIna/dQ9BjQonhNN8p6sxjUrHRNRpMywJaBIEnNthQ7Ky7EbhSpMwO3oy9gqX5zfn5DeZTXOZAHhvn/5Iu2CpMMLAgMBAAECggEBAIM+kNDh6pF9G+94mbhuAarV1e5zxHSX2Rq9zv7WC8gA0juj7+8rWJKcV8/kcCnwbeKBiWKZzbKAwX5KLHXV09zKF9/Rqz3EXW1dpk44ErkvqBazG5/3zN59Hwty9c0XdOQIW+Uwnaqg/vUxjiZU7yDKQBEo6bxNrNOPlqqsy2z038wv8oJF+1A314Zurc+2X5ZTmPBeL3omqD6H9kho0lR39olngMNNII0D1i37GKVvUYqC/QxTQSIzFgt6QJuqR5K9smyOW2Jmd0c1ryZ9iMypjdtTnbQJsi/fPQSY8whhGXfbbCfzmfBhtjbJEpQB7ULxkph9iWzjmgIwRncIu8ECgYEA71wbIIvrhqY1mZe9zrw8UkRF30XLrbZT8bwSm5O0r7Qg/otCZ5XaTioQNjwV/hP7TzjhQ+d6GxSTVlnGyKiQx/+CjxKwL/fcALD683kb6rmtpEWtpu/vnf+hNWJ/8vH+L43Wo9Ry16PnkMoZq0oqecqBZy85qQgogaDbmOm8J0MCgYEAtTBiX+6mTFYBw5VGIH8WlcS35dOJD63sLePIdHXJlEQ+jZIB0zhn9lpaln4T71VdiU2wkgcGz/ymt2WROTKUPphQTiEIyoZNz/zia1jfcEnaRjiXUj6XJltQHvv22fg0YHOzOXgqQg4iv39qyOshi6CsLKMoe13JL96w2Wk2xJkCgYEA18yEsI01pUoInRdPiynugIUJMcktXso5WIIljJpYluihrpxDHDzgewQ1ZZA6i73cH4q6nYv+bJfaVknOjG5dSdM1FGTW8AhZE058kjIoVzFcOfSQISfFMv+bihPqI1DFyH3qe/44I+6kAcgT6HiPXwqSLENJivnN+0DZez2P4x0CgYEAs3goiSNnP4eVmbg7TSb1JQZErXZZddltbosIXCrrr1vlpe7wtdpSR9d5kUVy04b37m+wrQQewFdef5wwO7qY0mOmb60S+yAK5TB0yaWvNJdCiHm3kXSD3S9nbjlfasoKf1s7NHqNSP6ddpdsG3WjtZ1BzbkS+ReNl0f6Xm90G0kCgYEAm+Q4pe/ICJaNWYVbqz/OoXXVD3Acrv05Vy05ifbsuX2rirM29qmgHxDMWACutY41XVfvUSTCZ3tgBuYrtMYSwZremEUa/Y8UacW/3K6iL2wIM3OCziVWZ0Ct5QcSMEmg/QD7MOmkDQx0NErBpDXLR2Xh0DmsfPS9I0r/KAIwXVo=";
    static final String IV_PARAM = "KuT1VfXIT5GGYW5F3D2zew==";
    static String reqJson = "{\"meta\":{\"transCode\":\"S001\",\"transNonce\":\"bf530dc7-661b-48c9-956e-89bbb1f9220e\",\"transDate\":\"20200622092020\"},\"data\":{\"shopNo\":\"A00000001\"}}";
    static String response = "JF0M1xRckOLN46FCk7BHWiGxhQNwStP5cXNaZ2bF6qf07YPqyq0bbZSQ+O6TkV3o1T8W/VCC+Y2VI9XjmveXz4c9ZIp+vVu4ecdAB7h6QeO4EWBnc10HZSINge1wAwsB2o2es1GutRR9+N+jgGKNADQ+Pu4NJ3ZExn1p7TB4Wh4yCenMsBn2Ic5y4XdaiLDtAagfUrUo59bbL1qnvoK9dRH7DH///IjQ+Yiyv0FX2lzP4anjqDlpjC2NZhkgsxsSmhhtE2nor+JiBtcREkx7r220Yi776S8l0zCJLS4py1fHdX+nCcAnkF0TY2/kxJ7OHyT4028sv7m1gtcJwogZtwGuvngJX4CbGXSFqt+860eftyn2k1qGG55Zq1dbDJEOc6e+Kmie8cHciSS1THXRg2M7oGnbJxBqK3buUWV7fF4VtxufNidjh5nlKSQn8un21syF3vIXmP7boVENpxXsS6wThErM/8qKsYqFHzJzGEgEFybyoRseW1vG8QHjpvfwvlnCJyn7aIGFkHFCcS5cE9nO1N1FWOpfJLOEp7+/xrjHuBDr1nA0DvVB8e102A73";
    public static void main(String[] args) {
        String result1 = decrypt(response);
    }

    private static String decrypt(String response) {
        byte[] bytes = Base64.decode(response);
        byte[] bytes1 = new byte[256];
        System.arraycopy();
        return null;
    }
}