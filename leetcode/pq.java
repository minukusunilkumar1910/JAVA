package leetcode;
// public class pq {
  
//    public static void main(String []args)
//    {
//       int[] arr= {-9,-7,-5,0,-1,-2};
//       int n=arr.length;

//      int result= sort(arr,n);
//      System.out.println(result);

//    }
//     static int sort(int[] arr,int n)
//     {
//       int large=arr[0];
//       int seclarge=-1;
//       for(int i=0;i<n;i++)
//       {
//          if(arr[i]>large)
//          {
//            seclarge=large;
//            large=arr[i];
//          }
//          else if(arr[i]<large&&arr[i]>seclarge)
//          {
//             seclarge=arr[i];
//          }
//       }
//       return seclarge;
//     }
// }

 
public class pq {

   public static void main(String[] args) {
      int[] arr = {1, 1, 2, 2, 3, 3, 3, 4, 4, 4};
      int n = arr.length;

      int[] result = sort(arr, n);
      
      // Print the resulting array
      for (int i = 0; i < result.length; i++) {
         System.out.print(result[i] + " ");
      }
   }

   static int[] sort(int[] arr, int n) {
      int i = 0;
      for (int j = 1; j < n; j++) {
         if (arr[j] != arr[i]) {
            i++;
            arr[i] = arr[j];
         }
      }
      
      // Return the array of unique elements only
      int[] result = new int[i + 1];
      for (int k = 0; k <= i; k++) {
         result[k] = arr[k];
      }
      return result;
   }
}
