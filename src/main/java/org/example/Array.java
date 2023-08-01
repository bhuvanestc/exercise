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
          for (int num : Array1) {
               System.out.print(num + " ");
          }
          System.out.println();
          System.out.print("Elements from second array: ");
          for (int num : Array2) {
               System.out.print(num + " ");
          }
          System.out.println();

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










