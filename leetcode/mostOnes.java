package leetcode;
// public class mostOnes {
//    public static void main(String args[])
//    {
//       int[] arr={1,0,1,1,0,1};
//       int maxi=0;
//       int count=0;
//       int n=arr.length;
//       for(int i=0;i<n;i++)
//       {
//           if(arr[i]==1)
//          {
//             count =count+1;
            
//             if(maxi<count)
//             {
//              maxi=count;
//             }
             
//          }
//          else if(arr[i]==0)
//          {
//            count=0;
           
//          }
//       }
//       System.out.println(maxi);
//    }
   
// }

public class mostOnes {

   public static void main(String[] args) {
      int[] arr={1,1,1,1,1,10,0,1,1,0,1,1,1,1,1,1,1,1,1,0,0};
      int n=arr.length;
      int count =0;int max=0;
      for(int i=0;i<n;i++)
      {
         if(arr[i]==1)
         {
            count++;
            if(count>max)
            {
               max=count;
            }
         }
         else if(arr[i]==0)
         {
            count=0;
         }
      }
      System.out.println(max);
   }
}