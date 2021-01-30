// Topik 26

package com.milo;

public class FungsiAtauMethodVoid {

    public static void main (String[] args){
        // void itu ertinya hampa

        System.out.println(simple());

        fungsiVoid("apa pun");

        selamatPagi("ibu");
        selamatPagi("abah");


    }

    // ini fungsi atau method dengan kembalian
    // sehingga menggunakan return untuk
    // mengembalikan nilainya (10.0f)
    private static float simple(){
        return 10.0f;
    }

    // fungsi atau method tanpa kembalian
    private static void fungsiVoid(String input){
        System.out.println(input);
    }

    private static void selamatPagi(String nama){
        System.out.println("selamat pagi " + nama);
    }
}
