package leetcode;
// import java.util.Scanner;

// public class jash {
//    public static void main(String[] args) {
//       int  a,b;
//       System.out.println("Enter the values");
//       Scanner ip=new Scanner(System.in);
//       a=ip.nextInt();
//       b=ip.nextInt();
//       System.out.println("the sum is "+(a+b));
//    }
// }
// import  java.util.Scanner;

// import java.util.Scanner;

// public class jash {
//    public static void main(String[] args) {
//      double pi=3.14;
     
//      System.out.println("enter r value");
//      Scanner ip=new Scanner(System.in);
//      double r=ip.nextInt();
//      double a=pi*r*r;
//       System.out.println("the area of circle is"+a);

//    }
//  }

// 
//a+b a-b a*b a/b a**b a%b a++ a--

//even or odd
// import java.util.Scanner;
// public class jash{
//      public static void main(String[] args) {
//       int n;
//       System.err.println("enter the n value");
//       Scanner ip=new Scanner(System.in);
//       n=ip.nextInt();
//       if( n%2==0)  
//       {
//          System.out.println("numer is even");  
//       }
//       else {
//          System.out.println("number is odd");
//       }
//      }
 

// }

// import java.util.Scanner;

// public class jash{
//    public static void main(String[] args) {
//       int a,b;
//       System.out.println("enter a,b values");
//       Scanner ip=new Scanner(System.in);
//       a=ip.nextInt();
//       b=ip.nextInt();
//       if( a>b)
//       {
//          System.out.println("a is big  ");
//       }
//        if( a==b)
//       {
//          System.out.println(" both are equal");
//       }
//        else{
//          System.out.println(" b is big  ");
//        }
//    }
// }

// import java.util.Scanner;

// public class jash {

//    public static void main(String[] args) {
//       int[] arr={11,12,14,15,24};
//       int target;
//        System.out.println("Enter the element to search");
//        Scanner ip = new Scanner(System.in);
       
//          target=ip.nextInt() ;
//       int found=0;
   



      
//       int low=0;
//       int high=arr.length-1;
//       int mid;
//       while(low<=high)
//       {
//           mid=(low+high)/2;
//          if(arr[mid]==target)
//          {
//             found=1;
//             System.out.println("Target found at "+(mid+1));
//             break;
//          }
//          else if(target<arr[mid])
//          {
//             high=mid-1;
//          }
//          else if(target>arr[mid])
//          {
//             low=mid+1;
//          }
//       }
//       if(found==0)
//       {
//          System.out.println("Target not found");
//       }
//    }
// }

public class jash {

   public static void main(String[] args) {
       //pos neg
//        int num=5;
//        if (num<0)
//        {
//            System.out.println("num is negitive");
//        }
//         else {
//             System.out.println(" num is positive ");
//        }
        // even/odd
//        int num=12;
//        if(num%2==0){
//            System.out.println("num is even");

//    }

        //         else{
//            System.out.println("num is odd");
//        }
        //range n natural numbers
//        int first = 5;
//        int last = 10;
//        int sum = 0;
//        for (int i = first; i < last; i++)
//        {
//            sum = sum + i;
//        }
//        System.out.println(sum);

        //biggest of 2




//         int a=10;
//         int b=13;
//        if(a>b)
//        {
//            System.out.println("a is big");
//        }
//        else{
//            System.out.println("b is big");
//        }




      //   //biggest of three numbers
      //    int a=445;
      //    int b=66;
      //    int c=77;
      //   if (a>b)
      //    {
      //        if(a>c)
      //        {
      //          System.out.println("a is big");
      //        }
      //        else
      //        {
      //          System.out.println("c is big");
      //        }
      //    }
      //    else if(b>c)
      //    {
      //       System.out.println("b is big");
      //    }
      //    else
      //    {
      //       System.out.println("c is big");
      //    }
                // biggest of three
        
         // int a=999;
         // int b=444;
         // int c=888;
         // if(a>b)
         // {
         //     if(a>c)
         //     {
         //       System.out.println("a is big");
         //     }
         //     else{
         //       System.out.println("c is big");
         //     }
         // }
         // else if(b>c)
         // {
         //    System.out.println("b is big");
         // }
         // else
         // {
         //    System.out.println("c is big");
         // }
         //leap year
         
              int year=2006;
              if(year%400==0)
              {
               System.out.println("leap year");
              }
              else if(year%4==0&&year%100!=0)
              {
               System.out.println("leap year");
              }
              else
              {
               System.out.println("not a leap year");
              } 

   }
}