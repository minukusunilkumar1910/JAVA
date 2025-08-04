
//    public static void main(String[] args) 
//    {
//       dtype t =new dtype();
//       System.out.println(t.a+" "+ t.b+" "+ t.c+" "+t.d+" "+t.e+" "+t.f+" "+t.g+" "); 
//    }
// }
//     class dtype
//    {
//       int a;
//       float b; 
//       double c;
//       char d;
//       long e;
//       String f;
//       boolean g;
//    }

   
// import java.util.Scanner;
// public class lab {

//    public static void main(String[] args) {
//       Scanner sc=new Scanner(System.in);
//       System.out.println("enter the height");
//       int height=sc.nextInt();
//    }
// }
// import java.util.Scanner;
// public class lab {

//    public static void main(String[] args)
//    {
//       int tel;
//       int hin;
//       int eng;
//       int math;
//       int ps;
    
     
//       Scanner sc=new Scanner(System.in);
//       System.out.println("Enter your telugu marks");
//       tel=sc.nextInt();
//       hin=sc.nextInt();
//       eng=sc.nextInt();
//       math=sc.nextInt();
//       ps=sc.nextInt();
 
//       System.out.println("Hello your marks are");

     
//    }
// }
// import java.util.ArrayList;
// public class lab 
// {

//    public static void main(String[] args) {
     
//         int a=1;
//         int b=3;
//         int c=6;
//         int N=17;
// //        int result =
//                 seriesN(a,b,c,N);
//     }
//     static void seriesN(int a,int b,int c,int N) {
//         ArrayList<Integer> series = new ArrayList<>();
//         series.add(a);
//         series.add(b);
//         series.add(c);

//         int subser = c;
//         boolean addtwo = true;
//         while (series.size() < N) {
//             if (addtwo ==  true) {
//                 subser += 2;
//             } else {
//                 subser += 3;
//             }
//             series.add(subser);
//             addtwo = ! addtwo;
//         }
// for(int i:series)
// {
//     System.out.print(i+" ");
// }
//    System.out.println("17th number in series is "+series.get(16));
//     }
// }
  

//1.1 data types
 //default values of instance(object) variable

// class lab{

//     int a;
//     double b;
//     public static void main(String[] args) {
//         lab one =new lab();
//         System.out.println(one.a);
//         System.out.println(one.b);
//     }
// }
// 1.2 local(function) variables must be initialized before displaying 
//  {int a=10;}

 
// 1.3 reading values from keyboard
//Scanner Class
// —--------------------------------------

//  2.Bank customer object creation with methods

// public class lab {
  
//     String name;
//     int ano;
//     int bal;

//      void balan()
//      {
//         System.out.println(bal);
//      }
//     public static void main(String[] args) {
//         lab cus1= new lab();
//         lab cus2= new lab();

//         cus1.name="sunil";
//         cus2.name="vinod";
//         cus2.bal=1000;
//         cus2.balan();
//        System.out.println(cus1.name);

       
//     }
    
// }

// —--------------------------------------
// 3.prime num generator with given range of numbers

// public class lab {

//     public static void main(String[] args) {
    //         int s=0;
    //         int e=30;
    
    //          for(int i=s;i<=e;i++)
    //          {
        //            int  co=0;
        //             for(int j=1;j<=i;j++)
        //             {
            //                if(i%j==0)
            //                {
                //                 co+=1;
//                }
//                else
//                {
    //                 continue;
    //                }
//             }
//             if(co == 2)
//             {
    //                 System.out.print(i+" ");
//             }
//          }
//         }

//     }

// —-----------------------------------------
// 4.rectangle class

// class lab
// {
//     int len;
//     int wid;
//     public static void main(String[] args) 
//     {
    //         lab r1=new lab();
    //         lab r2=new lab();
 
//        System.out.println( r1.perim(3, 4));
//        System.out.println( r1.area(3.3, 4.4));

//     }
//    int perim(int l,int b)
//    {
    //      int p=2*(l+b);
    //      return p;
    //    }
    
    //    double area(double l,double b)
    //    {
        //     return l*b;
        //    }
        
        // }
        
// —--------------------------------------
//5.1 no-argument constructor

//constructor without parameters

//5.2 parameterised constructor 

// public class lab {
    
//     int no;
//    String name;
//       lab(int n,String nam )
//       {
//           this.no=n;
//           this.name=nam;
//       }

//       public static void main(String[] args) {
    //         lab st1=new lab(191, "sunil");

    //         System.err.println(st1.name);
//       }
// }
// —--------------------------------------
// 6.Method overloading

// public class lab 
// {
//     void area(int s)
//     {
//         System.out.println(s*s);
//     } 
//     void area(int l,int b)
//     {
//         System.out.println(l*b);
//     } 
//     void area(double r)
//     {
//         System.out.println(3.14*r*r);
//     } 
    

//     public static void main(String[] args) {
//         lab r =new lab();
//         lab s =new lab();
//         lab c =new lab();
     
//         r.area(2,4);
//         s.area(2);
//         c.area(2.0);
//     }
// }     

//----------------------------------------------------------
//7.String palindrome

// public class lab {

//     public static void main(String[] args) {
//         String val = "o";
//         int flag = 0;
//           int s=0;
//           int e=val.length()-1;

//         while(s<e)
//         {
//             if(val.charAt(s) == val.charAt(e))
//             {
//                 s++;
//                 e--;
//             }
//             else{
//                 flag=1;
//                 break;
//             }
//         }
//         if(flag == 0)
//         {
//             System.out.println("pal");
            
//         }
//         else{
//             System.out.println("not pal");
//         }
 
//     }
// }

// 8.finding grades

//9.Armstrong Number

//10.1 Bubble sort on num

//10.2 Bubble sort on Strings

//11.1 Single level inheritance

// class motors{

//     int no=24;
//     String name="rx";
//     int rate=3000;
    
//     void speed()
//     {
//         System.out.println("100");
//     }
// }
// class tvs extends motors
// {
  
// //   String name ="xl";

// tvs()
// {
//     super();
//   this.name=name;
// }
// }
// public class main{
//     public static void main(String[] args) 
  
//     {
//       motors rx =new motors();
//       tvs xl =new tvs();
//      System.out.println( rx.name);
//      System.out.println( xl.name);

//     }
// }
//11.2 multi level inheritance


// abstract

// abstract class animal
// {
//     abstract void sound();
// }
// class donkey extends animal
// {
//      void sound()
//      {
//         System.out.println("brays");
//      }
// }
// class dog extends animal
// {
//     void sound()
//     {
//        System.out.println("barksss");
//     }
// }
// public class main {

//     public static void main(String[] args) {
        
//         donkey dk = new donkey();
//         dk.sound();

//     }
// }

// runtime poly
// public class main {

//     public static void main(String[] args)
//     {
//         bike bk = new bike();
//         car c =new car();

//         bk.speed();
//         c.speed();
//     }
// }
// class bike extends main
// {
//     void speed()
//     {
//         System.out.println("30");
//     }
// }
// class car extends main{
//     void speed()
//     {
//         System.out.println("50");
 //     }
// }

// public class main {
//    public static void main(String[] args) {
//         tab6 t6 = new tab6();
//         t6.start();
//         tab9 t9 = new tab9();
//         t9.start();
//    }
// }
// class tab6 extends Thread{
//     public void run()
//     {
//         for(int i=1;i<=10;i++)
//         {
//             System.out.println("6 X "+i+"="+6*i);
//         }
//     }
// }
// class tab9 extends Thread{
//     public void run()
//     {
//         for(int i=1;i<=10;i++)
//         {
//             System.out.println("9 X "+i+"="+9*i);
//         }
//     }
// }


// public class main {

//     public static void main(String[] args) {
//         int r =10/0;
//         System.out.println("Hello");
//     }
// }



<<<<<<< HEAD
public class main {
    public static void main(String[] args) {
           int n=11;
    if(n<2)
    {
      System.out.println("Not Prime");
      return;
    }
    boolean isPrime = true;
    for(int i=2;i*i<=n ;i++)
    {
         if(n%i==0)
         {
            isPrime = false;
            break;
         }
    }
     
    if(isPrime)
    {
      System.out.println("It is Prime");
    }
    else
    {
      System.out.println("It is not Prime");
    }
    }
}    
=======
// public class main {

//     public static void main(String[] args) {
//         try {

//             int a;
//             Scanner sc =new Scanner(System.in);
//             a=sc.nextInt();

//             int s=2/0;
            
//         } catch (InputMismatchException | ArithmeticException e) {
//             System.out.println(e.getClass());
//         }
//     }
// }


   //  int n=11;
   //  if(n<2)
   //  {
   //    System.out.println("Not Prime");
   //    return;
   //  }
   //  boolean isPrime = true;
   //  for(int i=2;i*i<=n ;i++)
   //  {
   //       if(n%i==0)
   //       {
   //          isPrime = false;
   //          break;
   //       }
   //  }
     
   //  if(isPrime)
   //  {
   //    System.out.println("It is Prime");
   //  }
   //  else
   //  {
   //    System.out.println("It is not Prime");
   //  }
   // }
>>>>>>> 278ad6c8dba066867d7e2ebb5b6ac30db9ef9806
