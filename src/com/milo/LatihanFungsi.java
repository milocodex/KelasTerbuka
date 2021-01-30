// Topik 27

package com.milo;

import java.util.*;

public class LatihanFungsi {

    public static void main (String[] args){

        Scanner userInput = new Scanner(System.in);
        System.out.print("panjang = ");
        int inputPanjang = userInput.nextInt();
        System.out.print("lebar = ");
        int inputLebar = userInput.nextInt();

        gambar(inputPanjang, inputLebar);

        System.out.println("luas = " + luas(inputPanjang, inputLebar));
        System.out.println("keliling = " + keliling(inputPanjang, inputLebar));

        tampilkankelilingDanLuas(inputPanjang, inputLebar);
    }

    private static void tampilkankelilingDanLuas(int panjang, int lebar){
        System.out.println("luas 2.0 = " + luas(panjang, lebar));
        System.out.println("keliling 2.0 = " + keliling(panjang, lebar));
    }

    private static int luas(int panjang, int lebar){
        int hasil = panjang*lebar;
        System.out.print("1. Menghitung --> ");
        return hasil;
    }

    private static int keliling(int panjang, int lebar){
        int hasil = (panjang + lebar) * 2;
        System.out.print("2. Menghitung --> ");
        return hasil;
    }

    public static void gambar(int panjang, int lebar){
        for(int i = 0; i < lebar; i++){
            for(int j = 0; j < panjang; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }


}
