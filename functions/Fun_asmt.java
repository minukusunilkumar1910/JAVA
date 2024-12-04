package functions;


/*
//----------------------------------------MAX/MIN------------------------------
public class Fun_asmt{
   public static void main(String[] args)
    {
      int a=3;
      int b=5;
      int largest= large(a,b);
      System.out.println(largest + " is big");
   }
   static int large(int a,int b)
   {
   
      if(a>b)
      {
      return a;
      }
   
      else
      {
      return b;
      }
 
   }
}
//----------------------------------------MESSAGE----------------------------
import java.util.Scanner;

public class Fun_asmt {

   public static void main(String[] args) {
      System.out.println("enter your name");
    Scanner ip=new Scanner(System.in);
    String name=ip.nextLine();   
   String message=greeting(name);
   System.out.println(message);
   }
   static String greeting(String name)
   {
   String message ="hello "+name;
   return message;
   }
}
//-----------------------------EVEN/ODD--------------------------------------

import java.util.Scanner;

public class Fun_asmt{
public static void main(String[] args)
 {int a;
   Scanner ip =new Scanner(System.in);
   System.out.println("enter a value");
   a=ip.nextInt();
   boolean evenodd = type(a);
   if(evenodd==true){
      System.out.println(a+" is even");
   }
   else{
      System.out.println(a+" is odd");
   }
}
static boolean  type(int x)
{
   if(x%2==0){
      return true;
   }
   
   return false;
}
   
} 
//------------------------ELIGIBLE FOR VOTING----------------------------

import java.util.Scanner;

public class Fun_asmt {

   public static void main(String[] args) {
      System.out.println("enter the age");
      int a;
      @SuppressWarnings("resource")
      Scanner scan=new Scanner(System.in);
      a=scan.nextInt();
      boolean eligibility=eligible(a);
      if(eligibility==true){
         System.out.println(a+"  is eligible for voting");
      }
      else{
         System.out.println(a+"  is not eligible for voting");
      }
       
   }
   static boolean eligible(int age)
   {
      if(age >= 1 && age <18){
         return false;
      }
      else if(age >= 18){
         return true;
      }
      return false;
   }
}
//-------------------------------SUM OF TWO NUMBERS------------------------

import java.util.Scanner;

public class Fun_asmt{
   public static void main(String[] args){
      int a;
      int b;
      Scanner ip=new Scanner(System.in);
      System.out.println("Enter the two numbers");
      a=ip.nextInt();
      b=ip.nextInt();
      int sumofTwo=sum(a,b);
      System.out.println("The sum of two numbers is "+sumofTwo);

   }
   static int sum(int x,int y){
     int sum =x+y;
      return sum;
   }
}
//----------------------------AOC-&-COC----------------------------
import java.util.Scanner;

public class Fun_asmt {
public static void main(String[] args) {
    int r;                                          //cof=2*pi*r
      Scanner ip= new Scanner(System.in);
      System.out.println("enter the radius ");     //aoc=pi*r*r
      r=ip.nextInt();
     
      double result1=cof(r);
      System.out.println("The COF is " +result1);
      double result2=aoc(r);
      System.out.println("The AOC is "+result2);
}
 static double cof(int x){
   double pi=3.14;
   double cof = 2*pi*x;
return cof;
 }
 static double aoc(int y){
   double pi=3.14;
   double aoc;
   aoc=pi*y*y;
return aoc;
 } 
   
}
//----------------------------SUBJEMARKS-------------------------------- 
public class Fun_asmt {
public static void main(String[] args) {
    int m;
    System.out.println("Enter The Marks");
    Scanner ip=new Scanner(System.in);
    m =ip.nextInt();
    String tm=tmarks(m);
    System.out.println(tm+"");
}
   static String tmarks(int marks)
   {
      if(marks >=90 && marks <=100)
      {
      return "AA";
      }
      else if(marks >=80&& marks <=89){
         return "AB";
      }
      else if(marks >=70 && marks<=79){
         return "BB";
      }
      else if (marks >=35 && marks <=69) {
          return "pass";
      }
      else if(marks >=0 && marks <=34){
         return "fail";
      }
      return "EXAM FOR 100 MARKS ";
   }
}

//----------------------------PRIME-NUMBER------------------------------
import java.util.Scanner;

public class Fun_asmt {
 public static void main(String[] args){
int n;
System.out.println("Enter the number");
Scanner ip= new Scanner(System.in); 
n=ip.nextInt();

   boolean result=isprime(n);
   if(result==true){
      System.out.println("it is prime");
   }
   else{
      System.out.println("it is not a prime");
   }
 }
 static boolean isprime(int x)
 {
  
   if(x<=1)
   return false;
 
 for(int i=2;i*i<=x;i++){
  if(x%i==0)
  {
   return false;
  }
}
return true;
} 
}
//-------------------------------FACTORIAL---------------------------

import java.util.Scanner;

public class Fun_asmt {

   public static void main(String[] args) {
       int x;
       Scanner ip= new Scanner(System.in);
       System.out.println("Enter the Number");
       x=ip.nextInt();
       int result = fact(x);
       System.out.println("The factorial value of "+ x +" is "+result);
   }
   static int fact(int n)
   {
      int fact=1;
for(int i=1;i<=n;i++)
{
fact =fact*i;

}
return fact;
   }
   
}
//-----------------------------PALINDROME---------------------------

import java.util.Scanner;

public class Fun_asmt {

   public static void main(String[] args) {
       int number;
       Scanner ip=new Scanner(System.in); 
       System.out.println("enter the number");
       number =ip.nextInt();
       boolean result =isPalindrome(number);
       if(result==true){
         System.out.println(number+" is a palindrome");
       }
       else{
         System.out.println(number +" is not a palindrome");
       }
   }
   static boolean isPalindrome(int num)
   {
      int originalNum=num;
     int reversedNum=0;
     while(num>0)
     {
      int rem=num%10;
      reversedNum=reversedNum*10+rem;
      num /=10;
     }
     if(originalNum==reversedNum)
     {
      return true;
     }
     return false;
   }

}*/


  
