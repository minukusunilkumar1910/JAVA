package Sorting;
/*
import java.util.Arrays;
import java.util.Scanner;

public class bubblesort{
   public static void main(String[] args)
   {
      int[] arr={53,34,13,21,14};
      swap(arr);
      for(Integer i:arr){
         System.err.println(i+"");
      }
   }
   static void swap(int[] arr){
      int n=arr.length;
      for(int t=0;t<n;t++){
         for(int i=0;i<n-1;i++){
            int curr=arr[i];
            int next=arr[i+1];
            if(curr>next){
               swap(i,arr);
            }
         }
      }
   }
   static void swap(int i,int[] arr){
      int temp=arr[i];
      arr[i]=arr[i+1];
      arr[i+1]=temp;
   }

}
public class bubblesort{
   public static void main(String[] args)
   {
   int[] arr={5,4,3,2,1};                                   // 5  4  3  2  1     i=0
   sort(arr);                                              //  curr=5   next=4
   for(Integer i:arr){                                    //   4  5  3  2  1     i=1
      System.out.print(i+" ");                           //    4  3  5  2  1     i=2 
   }                                                 //AtLast  4  3  2  1  5

   }                                                  // we have to run this for n times i.e [turns].
   static void sort(int[] arr)
   {
   for(int turns=0;turns<arr.length;turns++)
   {
      for(int i=0;i<arr.length-1-turns;i++)               
      {
       int curr=arr[i];
       int next=arr[i+1];
       if(curr>next)
       {
         swap(i,arr);
       }
      }
   }
   }
   static void swap(int i,int[] arr)
   {
      int temp=arr[i];
      arr[i]=arr[i+1];
      arr[i+1]=temp;
   }
}  
     
public class bubblesort{                               //IMPORTANT ONE WITH EFFECTIVE TIME AND SPACE COMPLEXITY
   public static void main(String[] args)
   {
       int[] arr = new int[5];
       System.out.println("Enter then Array elements");
      Scanner sc =new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
         arr[i]=sc.nextInt();
        }
       bubble(arr);
       System.out.println(Arrays.toString(arr));
   

   } 

   static void bubble(int[] arr)
   {
   boolean swapped;                                         //to reduce the time complexity
      for(int i=0;i<arr.length;i++)
      {
       swapped =false;
         for(int j=1;j<arr.length-i;j++)
         {
            if(arr[j]<arr[j-1])
            {
               int temp =arr[j];
               arr[j]=arr[j-1];
               arr[j-1]=temp;
               swapped =true;
            }
         }
         if(!swapped){                              // break condition
            break;
         }
      }
   }
}
*/