/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10118045latihan27hurufbesarkecil;

import java.util.Scanner;

/**
 *
  * @author 
 * Nama     :   Muhammad Ilham Apriyadi
 * Kelas    :   IF 2
 * NIM      :   10118045
 * Deskripsi Program : program huruf besar & huruf kecil
 */
public class PBO10118045Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String kalimat;
        System.out.print("Masukkan Kalimat : ");
        Scanner scanner = new Scanner(System.in);
        kalimat = scanner.next();
        System.out.println("");
        System.out.println("==== Hasil Formatting ====");
        System.out.println("huruf Besar : "+kalimat.toUpperCase());
        System.out.println("Huruf Kecel : "+kalimat.toLowerCase());
        
        
    }
    
}
