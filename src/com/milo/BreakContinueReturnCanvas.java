package com.milo;

import java.util.*;

public class BreakContinueReturnCanvas {
    public static void main(String[] args){
        Scanner inputUser;
        int a;

        inputUser = new Scanner(System.in);
        System.out.println("Value a:");
        a = inputUser.nextInt();

        for (int i = 1; i < a; i++) {
            System.out.println("Before Break Loop" + " ");
            if (i == 5)

                break; // terminate loop if i is 5
            System.out.println("After Break Loop: " + i);
        }

        System.out.println("Loop completed.");
        System.out.println("###############");

        for (int i = 1; i < a; i++) {
            System.out.println("Before Continue Loop" + " ");
            if (i == 5)

                continue; // terminate loop if i is 5
            System.out.println("After Continue Loop: " + i);
        }
        System.out.println("Loop completed.");
        System.out.println("###############");

        for (int i = 1; i < a; i++) {
            System.out.print(i + " ");
            if (i % 2 == 0)
                continue;
            System.out.println();
        }

        System.out.println("Loop completed.");
        System.out.println("###############");

        //outer loop
        for(int i=1;i<=3;i++){
            //inner loop
            for(int j=1;j<=3;j++){
                if(i==2&&j==2){
                    //using continue statement inside inner loop
                    continue;
                }
                System.out.println(i+" "+j);
            }
        }

        System.out.println("Loop completed.");
        System.out.println("###############");





    }
}
