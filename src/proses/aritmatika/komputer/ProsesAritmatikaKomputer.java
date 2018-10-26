/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proses.aritmatika.komputer;

import java.util.Scanner;

/**
 *
 * @author yongki
 */
public class ProsesAritmatikaKomputer {

    public static void main(String[] args) {
        Aritmatika ar = new Aritmatika();
        Scanner in1 = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        
        
        System.out.print("Masukkan Angka Pertama : ");
        ar.setDes1(in1.nextInt());
        System.out.print("Masukkan Angka Kedua : ");
        ar.setDes2(in2.nextInt());
        System.out.println("");
        ar.jadiBinary();
        
    }

}
