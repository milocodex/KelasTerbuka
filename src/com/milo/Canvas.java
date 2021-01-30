package com.milo;

public class Canvas {
    public static void main(String[] args){

        int[] arrDemo = new int[3];

        arrDemo[0] = 400; //Override Element
        arrDemo[2] = 204; //Override Element

        System.out.println("Display Array - For loop");

        for (int i = 0; i < arrDemo.length; i++)
            System.out.println(arrDemo[i]);

        System.out.println("Display Array - For Each Loop");

        for (int i: arrDemo){
            System.out.println(i);
        }

        System.out.println("Display Array - Each");

        System.out.println(arrDemo[0]);
        System.out.println(arrDemo[1]);
        System.out.println(arrDemo[2]);

        System.out.println("Display Array Length");

        System.out.println(arrDemo.length);

        System.out.println("\n*********************************");
        System.out.println("**********multidimension*********");
        System.out.println("*********************************\n");

        //int[][] arrDem = new int[2][3];
        int[][] arrDem = {{1,2,3},{4,5,6}};

        arrDem[0][0] = 1; //Override Element
        arrDem[0][1] = 2; //Override Element
        arrDem[0][2] = 3; //Override Element

        arrDem[1][0] = 4; //Override Element
        arrDem[1][1] = 5; //Override Element
        arrDem[1][2] = 6; //Override Element

        System.out.println("Display Array - For loop");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print("arrDem[" + i + "][" + j + "] = " + arrDem[i][j] + " ");

            System.out.println();
        }

        System.out.println("Display Array - Each");

        System.out.print(arrDem[0][0]);
        System.out.print(arrDem[0][1]);
        System.out.println(arrDem[0][2]);
        System.out.print(arrDem[1][0]);
        System.out.print(arrDem[1][1]);
        System.out.println(arrDem[1][2]);

        System.out.println("Display Array Length");

        System.out.println(arrDem.length);
        System.out.println(arrDem[0].length);
        System.out.println(arrDem[2].length);

        System.out.println("\n*********************************");
        System.out.println("**********threedimension*********");
        System.out.println("*********************************\n");

        //int[][][] arrDe = new int[2][2][3];
        int[][][] arrDe = {{{ 1, 2, 3 }, { 4, 5, 6 }}, {{ 7, 8, 9 }, { 10, 11, 12 }}};

            //z[0]x[0]y[0]
        arrDe[0][0][0] = 1; //Override Element
        arrDe[0][0][1] = 2; //Override Element
        arrDe[0][0][2] = 3; //Override Element

        arrDe[0][1][0] = 4; //Override Element
        arrDe[0][1][1] = 5; //Override Element
        arrDe[0][1][2] = 6; //Override Element

        //z[1]x[1]y[0]
        arrDe[1][0][0] = 7; //Override Element
        arrDe[1][0][1] = 8; //Override Element
        arrDe[1][0][2] = 9; //Override Element

        arrDe[1][1][0] = 10; //Override Element
        arrDe[1][1][1] = 11; //Override Element
        arrDe[1][1][2] = 12; //Override Element

        System.out.println("Display Array - For loop");

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 2; j++) {

                for (int k = 0; k < 3; k++) {

                    System.out.print(arrDe[i][j][k] + " ");
                }

                System.out.println();
            }
            System.out.println();
        }

        System.out.println("Display Array - Each");

        System.out.print(arrDe[0][0][0]);
        System.out.print(arrDe[0][0][1]);
        System.out.println(arrDe[0][0][2]);

        System.out.print(arrDe[0][1][0]);
        System.out.print(arrDe[0][1][1]);
        System.out.println(arrDe[1][1][2]);

        System.out.print(arrDe[1][0][0]);
        System.out.print(arrDe[1][0][1]);
        System.out.println(arrDe[1][0][2]);

        System.out.print(arrDe[1][1][0]);
        System.out.print(arrDe[1][1][1]);
        System.out.println(arrDe[1][1][2]);

        System.out.println("Display Array Length");

        System.out.println(arrDe.length);
    }
}
