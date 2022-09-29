/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operator;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class Operator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pilih;
        double total = 0;
        //membuat scanner baru
        Scanner input = new Scanner(System.in);
        //output pilihan operator
        System.out.println("KALKULATOR SEDERHANA");
        System.out.println("1. Penjumlahan");
        System.out.println("2.Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. pembagian");
        System.out.println("5. Modulus");
        //pilihan operator
        System.out.println("masukkan pilihan anda :");
        pilih = input.nextInt();
        //memasukkan angka
        System.out.print("Masukkan angka 1 =");
        int angka1 = input.nextInt();
        System.out.print("Masukkan angka 2 =");
        int angka2 = input.nextInt();
        //percabangan
        switch (pilih) {
            case 1:
                System.out.println(+angka1 + "+" + angka2);
                total = angka1 + angka2;
                break;
            case 2:
                System.out.println(+angka1 + "-" + angka2);
                total = angka1 - angka2;
                break;
            case 3:
                System.out.println(+angka1 + "*" + angka2);
                total = angka1 * angka2;
                break;
            case 4:
                System.out.println(+angka1 + "/" + angka2);
                total = angka1 / angka2;
                break;
            case 5:
                System.out.println(+angka1 + "%" + angka2);
                total = angka1 % angka2;
                break;
            default:
                System.out.println("operator yang anda masukkan salah");
                break;
        }
        System.out.println("hasilnya = " + total);
    }
}
