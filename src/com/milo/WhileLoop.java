// Topik 19

package com.milo;

public class WhileLoop {

    public static void main (String[] args){


//        while (kondisi) {
//            aksi
//        }

        int a = 0;
        boolean kondisi = true;

        System.out.println("awal program");

        while (kondisi) {
            System.out.println("while loop ke-" + a);

            //a++; maka keluar sampai 10 (0 - 9)

            if (a == 10){
                kondisi = false;
            }

            a++; //a++; maka keluar sampai 1 (0 - 10)
        }

        System.out.println("akhir program");

    }
}
