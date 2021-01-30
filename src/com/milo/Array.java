package com.milo;

import java.util.*; //For Example no.8

public class Array {
    public static void main(String[] args) {

        //1. Default array values in Java
        String header1 = "1. Default array values in Java";
        System.out.println("\n"+header1);
        for (int i=0; i < 1; i++){
            for (int j=0; j < header1.length(); j++) {
                System.out.print("*");
            }
            System.out.printf("\n");
        }
        //End of Header

        System.out.println("String array default values:");
        String str[] = new String[5];
        for (String s : str)
            System.out.print(s + " ");

        System.out.println("\n\nInteger array default values:");
        int num[] = new int[5];
        for (int val : num)
            System.out.print(val + " ");

        System.out.println("\n\nDouble array default values:");
        double dnum[] = new double[5];
        for (double val : dnum)
            System.out.print(val + " ");

        System.out.println("\n\nBoolean array default values:");
        boolean bnum[] = new boolean[5];
        for (boolean val : bnum)
            System.out.print(val + " ");

        System.out.println("\n\nReference Array default values:");
        Array ademo[] = new Array[5];
        for (Array val : ademo)
            System.out.print(val + " ");





        //2. Accessing Java Array Elements
        String header2 = "2. Accessing Java Array Elements using for Loop";
        System.out.println("\n\n"+header2);
        for (int i=0; i < 1; i++){
            for (int j=0; j < header2.length(); j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        //End of Header

        int[] arrDemo = new int[2];
        arrDemo[0] = 10;
        arrDemo[1] = 20;

        for (int i = 0; i < arrDemo.length; i++)
            System.out.println(arrDemo[i]);





        //3. Accessing Java Array Elements using for Loop
        String header3 = "3. Accessing Java Array Elements using for Loop";
        System.out.println("\n\n"+header3);
        for (int i=0; i < 1; i++){
            for (int j=0; j < header3.length(); j++) {
                System.out.print("*");
            }
            System.out.printf("\n");
        }
        //End of Header

        // declares an Array of integers.
        int[] arrDemo1;

        // allocating memory for 5 integers.
        arrDemo1 = new int[5];

        // initialize the first elements of the array
        arrDemo1[0] = 10;

        // initialize the second elements of the array
        arrDemo1[1] = 20;

        //so on...
        arrDemo1[2] = 30;
        arrDemo1[3] = 40;
        arrDemo1[4] = 50;

        // accessing the elements of the specified array
        for (int i = 0; i < arrDemo1.length; i++)
            System.out.println("Element at index " + i +
                    " : "+ arrDemo1[i]);





        //4. Multidimensional Array
        String header4 = "4. Multidimensional Array";
        System.out.println("\n\n"+header4);
        for (int i=0; i < 1; i++){
            for (int j=0; j < header4.length(); j++) {
                System.out.print("*");
            }
            System.out.printf("\n");
        }
        //End of Header

        // declaring and initializing 2D array
        int arr[][] = { {2,7,9},{3,6,1},{7,4,2},{9,8,1}  };

        // printing 2D array
        for (int i=0; i< 4 ; i++)
        {
            for (int j=0; j < 3 ; j++)
                System.out.print(arr[i][j] + " ");

            System.out.println();
        }

        System.out.println(arr.length);





        //5. Another Multidimensional Array
        String header5 = "5. Another Multidimensional Array";
        System.out.println("\n\n"+header5);
        for (int i=0; i < 1; i++){
            for (int j=0; j < header5.length(); j++) {
                System.out.print("*");
            }
            System.out.printf("\n");
        }
        //End of Header

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print("arr[" + i + "][" + j + "] = " + arr[i][j] + " ");

            System.out.println();
        }





        //6. Three Dimensional Array
        String header6 = "6. Three Dimensional Array";
        System.out.println("\n\n"+header6);
        for (int i=0; i < 1; i++){
            for (int j=0; j < header6.length(); j++) {
                System.out.print("*");
            }
            System.out.printf("\n");
        }
        //End of Header

        int[][][] arr1 = new int[10][20][30];
        arr1[0][0][0] = 10;

        System.out.println("arr[0][0][0] = " + arr1[0][0][0]);

        System.out.println("\n**********************************\n");

        int[][][] arr2 = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };

        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                for (int z = 0; z < 2; z++)
                    System.out.println("arr[" + i
                            + "]["
                            + j + "]["
                            + z + "] = "
                            + arr2[i][j][z]);

        System.out.println("\n**********************************\n");

        int[][][] arr3 = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };

        System.out.println("arr[0][0][0] = " + arr3[0][1][0]);

        System.out.println("\n**********************************\n");

        int[][][] arr4 = { { { 1, 2 }, { 3, 4 } },
                { { 5, 6 }, { 7, 8 } } };

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 2; j++) {

                for (int k = 0; k < 2; k++) {

                    System.out.print(arr4[i][j][k] + " ");
                }

                System.out.println();
            }
            System.out.println();
        }





        //7. Jagged Array
        String header7 = "7. Jagged Array";
        System.out.println("\n\n"+header7);
        for (int i=0; i < 1; i++){
            for (int j=0; j < header7.length(); j++) {
                System.out.print("*");
            }
            System.out.printf("\n");
        }
        //End of Header

        int r = 5;

        // Declaring 2-D array with 5 rows
        int arr5[][] = new int[r][];

        // Creating a 2D array such that first row
        // has 1 element, second row has two
        // elements and so on.
        for (int i=0; i<arr5.length; i++)
            arr5[i] = new int[i+1];

        // Initializing array
        int count = 0;
        for (int i=0; i<arr5.length; i++)
            for(int j=0; j<arr5[i].length; j++)
                arr5[i][j] = count++;

        // Displaying the values of 2D Jagged array
        System.out.println("Contents of 2D Jagged Array");
        for (int i=0; i<arr5.length; i++)
        {
            for (int j=0; j<arr5[i].length; j++)
                System.out.print(arr5[i][j] + " ");
            System.out.println();
        }

        System.out.println("\n**********************************\n");

        // Declaring 2-D array with 2 rows
        int arr6[][] = new int[2][];

        // Making the above array Jagged

        // First row has 3 columns
        arr6[0] = new int[3];

        // Second row has 2 columns
        arr6[1] = new int[2];

        // Initializing array
        int count1 = 0;
        for (int i=0; i<arr6.length; i++)
            for(int j=0; j<arr6[i].length; j++)
                arr6[i][j] = count1++;

        // Displaying the values of 2D Jagged array
        System.out.println("Contents of 2D Jagged Array");
        for (int i=0; i<arr6.length; i++)
        {
            for (int j=0; j<arr6[i].length; j++)
                System.out.print(arr6[i][j] + " ");
            System.out.println();
        }





        //8. Convert Array to String
        String header8 = "8. Convert Array to String";
        System.out.println("\n\n"+header8);
        for (int i=0; i < 1; i++){
            for (int j=0; j < header8.length(); j++) {
                System.out.print("*");
            }
            System.out.printf("\n");
        }
        //End of Header

        // Let us create different types of arrays and
        // print their contents using Arrays.toString()
        boolean[] boolArr
                = new boolean[] { true, true, false, true };
        char[] charArr
                = new char[] { 'g', 'e', 'e', 'k', 's' };
        double[] dblArr
                = new double[] { 1, 2, 3, 4 };
        int[] intArr
                = new int[] { 1, 2, 3, 4 };
        Object[] objArr
                = new Object[] { 1, 2, 3, 4 };

        System.out.println(
                "Boolean Array: "
                        + Arrays.toString(boolArr));
        System.out.println(
                "Character Array: "
                        + Arrays.toString(charArr));
        System.out.println(
                "Double Array: "
                        + Arrays.toString(dblArr));
        System.out.println(
                "Integer Array: "
                        + Arrays.toString(intArr));
        System.out.println(
                "Object Array: "
                        + Arrays.toString(objArr));



        System.out.println("\n**********************************\n");



        System.out.println("**********************************");
        System.out.println("**********************************");

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars.length);
        // Outputs 4

        System.out.println("\nArray 2");

        String[] carsy = {"Volvo", "BMW", "Ford", "Mazda"};
        carsy[0] = "Opel";
        System.out.println(carsy[0]);
        // Now outputs Opel instead of Volvo

        int[] myNum = {10, 20, 30, 40};
        System.out.println("Array length: "+myNum.length);

        int[] myNum1 = new int[2];
        System.out.println("Array length: "+myNum1.length);


        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int i = 0; i < myNumbers.length; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);

            }

            System.out.println(myNumbers[i].length+ " Tmis");
        }

        System.out.println(myNumbers.length+ " Tjis");
    }
}
