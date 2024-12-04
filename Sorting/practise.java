package Sorting;

import java.util.Arrays;



/* 
public class practise {
   public static void main(String[] args){
      int[] arr={1,2,3,4,5,6,7,8,9};
      int target =7;
      int low=0;
      int high=arr.length;
      int mid;
      for(int i=0;i<arr.length;i++){
         mid=(low+high)/2;
         if(arr[mid]==target){
         System.out.println((mid+1)+" position");
         break;
      
      }
         if(arr[mid] > target)
         {
         high =mid-1;
         }
         else if(arr[mid]<target)
         {
            low=mid+1;
         }
      }
   }
}
public class practise{
   public static void main(String[] args) { 
         int[] arr={5,4,3,2,1};
         
         sort(arr);
       for(Integer i:arr){
         System.out.print(i+" ");
       }
   }
   static void sort(int[] arr){
      for (int t=0;t<arr.length;t++){
        for(int i=0;i<arr.length-1;i++)
        {
         int temp =0;
         if(arr[i]>arr[i+1])
         {
            temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
         }
        }
      }
   }
}
public class practise{
   public static void main(String[] args)
   {
      int[] arr={-23,-1,-12,0,1,34,54};
     
      for(int i=0;i<arr.length;i++)
      {
         int minindex=i;
         for(int j=i;j<arr.length;j++)
         {
            if(arr[j]<arr[minindex])
            {
               minindex =j;
            }
         }
         int temp=arr[i];
         arr[i]=arr[minindex];
         arr[minindex]=temp; 
   }
         for(Integer r:arr){
            System.out.print(r+" ");
         }
      }

   }

public class practise{
   public static void main(String[] args) {
    int[] arr={5,44,-3,2,0,-1};
       insertion(arr);   
   }
   static void insertion(int[] arr)
   {
      for(int i=0;i<arr.length-1;i++)
      {
         for(int j=i+1;j>0;j--)
         {
              if(arr[j]<arr[j-1])
              {
               swap(arr,j);
              }
              else{
               break;
              }
         }
      }
      for(Integer r:arr){
         System.out.print(r+" ");
      }
   }
   static void swap(int[] arr,int j){
      int temp = arr[j];
      arr[j]=arr[j-1];
      arr[j-1]=temp;
   }
}*/
public class practise{
   public static void main(String[] args)
   {
      int[] arr ={5,4,3,2,1};
      sort(arr);
      System.out.println(Arrays.toString(arr)+"");
   }
   static void sort(int[] arr){
      int i=0;
      while(i< arr.length){
          int correct =arr[i]-1;
          if(arr[i] != arr[correct])
          {
            swap(arr,i,correct);
          }
          else{
            i++;
          }
         }
   }
   static void swap(int[] arr,int i,int correct){
      int temp= arr[i];
      arr[i]=arr[correct];
      arr[correct]=temp;
   }
}