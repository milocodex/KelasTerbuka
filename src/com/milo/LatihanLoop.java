// Topik 22

package com.milo;

import java.util.*;

public class LatihanLoop {

    public static void main (String[] args){
        // Program untuk menjumlahakan angka dengan rentang

        int nilaiAwal, nilaiAkhir, total;

        Scanner inputUser = new Scanner(System.in);
        System.out.print("Masukkan nilai awal = ");
        nilaiAwal = inputUser.nextInt();
        System.out.print("Masukkan nilai akhir = ");
        nilaiAkhir = inputUser.nextInt();

        total = 0;

        while (nilaiAwal <= nilaiAkhir) {
            total += nilaiAwal; // total = total + nilaiAwal;

            System.out.println("ditambah " + nilaiAwal + " menjadi " + total);

            nilaiAwal++;
        }

        Scanner inputUser1 = new Scanner(System.in);
        System.out.print("Masukkan nilai awal = ");
        nilaiAwal = inputUser1.nextInt();
        System.out.print("Masukkan nilai akhir = ");
        nilaiAkhir = inputUser1.nextInt();

        System.out.println("\nini adalah awal program Do While");

        do {

            total += nilaiAwal;
            System.out.println("ditambah " + nilaiAwal + " menjadi " + total);
            nilaiAwal++;

        }while(nilaiAwal <= nilaiAkhir);

        System.out.println("ini adalah akhir program Do While");

        Scanner inputUser2 = new Scanner(System.in);
        System.out.print("Masukkan nilai awal = ");
        nilaiAwal = inputUser2.nextInt();
        System.out.print("Masukkan nilai akhir = ");
        nilaiAkhir = inputUser2.nextInt();

        System.out.println("\nini adalah awal program For Loop");

        for (total = 0; nilaiAwal <= nilaiAkhir; nilaiAwal++){

            total += nilaiAwal;
            System.out.println("ditambah " + nilaiAwal + " menjadi " + total);

        }

        System.out.println("ini adalah akhir program For Loop");

    }
}
