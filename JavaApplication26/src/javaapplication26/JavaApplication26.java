/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication26;

import java.util.Scanner;

/**
 *
 * @author EMRE
 */
public class JavaApplication26 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) 
{

    System.out.println("secretKeyi Giriniz");
    Scanner girdi = new Scanner(System.in);
    String key = girdi.next();
    final String secretKey = key;
    
    System.out.println("OrjinalStringi Giriniz");
    
    String orjinal = girdi.next();
    
    String originalString = orjinal;
    String encryptedString = AES.encrypt(originalString, secretKey) ;
    String decryptedString = AES.decrypt(encryptedString, secretKey) ;
     
    System.out.println("orjinal String:"+originalString);
    System.out.println("Şifrelenmiş String:"+encryptedString);
    System.out.println("Çözülmüş String:"+decryptedString);
}
    
}
