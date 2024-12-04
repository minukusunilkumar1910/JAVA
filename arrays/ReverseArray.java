package arrays;

public class ReverseArray {
   public static void main(String[] args)
    {
       int[] arr={1,3,5,2,4};
       int temp;
   
   
       for(int i=0;i<=arr.length/2;i++)
       {
         int n= arr.length;
          temp =arr[i];
          arr[i]=arr[n-i-1];
          arr[n-i-1]=temp;
        }
      
       for (int r = 0; r < arr.length; r++) {
         System.out.print(arr[r]+" ");
           
       }
   }
}
