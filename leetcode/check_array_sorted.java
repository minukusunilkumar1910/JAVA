// package leetcode;
// import java.util.Scanner;

// public class check_array_sorted {
//    public static void main(String args[]){
//       int[] arr=new int[6];
//       Scanner sc=new Scanner(System.in);
//       System.out.println("Enter the array Elements");
//       for(int i=0;i<arr.length;i++)
//       {
//          arr[i]=sc.nextInt();
//       }
//       boolean result=sorted(arr);
//          if(result == true)
//          {
//             System.out.println("The array is sorted");
//          }      
//         else
//         {
//          System.out.println("The array is not sorted");
//         }

//    } 
//    static boolean sorted(int[] nums)
//    {
//       for(int i=1;i<nums.length;i++)
//       {
//          if(nums[i]>=nums[i-1])
//          {

//          }
//          else
//          {
//             return false;
//          }
//       }
//       return true;
//    } 
// }
public class check_array_sorted
{
   public static void main(String []args)
   {
      int[] arr={1,2,3,4,4,5,3};
      int n=arr.length;

     boolean result= sort(arr,n);
     System.out.println(result);

   }
   static boolean sort(int[] arr,int n)
   {
      for(int i=1;i<n;i++ )
      {
         if(arr[i-1]<=arr[i])
         {

         }
         else
         {
            return false;
         }
      }
      return true;
   }
}