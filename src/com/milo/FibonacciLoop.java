// Topik 23

package com.milo;

import java.util.*;

public class FibonacciLoop {

    public static void main(String[] args){
        // menghitung nilai deret fibonacci ke-n
        int f_n, f_n_1, f_n_2, fb_n, fb_n_1, fb_n_2, fc_n, fc_n_1, fc_n_2, n;

        Scanner inputUser = new Scanner(System.in);
        System.out.print("mengambil nilai fibonacci ke - :");
        n = inputUser.nextInt();

        f_n_2 = 0;
        f_n_1 = 1;
        f_n = 1;

        for(int i = 1; i <= n; i++){
            System.out.println("nilai ke - "+ i + " adalah " + f_n);
            f_n = f_n_1 + f_n_2; // 1 = 1 + 0
            f_n_2 = f_n_1; // 0 = 1 >> now f_n_2 = 1
            f_n_1 = f_n; // 1 = 1 >> now f_n_1 = 1

            //later then
            //f_n = f_n_1 + f_n_2;
            // 2 = 1 + 1
            //f_n_2 = f_n_1;
            // 1 = 1 >> now f_n_2 = 1
            //f_n_1 = f_n;
            // 1 = 2 >> now f_n_1 = 2

            //further then
            //f_n = f_n_1 + f_n_2;
            // 3 = 2 + 1
            //f_n_2 = f_n_1;
            // 1 = 2 >> now f_n_2 = 2
            //f_n_1 = f_n;
            // 2 = 3 >> now f_n_1 = 3
        }

        System.out.println("\nini adalah awal program Do While");

        int b = 1;
        fb_n_2 = 0;
        fb_n_1 = 1;
        fb_n = 1;

        do{

            System.out.println("nilai ke - "+ b + " adalah " + fb_n);
            fb_n = fb_n_1 + fb_n_2; // 1 = 1 + 0
            fb_n_2 = fb_n_1; // 0 = 1 >> now f_n_2 = 1
            fb_n_1 = fb_n;
            b++;

        }while(b <= n);
        System.out.println("ini adalah akhir program Do While");

        System.out.println("\nini adalah awal program While");

        int c = 1;
        fc_n_2 = 0;
        fc_n_1 = 1;
        fc_n = 1;

        while(c <= n){

            System.out.println("nilai ke - "+ c + " adalah " + fc_n);
            fc_n = fc_n_1 + fc_n_2; // 1 = 1 + 0
            fc_n_2 = fc_n_1; // 0 = 1 >> now f_n_2 = 1
            fc_n_1 = fc_n;
            c++;

        }
        System.out.println("ini adalah akhir program While");

    }
}
