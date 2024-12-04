package leetcode;
 

//  public class largest{
//    public static void main(String args[])
//    {
//       int[] arr={1,2,3,5};
//       int n=arr.length;
//       for(int i=1;i<n;i++)
//       {
//          int flag=0;
//          for(int j=0;j<n;j++)
//          {
//             if(arr[j]==i)
//             {
//                flag=1;
              
//                System.out.println(j);
               
//             }
//          }
//          if(flag==0)
//          {
//             System.out.println("no missing element");
//          }
//       }
//    } 
//  }

// public class largest {
//     public static int missingNumber(int []a, int N) {

//         // Outer loop that runs from 1 to N:
//         for (int i = 1; i <= N; i++) {

//             // flag variable to check
//             //if an element exists
//             int flag = 0;

//             //Search the element using linear search:
//             for (int j = 0; j < N - 1; j++) {
//                 if (a[j] == i) {

//                     // i is present in the array:
//                     flag = 1;
//                     break;
//                 }
//             }

//             // check if the element is missing
//             //i.e flag == 0:

//             if (flag == 0) return i;
//         }

//         // The following line will never execute.
//         // It is just to avoid warnings.
//         return -1;
//     }

//     public static void main(String args[]) {
//         int N = 5;
//         int a[] = {1, 2, 4, 5};

//         int ans = missingNumber(a, N);
//         System.out.println("The missing number is: " + ans);
//     }

// }
// public class missingNum {

//     public static void main(String args[])
//     {
// //         int[] arr={1,2,4,5};
// //         int n=5;
// //         int sum=n*(n+1)/2;
// //         int s2=0;
// //         for(int i=0;i<n-1;i++)
// //         {
// //             s2=s2+arr[i];

// //         } 
// //         System.out.println(sum-s2);
//       int[] arr={1,2,3,5};
//       int n=5;
//       int sum=n*(n+1)/2;//1+2+3+4+5=15
//       int s2=0;
//       for(int i=0;i<n-1;i++)
//       {
//         s2=s2+arr[i];//1+2+3+5=11

//       }
//       System.out.println(sum-s2);//15-11=4
//     }
// }

// practise


public class missingNum {
public static void main(String[] args) {
  int[] arr={1,2,3,5};
  int n=5;
  int sum=0;
  int s2=0;
  sum=n*(n+1)/2;
  for(int i=0;i<arr.length;i++)
  {
    s2 =s2+arr[i];
  }
 int result=sum-s2;
 System.out.println(result);
}
}