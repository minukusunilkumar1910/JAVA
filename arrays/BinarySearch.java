package arrays;

import java.util.Scanner;

public class BinarySearch {
   public static void main(String[] args)
    {
       int[] arr={0,1,1,2,3,6,8};
       int low=0;
       int high=arr.length;
       int mid;
       System.out.println("Enter the element to search");
       try (Scanner ip = new Scanner(System.in)) 
       {
         int target=ip.nextInt() ;
         
            while(low <= high)
            {
               mid =(low+high)/2;
               if(arr[mid] == target){
                  System.out.println("Element "+arr[mid]+" is found at "+mid+" Position");
               break;
               }
             
               else if(target > arr[mid])
               {
                 low =mid +1;
               }
               else if(target < arr[mid])
               {
                  high = mid-1;
               }
            }
      }
      }    
   }

