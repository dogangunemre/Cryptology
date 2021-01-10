/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package des;

import java.util.Scanner;

/**
 *
 * @author EMRE
 */
public class DES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Metin Giriniz");
        Scanner girdi = new Scanner(System.in);
        String m = girdi.next();
        
       String text = m;
        System.out.println("Metin   : " + text);
        DESTest main = new DESTest();
        main.generateKey();
        String encoded = main.encode(text);
        System.out.println("Şifrelenmiş: " + encoded);
        main.saveKey();
        main.readKey();
        String decoded = main.decode(encoded);
        System.out.println("Çözülmüş: " + decoded);
    }
    }
    

