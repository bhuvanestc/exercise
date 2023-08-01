package org.example;
import java.util.Arrays;

public class Array {
     public static void main(String args[])
     {/*ex:1*/
          int[] numbers = {11,23,39};
          System.out.println("ex:1");
          for (int number : numbers)
          {
               System.out.println(number);
          }
          /*ex:2*/
          int[] num2 = {10, 30, 5, 8, 9};
          int element = 5;
          int index = indexOf(num2, element);
          System.out.println("ex:2");
          if (index != -1)
          {
               System.out.println("Index position of number " + element + " is: " + index);
          }
          else
          {    System.out.println(element + " does not exist in the array.");

          }
          /*ex:3*/
          System.out.println("ex:3");
          String[] cities = {"Paris", "London", "New York", "Stockholm"};
          System.out.println("Array: " + Arrays.toString(cities));
          Arrays.sort(cities);
          System.out.println("Sorted Array: " + Arrays.toString(cities));
          /*ex:4*/
          int[] Array1 = {1, 15, 20};
          System.out.println("ex:4");
          int[] Array2 = new int[Array1.length];
          for (int i = 0; i < Array1.length; i++)
          {
               Array2[i] = Array1[i];
          }
          System.out.print("Elements from first array: ");
          for (int num : Array1)
          {
               System.out.print(num + " ");
          }
          System.out.println();
          System.out.print("Elements from second array: ");
          for (int num : Array2)
          {
               System.out.print(num + " ");
          }
          System.out.println();

          System.out.println("ex:5");
          String[][] countryandcity= new String[2][2];
          countryandcity[0][0] = "France";
          countryandcity[0][1] = "Paris";
          countryandcity[1][0] = "Sweden";
          countryandcity[1][1] = "Stockholm";


          for (int i = 0; i < 2; i++) {
               for (int j = 0; j < 2; j++) {
                    System.out.print(countryandcity[i][j] + " ");
               }
               System.out.println();
          }
          System.out.println("ex:6");
          int [] num6 ={43, 5, 23, 17, 2, 14 };
          int sum6= 0;
          for (int num : num6)
          {
               sum6 += num;
          }
          float average = (float) sum6 / num6.length;
          System.out.println("Average is: " + average);


     }

               public static int indexOf(int[] arr, int target)
               {
                    for (int i = 0; i < arr.length; i++)
                    {
                         if (arr[i] == target) {
                              return i;
                         }
                    }
                    return -1;
               }



     }










