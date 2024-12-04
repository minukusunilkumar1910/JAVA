// // package oops;

// // public class k_oops2 
// // {
// //   public static void main(String[] args) 
// //   {
// //      Tenth sunil=new Tenth();
// //      Tenth vinod=new Tenth("vinod",12,94.3f);
// //       System.out.println(vinod.name);
// //           Tenth jyothi=new Tenth("jyothi",123,98.0f);
// //       System.out.println(jyothi.name);
// //       // System.out.println(sunil.marks);
// //       jyothi.greeting();
// //   } 
// // }
// // class Tenth
// // {
// // int no;
// // String name;
// // float marks; 
// // void greeting()
// // {
// //   System.out.println("Hello "+this.name);
// // }
// // Tenth()            //CONSTUCTOR OVER LOADING  "THIS IS POLYMORPHISM"
// // {
// //    this.no=4;
// //    this.name="sunil";
// //    this.marks=97.9f;
// // }
// //  Tenth(String name,int rno,float marks)
// //  {
// //   this.name =name;
// //   this.no=rno;
// //   this.marks=marks;
// //  }

// // }
// // ----------------------------------------------------------------------------------------------------------------------
// package oops;

//   public class k_oops2
//   {
//     public static void main(String args[])
//     {

//       Student vinod = new Student(15,"vinod",66.8f);
//       Student vijay=new  Student(16,"viay",83.5f);
//       Student charan=new  Student(17,"charan",55.5f);
       
//       Student random =new Student(vinod);
       
//     //    charan.rollno();
//     //    charan.studentname();
//     //    charan.totalfees();
//       //  vinod.changename("sunil");
//       //  vinod.rollno();
//       //  vinod.studentname();
//       //  vinod.totalfees();
//        Student ran2=new Student();
//        System.out.println(ran2);
      


//     }
//   }
//     class  Student
//     {

//       int no;
//       String name;
//       float amount;
//    void studentname()
//       {
//        System.out.println("name is "+name);
//       }
//       void rollno()
//       {
//         System.out.println("Rollno : "+no);
//       }
//       void  totalfees()
//       {
//          System.out.println("the total amount is "+amount);
//       }
//       void changename(String newname)
//       {
//         name=newname;
//       }
//       //TYPES OF CONSTRUCTORS
//       //  Student()
//       //  {
//       //   this.no=14;
//       //   this.name="sunil";
//       //   this.amount=99.8f;
//       //  }

//        Student (int no,String name,float amount)
//        {
//         this.no=no;
//         this.name=name;
//         this.amount=amount;
//        }

//        Student(Student other)
//        {
//         this.name=other.name;    //other will be replaced with Sunil & this will be replaced with random
//         this.no=other.no;
//         this.amount=other.amount;

//        }
//        Student()
//        {
//         this(12,"ajay",78.9f);
//        }
      
//     }
  
class csm{
   String name;
   int roll;
   double fee;

   
   void assign(csm p2)
   {
     p2.name=this.name;
     p2.roll=this.roll;
   }
  

}
public class k_oops2 {
   public static void main(String[] args) {
      csm student1=new csm();
      csm student2=new csm();
      student1.name="sunil";
      student1.roll=191;
      student1.assign(student2);

      System.out.println(student2.name);
      System.out.println(student2.roll);
     
   }
}