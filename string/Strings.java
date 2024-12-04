package string;

//charAt()
//length()
//compareTo()
//contains()
//contentEquals()
//concat()
//split()
//replace()
//replaceAll()
//trim()
//tocharArray()
//toLowerCase()
//toUpperCase()
//isLowerCase()
//isUpperCase()
//substring()
//equals()
//toString()



 


/*import java.util.Scanner;

public class Strings{
   public static void main(String[] args) {
       Scanner ip=new Scanner(System.in);
       System.out.println("Enter the map code");
       String map=ip.next();                   //map code  "WNEENESENNNN"

       int x=0;
       int y=0;
       for(int i=0;i<map.length();i++){
         char curr=map.charAt(i);
         if(curr == 'W')
         {
            x--;
         }
         else if(curr == 'N')
         {
            y++;
         }
         else if(curr == 'E')
         {
            x++;
         }

         else{
            y--;
         }
       }
       double distance =Math.sqrt(y*y - x*x);
       System.out.println(distance+" is the shortest path");
   }
}
*/
// public class Strings{
//    public static void main(String[] args){
//    String name ="racecar";
// boolean result=checkpalindrome(name);
// System.out.println(result+" ");
//    } 
//    static boolean checkpalindrome(String name){
//    for(int i=0;i<name.length()/2;i++){
//       int n=name.length();
// if(name.charAt(i)!=name.charAt(n-1-i))
// {
//    return false;
// }
//    }
//    return true;
//    } 
// }



//   vowels or consonants
// import java.util.Scanner;
// public class Strings {
// public static void main(String[] args)
//  {
//     {
//       char l;
//       Scanner sc=new Scanner(System.in);
//       l =sc.next().charAt(0);

//       if(l=='a'||l=='u'||l=='o'||l=='i'||l=='u')
//       {
//          System.out.println("it is vowel");
//       }
//       else
//       {
//          System.out.println("it is consonant");
//       }
//     }
//   }
// }


//  char is Alphabet or not


// import java.util.Scanner;
// public class Strings{
//    public static void main(String[] args)
//    {
//       char l;
//       Scanner sc=new Scanner(System.in);
//       l=sc.next().charAt(0);
//       if(l >='a' && l<= 'z' || l >='A'&& l<='Z')
//       {
//            System.out.println("char");
//       }
//       else
//       {
//          System.out.println("Not a char");
//       }
//    }
// }


//ASCII value

// import java.util.Scanner;
// public class Strings{
//    public static void main(String[] args)
//    {
//       char l;
//       Scanner sc=new Scanner(System.in);
//       l=sc.next().charAt(0);
//       int v=l;
//       System.out.println(v);
//    }
// }


//Length of the string without strln()


// public class Strings{
//    public static void main(String[] args) {
//       String name="sunil";
//       int count =0;
//       for(char c:name.toCharArray())
//       {
//          count++;
//       }
//       System.out.println(count);
//    }
// }



// Toggle the char

// public class Strings{
//    public static void main(String[] args) {
//       String word="SunIl";
//       String newword="";
// for(int i=0;i<word.length();i++)
// {
//    char c= word.charAt(i);
//    if(Character.isLowerCase(c))
//    {
//       newword=newword+Character.toUpperCase(c);
//    }
//    else
//    {
//       newword=newword+Character.toLowerCase(c);
//    }
// }
// System.out.println(word);
// System.out.println(newword);
// }
// }



// public class Strings{
// public static void main(String[] args) {
//    String name="Hello World";
//    String upd="";
//    for(int i=0;i<name.length();i++)
//    {
//      char c=name.charAt(i);
//      if(Character.isLowerCase(c))
//      {
//       upd=upd+Character.toUpperCase(c);
//      }
//      else{
//       upd =upd+Character.toLowerCase(c);
//      }
//    }
//    System.out.println(name);
//    System.out.println(upd);
//   }
// }


// Vowels in the word 

// public class Strings{
//    public static void main(String[] args)
//    {
//       String name="sunilkumar";
//       name=name.toLowerCase();
//       int count=0;
//       for(int i=0;i<name.length();i++)
//       {
//          char c=name.charAt(i);
//          if(c =='a'||c=='e'||c=='i'||c=='o'||c=='u')
//          {
//            count++;
//          }
//       }
//       System.out.println(count);
//    }
// }

//Remove the vowels 

// public class Strings{
//    public static void main(String[] args) {
//       String word="i am sunilkumar";
//       String newword=word.replaceAll("[aeiou]","");//replaceAll()
//       //  String newword=word.replace("a","s"); //replace
//       System.out.println(newword);

//    }
// }


//palindrome

// public class Strings {
//    public static void main(String[] args) {
//       String name = "mooomn";
//       String str2=name;
//       String str = "";
//        for(int i=name.length()-1;i>=0;i--)
//        {
//          str=str+name.charAt(i);
//        }
//     if(str2.equals(str))
//     {
//       System.out.println("P");
//     }
//     else
//     {
//       System.out.println("N p");
//     }

//    }
// }

//String in reverse order
// public class Strings {
//    public static void main(String[] args) {
//       String name="sunil";
//       String rev="";
//       for(int i=name.length()-1;i>=0;i--)
//       {
//          rev=rev+name.charAt(i);
//       }
//       System.out.println(rev);
//    }
// }

//palindrome in O(n)

// public class Strings {
// public static void main(String[] args)
//  {
//    String s="madam";
//    int left=0;
//    int right=s.length()-1;
//    while(left < right)
//    {
//       if(s.charAt(left) != s.charAt(right))
//       {
//          System.out.println("Palindrome");
//       }
//       else{
//          System.out.println(" Not Palindrome");
//       }
//    }
//  }
// }

// public class Strings {
//    public static void main(String[] args)
//     {
//       String s="madam.sir";
//          System.out.println(s.contentEquals("."));
//     }
// }
