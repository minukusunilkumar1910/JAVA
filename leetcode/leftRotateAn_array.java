package leetcode;
// public class leftRotateAn_array {
//    public static void main(String[] args) {
//       int[] arr={1,2,3,4,5};
//       int temp=arr[0];
//       for(int i=1;i<arr.length;i++)
//       {
//            arr[i-1]=arr[i];    
//       }
//           arr[arr.length-1]=temp;
          
//      for(int j=0;j<arr.length;j++)
//      {
//       System.out.println(arr[j]);
//      }
//    }
// }



// public class leftRotateAn_array {
//       public static void main(String[] args) {
//          int[] arr={1,2,3,4,5,6,7};
//          int n=arr.length;
//          int start=arr[0];
//          int end=arr[n-1];
//          while(start <= end)
//          {
//             int temp = arr[start];
//             arr[start]=arr[end];
//             arr[end] = temp;
//             start++;
//             end--;
//          }
//       }
//    }
 
public class leftRotateAn_array {
 public static void main(String args[])
{
    int[] arr={1,2,3,4,5} ;
    int n=arr.length;
      int temp=arr[0];
    for(int i=1;i<n;i++)
  {
    arr[i-1]=arr[i];

   }   
   arr[n-1]=temp;
   for(int j=0;j<n;j++)
   {
      System.out.print(arr[j]+" ");
   }
 }
}
