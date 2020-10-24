import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ENDANG
 */
public class testhitung {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
            
            int Penjumlahan;
            double Pengurangan;
            int Perkalian;
            double Pembagian;
            
            hitung hitung = new hitung();
                
            System.out.println("=== Penjumlahan ===");
            System.out.println("masukkan nilai ; ");
            Penjumlahan = hitung.getPenjumlahan(userInput.nextInt(),userInput.nextInt());
            System.out.println("hasil penjumlahan adalah"+ Penjumlahan);
            
            System.out.println("=== Pengurangan ===");
            System.out.println("masukkan nilai ; ");
            Pengurangan = hitung.getPengurangan(userInput.nextInt(),userInput.nextInt());
            System.out.println("hasil pengurangan adalah"+ Pengurangan);
            
            System.out.println("=== Perkalian ===");
            System.out.println("masukkan nilai ; ");
            Perkalian = hitung.getPerkalian(userInput.nextInt(),userInput.nextInt());
            System.out.println("hasil perkalian adalah"+ Perkalian);
            
            System.out.println("=== Pembagian ===");
            System.out.println("masukkan nilai ; ");
            Pembagian = hitung.getPembagian(userInput.nextInt(),userInput.nextInt());
            System.out.println("hasil pembagian adalah"+ Pembagian);
    }
}