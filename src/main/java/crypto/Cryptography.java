package crypto;

import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import java.security.spec.KeySpec;

public class Cryptography {

    private static final String UNICODE_FORMAT = "UTF-8";
    public static final String DESEDE_ENCRYPTION_SCHEME = "DESede";

    public static String encrypt(String text, String secretKey) {
        String encryptedString = null;
        try {
            var arrayBytes = secretKey.getBytes(UNICODE_FORMAT);
            KeySpec ks = new DESedeKeySpec(arrayBytes);
            var skf = SecretKeyFactory.getInstance(DESEDE_ENCRYPTION_SCHEME);
            var cipher = Cipher.getInstance(DESEDE_ENCRYPTION_SCHEME);
            var key = skf.generateSecret(ks);

            cipher.init(Cipher.ENCRYPT_MODE, key);
            byte[] plainText = text.getBytes(UNICODE_FORMAT);
            byte[] encryptedText = cipher.doFinal(plainText);
            //encryptedString = new String(Base64.encodeBase64(encryptedText));
            encryptedString = new String(Base64.getEncoder().encode(encryptedText));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return encryptedString;
    }

    public static String decrypt(String encryptText, String secretKey) {
        String decryptedText=null;
        try {
            var arrayBytes = secretKey.getBytes(UNICODE_FORMAT);
            var ks = new DESedeKeySpec(arrayBytes);
            var skf = SecretKeyFactory.getInstance(DESEDE_ENCRYPTION_SCHEME);
            var cipher = Cipher.getInstance(DESEDE_ENCRYPTION_SCHEME);
            var key = skf.generateSecret(ks);

            cipher.init(Cipher.DECRYPT_MODE, key);
            //byte[] encryptedText = Base64.decodeBase64(encryptText);
            byte[] encryptedText = Base64.getDecoder().decode(encryptText);
            byte[] plainText = cipher.doFinal(encryptedText);
            decryptedText= new String(plainText);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return decryptedText;
    }
}
