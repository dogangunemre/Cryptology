/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rsa;

import java.security.KeyPair;
import static rsa.Sifreleme.decrypt;
import static rsa.Sifreleme.encrypt;
import static rsa.Sifreleme.generateKeyPair;
import static rsa.Sifreleme.sign;
import static rsa.Sifreleme.verify;

/**
 *
 * @author EMRE
 */
public class RSA {

    /**
     * @param args the command line arguments
     */
        public static void main(String... argv) throws Exception {
      // İlk önce bir genel / özel anahtar çifti oluşturun
        KeyPair pair = generateKeyPair();
        
        // Gizli mesajımız
        String message = "evrenin ve her şeyin hayata cevabı";

        // Mesajı şifrele
        String cipherText = encrypt(message, pair.getPublic());
        
        // Şimdi şifresini çöz
        String decipheredMessage = decrypt(cipherText, pair.getPrivate());

        System.out.println(decipheredMessage);

        // Mesajımızı imzalayalım
        String signature = sign("foobar", pair.getPrivate());

        // imzayı kontrol edelim
        boolean isCorrect = verify("foobar", signature, pair.getPublic());
        System.out.println("İmza doğru: " + isCorrect);
    }
    
}
