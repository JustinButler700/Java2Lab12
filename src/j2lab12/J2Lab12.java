/*
 *  Name: Justin Butler
 *  Class: CSIS-123B-3439
 *  Prof. Johnson MSJC
 */
package j2lab12;

import java.util.Scanner;

public class J2Lab12
{
   public static int ones(int num, int count)
   {
      if(num !=0)
      {
         count =(num%2 != 0)? (++count): count;
         return(ones((num/2), count));// recursion within my code
      }
      else
         return count;
   }
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a number: ");
      int num = in.nextInt();
      System.out.println("There are "+ ones((num),0)+" one(s) in this binary string");
      System.out.println(num+" is "+Integer.toBinaryString(num)+" in binary");
   }
   
}
