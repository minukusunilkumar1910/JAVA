package leetcode;



public class count0s1s2s {

   public static void main(String args[])
   {
      int[] arr={0,0,1,0,1,2,2,1};

      int n=arr.length;
      int c0=0;
      int c1=1;
      int c2=2;

      for(int i=0;i<n;i++)
      {
         if(arr[i]==0)
         {
            c0++;
         }
         else if(arr[i]==1)
         {
            c1++;
         }
         else
         {
          c2++;
         }
      }
         for(int i = 0;i < c0; i++)
         {
               System.out.println(arr[i]);
         }
         for(int i = c0;i < c0+c1; i++)
         {
               System.out.println(arr[i]);
         }
         for(int i = c0+c1;i < n; i++)
         {
               System.out.println(arr[i]);
         }
         
         
      }
   
}