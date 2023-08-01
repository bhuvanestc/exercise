package org.example;
import java.util.Arrays;

public class Array {
     public static void main(String args[])
     {/*ex:1*/
          int[] numbers = {11,23,39};
          for (int number : numbers)
          {
               System.out.println(number);
          }

          /*ex:2*/
          int[] num2 = {10, 30, 5, 8, 9};
          int element = 5;
          int index = indexOf(num2, element);
          if (index != -1)
          {
               System.out.println("Index position of number " + element + " is: " + index);
          }
          else
          {    System.out.println(element + " does not exist in the array.");

          }

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










