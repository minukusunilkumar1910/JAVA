
public class classObject
{
 public static void main(String[] args) {

   csm student1=new csm();
   student1.setdata("M.sunilkumar","23BFA33191");            // here i set the data
 //System.out.println(student1.name);
 //System.out.println(student1.rollno+"");   // so,we cannot access them publicly

    System.out.println(student1.getdata()+"");     //Even it is private i can acess the data by using this
    System.out.println(student1.rollno()+"");
  }
   
}
class csm
{
 private String rollno;         //if i private it ,we ccanot access it publicly , so we hava to use [getters & setters]
 private String name;

   public void setdata(String n ,String r)    //here i used setter
   {       
      this.name=n;
      this.rollno=r;
   }
   public String  getdata()           //here i used getter
   {
      return this.name;
   }
   public String rollno(){
      return this.rollno;
    }
}