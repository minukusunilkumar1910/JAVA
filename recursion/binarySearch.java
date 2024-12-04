package recursion;

public class binarySearch {
   public static void main(String[] args) {
       
   
   int[] arr={1,2,3,4,5,66,78};
   int target =78;

   int result=Search(arr,target,0,arr.length-1);
       System.out.println(result+"");
   }
   static int Search(int[] arr,int target,int low,int high)
   {
      if(low > high)
      {
         return -1;
      }
      int mid =(low +high)/2;
      if(arr[mid]==target)
      {
         return mid;
      }
      if(arr[mid]>target)
      {
         return Search(arr,target,low,high-1);
      }
      return Search(arr,target,low+1,high);

   }
}
