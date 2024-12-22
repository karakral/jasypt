package com.karakral.jasypt;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.util.text.BasicTextEncryptor;
import org.springframework.stereotype.Service;

@Service
public class JasyptKeyCreator {

    private static final String SECRET_KEY = "njm7lY+11KYP/sstTVL370bbYuEROSbL";
    private static final String SET_ALGORITHM = "PBEWithMD5AndDES";

    public static void encryptProperty(String value) {
        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
        textEncryptor.setPassword(SECRET_KEY); // Use a strong key
        String encryptedValue = textEncryptor.encrypt(value);
        System.out.println("Encrypted value: " + encryptedValue);
    }

    public static void decryptedProperty(String property) {
        StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
        encryptor.setPassword(SECRET_KEY); // Same password used for encryption
        encryptor.setAlgorithm(SET_ALGORITHM);
        System.out.println("check encryption and decryption to be right " + encryptor.decrypt(property));
    }

    public static void main(String[] args) {
        encryptProperty("admin");
        encryptProperty("2020");
////        decryptedProperty("k3RYyeq2fYVQZzUrjpjDBR+8aQX0bsHy");
//
    }

}
