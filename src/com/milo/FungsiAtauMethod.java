// Topik 25

package com.milo;

import java.sql.SQLOutput;

public class FungsiAtauMethod {

    public static void main (String[] args) {
        //y = (x + 2) * x

        int y,x;
        x = 5;
        y = hitung(x);

        System.out.println("x = " + x + ", y = " + y);

        x = 20;
        y = hitung(x);

        System.out.println("x = " + x + ", y = " + y);

        x = 40;
        y = hitung(x);

        System.out.println("x = " + x + ", y = " + y);

    }

    private static int hitung(int input){ //guna public/private sama tapi di oop akan berbeza penggunaan public/private
        int hasil;
        //hasil = (input + 2) * input;
        hasil = (input+2) * input;

        return hasil;
    }
}
