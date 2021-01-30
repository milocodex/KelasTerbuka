// Topik 18

package com.milo;

import java.util.*;

public class KalkulatorSwitchCase {

    public static void main(String[] args){

        Scanner inputUser;
        float a,b,hasil;
        String operator;

        inputUser = new Scanner(System.in);

        System.out.print("nilai a = ");
        a = inputUser.nextFloat();
        System.out.print("operator = ");
        operator = inputUser.next();
        System.out.print("nilai b = ");
        b = inputUser.nextFloat();

        switch(operator){
            case "+":
                hasil = a + b;
                System.out.println("Hasil = " + hasil);
                //penjumlahan
                break;
            case "-":
                hasil = a - b;
                System.out.println("Hasil = " + hasil);
                //pengurangan
                break;
            case "*":
                hasil = a * b;
                System.out.println("Hasil = " + hasil);
                //perkalian
                break;
            case "/":
                hasil = a / b;
                System.out.println("Hasil = " + hasil);
                //pembagian
                break;
        }

    }
}
