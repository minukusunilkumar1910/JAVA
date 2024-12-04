package string;

public class largeststring {
   public static void main(String[] args){
      
      String[] words={"hello","world","welcome"};
      int len=0;
      String large=" ";
      for(int i=0;i<words.length;i++){
        
        if(words[i].length() > len){
         large= words[i];
         len=words[i].length();

        }
      }
     System.out.println(large+" ");
   }
}
