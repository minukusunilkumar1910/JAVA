package java;

/*import java.util.Scanner;

public class largestNum{
   public static void main(String[] args) {
    int a,b;
    Scanner ip = new Scanner(System.in);
    System.out.println("Enter a");
    a=ip.nextInt();
    System.out.println("Enter b");
    b=ip.nextInt();
    if(a>b){
      System.out.println("a is big");
    }else{
      System.out.println("b is big");
    }
      
   }
}

import java.util.Scanner;

public class largestNum{
   public static void main(String[] args) {
      int a,b,c,d;
       Scanner ip =new Scanner(System.in);
       System.out.println("enter a");
       a= ip.nextInt();
       System.out.println("enter b");
       b= ip.nextInt();
       System.out.println("enter c");
       c= ip.nextInt();
       System.out.println("enter d");
       d= ip.nextInt();
       
      if(a>b)
      {
           if(a>c)
           {
                if(a>d)
                {
                 System.out.println("a is big");
                }
                else
                {
                 System.out.println("d is big");
                } 
           }
           else
           {
             System.out.println(" c is big");
           }
      }  
      else{
          if(b>c)
          {
                 if(b>d){
                  System.out.println("b is big");
                 }
                 else{
                  System.out.println("d is big");
                 }  
          }
          else if(c>d)
          {
            System.out.println("c is big");
          }
          else{
            System.out.println("d is big");
          }
      }
      

   }
}*/
import java.util.Scanner;

public class largestNum
{
  public static void main(String[] args) 
  {
      @SuppressWarnings("resource")
      Scanner ip =new Scanner(System.in);
      System.out.println("enter a");
      int a=ip.nextInt();
      System.out.println("enter b");
      int b= ip.nextInt();
      System.out.println("enter c");
      int c=ip.nextInt();
      System.out.println("enter d");
      int d=ip.nextInt();
      System.out.println("enter e");
      int e=ip.nextInt();
      if(a>b)
      {
        if(a>c)
        {
           if(a>d)
           {
              if(a>e)
              {
                 System.out.println("A is big");
              }
              else
              {
                 System.out.println("E is big");
              }
           }
           else
           {
              System.out.println("D is big");
           }
        }
        else
        {
           System.out.println("C is big");
        }
      }
      else
     {
        if(b>c)
        {
           if(b>d)
           {
              if(b>e)
              {
                 System.out.println("B is big");
              }
              else
              {
                 System.out.println("e is big");
              }
           }
           else
           {
              System.out.println("d is big");
           }
        }
        else
        {
           if(c>d)
           {
              if(c>e)
              {  
                 System.out.println("c is big");
              }
              else
              {
                 System.out.println("E is big");
              }
           }
         
           else
           {
              if(d>e)
              {
                 System.out.println("D is big");
              }
              else
              {
                 System.out.println("E is big");
              }
           }       
        }
     }  
  }
}
