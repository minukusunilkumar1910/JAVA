package arrays;

import java.util.Scanner;

public class linearsearch 
{
   public static void main(String[] args) 
   {
      int[] arr= new int[10];                                   // * input datatype[] arrayName = new dataType[size] 
       
      try (Scanner scanner = new Scanner(System.in)) {
         System.out.println("Enter the array element ");
         
          for(int i=0;i<arr.length;i++)
          {
            arr[i] =scanner.nextInt();
          }
      }
       int target =4;
      int result = lisearch(arr,target);
      
      if(result == -1){
         System.out.println("Element not found");
      }
      else{
         System.out.println("Element found at "+result+" position");
      }
   }
      static int lisearch(int[] arr,int target)
      {
         for(int i=0;i<arr.length;i++)
         {
           if(arr[i] == target)
           {
              return i;
           }
        
         }
         return -1;
      }
      
   }