//  package practise;
//  {
//    System.out.println("HEllo Java");
//    {
//       Scanner sc=new Scanner(System.in);
//       int a,b;
//      System.out.println("Enter a value");
//      a=sc.nextInt();
//      System.out.println("Enter b value");
//      b=sc.nextInt();
//     int c=a+b;
//     System.out.println("the sum of two numbers is "+c);
//    }
// }
// public class practise {
//  public static void main(String[] args) {
//    int a,b,c,d;
//    Scanner ip = new Scanner(System.in);
//    a= ip.nextInt();
//    b= ip.nextInt();
//    c=ip.nextInt();
//    d=ip.nextInt();
//    if(a>b)
//    {
//       if(a>c)
//       {
//          if(a>d)
//          {
//             System.out.println("A is big");
//          }
//          else{
//             System.out.println("D is big");
//          }
//       }
//       else
//       {
//          System.out.println("C is big");
//       }
//    }
//    else if(b>c)
//    {
//      if(b>c)
//      {
//       if(b>d)
//       {
//          System.out.println("B is big");
//       }
//       else
//       {
//        System.out.println("D is big");
//       }
//      }
//      else{
//       System.out.println("C is big");
//      }
//    }
//    else if(c>d)
//    {
//       System.out.println("C is big");
//    }
//    else
//    {
//       System.out.println("D is big");
//    }
// }
// }
// public class practise {



// import java.util.Scanner;

// //    public static void main(String[] args)
// //     {
// //       int num;
// //       Scanner sc = new Scanner(System.in);
// //        num=sc.nextInt();
// //        if(num%2==0)
// //        {
// //        System.out.println("It is an even number");
// //        }
// //        else
// //        {
// //          System.out.println("It us an Odd number");
// //        }
// //    }
// // }
//  public class practise
//  {
//    public static void main(String[] args) 
//    {
//       int num ;
//       Scanner sc =new Scanner(System.in);
//     num = sc.nextInt();
//     int fact =1;
//     for(int i=1;i<=num;i++)
//     {
//       fact =fact*i;
//     }
//     System.out.println("factorial is "+fact);
//    }
//  }
// public class practise{
//    public static void main(String[] args) {
//       int i,j;
//       int n=5;
//       for(i=5;i>=1;i--)
//       {
//          for(j=1;j<=i;j++)
//          {
//             System.out.print("*");
//          }
//          System.out.println("");
       
//       }
//    }
// }
//  public class practise {
//  public static void main(String[] args) {
//    int num;
//    int reverse =0;
//    Scanner sc =new Scanner(System.in);
//    num=sc.nextInt();
//    while(num!=0)
//    {
//     reverse = reverse*10;
//     reverse = reverse+num%10;
//     num =num/10;
//    }
//    System.out.println(reverse);
//  }
   
//  }
// public class practise {
// public static void main(String[] args) {
//    int year=2027;
//    if((year%4==0)&&(year%100!=0)||(year%400==0))
//    {
//       System.out.println("It is a leap year");
//    }
//    else{
//       System.out.println("It is non leap year");
//    }
// }
// }
// import java.util.Scanner;
// public class practise
// {
//    public static void main(String[] args)
//    {
      
//       int num;
//       Scanner sc =new Scanner(System.in);
//       System.out.println("enter a num");
//       num =sc.nextInt();
//       if(num<=1)
//       {
//            System.out.println("It is not a prime");
//       }
//       for(int i=2;i*i<=num;i++)
//       {
//          if(num%i!=0)
//          {
//             System.out.println("it is a  prime");
//          }
//          else
//          {
//             System.out.println("It is not prime");
//          }
//       }
      
//       }
      
//    }
// public class practise {

//    public static void main(String[] args) {
//       int f0=1,f1=1,f2=2;
//       int count =10;
//       while(count>0)
//       {
//        int f3=f1+f2;
//         f1=f2;
//         f2=f3;
//         count--;
//         System.out.println(" "+f3);
//       }

//    }
// }
//  ---------------------------------------------functions
// {
//    public static void main(String[] args)
//    {
//       int a,b;
//       Scanner sc =new Scanner(System.in);
//       a=sc.nextInt();
//       b=sc.nextInt();
//      int result= max(a,b);
//      System.out.println(result+"is big");

      
//    }
//    static int max(int x,int y)
//    {
//       if(x>y)
//       {
//          return x;
//       }
//       else
//       {
//          return y; 
//       }
//    }
// }
// import java.util.Scanner;
// public class practise{
//    public static void main(String[] args) {
//       String name;
//       Scanner sc =new Scanner (System.in);
//       System.out.println("Enter the name");
//       name =sc.nextLine();
//        String result=greeting(name);
//        System.out.println(result);

//    }
//    static String greeting(String nam)
//    {   
//       String message="hello "+nam;
//       return message;
//    }
// }

// public class practise {
//    public static void main(String[] args)
//    {
//      int num;
//      Scanner sc =new Scanner(System.in);
//      System.out.println("Enter your number");
//      num=sc.nextInt();
//      boolean result=evenorodd(num);
//      System.out.println(result+"");


//    } 
//    static boolean evenorodd(int x)
//    {
//       if(x%2==0)
//       {
//          return true;
//       }
//       else{
//          return false;
//       }
//    }
// }

// public class practise {

//    public static void main(String[] args) {
//       int age;
//       Scanner sc =new Scanner(System.in);
//       age=sc.nextInt();
//      boolean result=voting(age);
//      if(result == true)
//      {
//       System.out.println("Eligible for voting");
//      }
//      else{
//       System.out.println("NOt eligible");
//      }
//    }
//    static boolean voting(int age)
//    {
//       if(age>=0&&age<=17)
//       {
//          return false;
//       }
//       else
//       {
//          return true;
//       }
//    }
// }
// import java.util.Scanner;
// public class practise {

//    public static void main(String[] args) {
//       int age;
//       Scanner sc =new Scanner(System.in);
//       System.out.println("Enter age for voting");
//       age=sc.nextInt();
//      String message=voting(age);
//      System.out.println(message);
     
//    }  
//    static String voting(int age)
//    {
//       if(age>=0&&age<=17)
//       {
//          String message="Not eligible";
//          return message;
//       }
//       else
//       {
//          String message=" Eligible";
//          return message;
//       }
//    }
// }
// public class practise
// {
//    public static void main(String[] args )
//    {
//       int  a=5;
//       int b=8;
//     int result =  sum(a,b);
//         System.out.println(result);
//    }
//    static int sum(int a,int b)

//    {
//          return a+b;
//    }
// }
// import java.util.Scanner;
// public class practise {

//    public static void main(String[] args) {
//    int marks ;
//    Scanner sc =new Scanner(System.in);
//    System.out.println("Enter your marks");
//    marks= sc.nextInt();
//     String result =grade(marks);
//     System.out.println(result);

//    }
//    static String grade(int m)
//    {
//       if(m>90&&m<=100)
//       {
//          return "A";
//       }
//       else if(m>80&&m<=90)
//       {
//          return "B";
//       }
//       else if(m>=35&&m<=80)
//       {
//          return "PASS";
//       }
//       else{
//          return "FAIL";
//       }
//    }
// }

// import java.util.Scanner;
// public class practise {

//    public static void main(String[] args) {
//       int num;
//       Scanner sc =new Scanner(System.in);
//          System.out.println("Enter your number");
//          num= sc.nextInt();
//          boolean result=prime(num);
//          System.out.println(result);
//    }
//    static boolean prime(int n)
//    {
//       if(n<=0)
//       {
//          return false;
//       }
//       for(int i=2;i*i<=n;i++)
//       {
//          if(n%i==0)
//          {
//             return false;
//          }
        
//       }
//       return true;
//    }
// }
// import java.util.Scanner;

// public class practise {

//    public static void main(String[] args) {
    
//       int num;
//       Scanner sc =new Scanner(System.in);
//                System.out.println("Enter your number");
//                num= sc.nextInt();
//                int result=fact(num);
//                System.out.println(result);
//    }
//    static int fact(int num)
//    {
//       int fact =1;
//       for(int i=1;i<=num;i++)
//       {
//         fact =fact*i;
//       }
//       return fact;
//    }
//  }
// import java.util.Scanner;
// public class practise 
// {
//    public static void main(String[] args)
//    {
//       int num;
//       Scanner sc =new Scanner(System.in);
//           System.out.println("Enter your number");
//        num= sc.nextInt();
//       int result = reverse(num);
//       System.out.println(result);
//    }
//    static int reverse(int n)
//    {
//       int reverse =0;
//       while(n!=0)
//        {
//          reverse = reverse*10;
//          reverse =reverse+n%10;        //NOT POSSIBLE
//          n=n/10;
//         return reverse;
//        }
//       return reverse;  
// }
// }
// import java.util.Scanner;
// public class practise {

//    public static void main(String[] args) {
//       int n;
//       Scanner sc =new Scanner(System.in);
//                 System.out.println("Enter your number");
//              n= sc.nextInt();
//          boolean result =palindrome(n);
//          System.out.println(result);
//    }
//    static boolean palindrome(int num)
//    { 
//       int originalNum=num;
//       int reversednum=0;
//       while(num>0) 

//       {
//          int rem = num%10;
//            reversednum=reversednum*10+rem;
//            num=num/10;
//       }
//       if(originalNum==reversednum)
//       {
//          return true;
//       }
//       return false;
//    }
// }
// public class practise {
// public static void main(String[] args) {
//   String[] arr=new String[5];
//   System.out.println("Enter the Elements");
//   Scanner sc =new Scanner(System.in);
//   for(int i=0;i<arr.length;i++)
//   {
//    arr[i]=sc.nextLine();
//   }
//   System.out.println("Elements are ");
//    for(int i=0;i<arr.length;i++)
//    {
//       System.out.println(arr[i]);
//    }
// }
   
// }