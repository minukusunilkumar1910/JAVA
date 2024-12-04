package leetcode;

// public class seclarg 
// {

//    public static void main(String[] args) 
//    {
//       int[] arr =new int[6];
//       int n=arr.length;
//       System.out.println("Enter the array Elements");
//       Scanner sc=new Scanner(System.in);
//        for(int i=0;i<n;i++)
//        {                                                     //TIME COMPLEXITY IS   O(nlogn)+O(n)
//          arr[i]=sc.nextInt();
//        }
       
//       int large=arr[0];
//        int seclarg=-1;
//        for(int t=0;t<n;t++){
//          for(int i=0;i<n-1;i++)
//          {
//             if(arr[i]>arr[i+1]){
//                int temp=arr[i];
//                arr[i]=arr[i+1];
//                arr[i+1]=temp;
//             }
//          }
         
//        for(int i=n-2;i>0;i--)
//        {
//          if(arr[i]!=large)
//          {
//             seclarg=arr[i];
//             break;
//          }
//        }
//       }
//        System.out.println("large is"+large);
//        System.out.println("seclarg"+seclarg);
  
//  }
// }
// public class seclarg {
//    public static void main(String[] args) {
//       int[] arr={1,2,4,7,7,5};
//       int n=arr.length;
//       int large=arr[0];
//       int seclarge=-1;
//       for(int i=0;i<n;i++)
//       {
//          if(arr[i]>large)
//          {
//             large=arr[i];
//          }
//       } 
//       for(int i=0;i<n;i++)
//       {
//          if(arr[i]>seclarge&&arr[i]!=large)
//          {
//             seclarge=arr[i];
            
//          }
//       }
//       System.out.println(large);
//       System.out.println(seclarge);
//    }
// }
// public class seclarg
// {
//    public static void main(String args[])
//    {
//       int[] arr={-9,-7,-5,0,-1,-2};
//       int n=arr.length;
//       int large=arr[0];
//       int seclarge=-1;
//       for(int i=0;i<n;i++)
//       {
//          if(arr[i]>large)
//          {
//             seclarge=large;
//             large=arr[i];
//          }
//          else if(arr[i]<large && arr[i]>seclarge)
//             {
//                seclarge=arr[i];
//             }
//       }
//       System.out.println(large);
//       System.out.println(seclarge);
//    }
// }
    


