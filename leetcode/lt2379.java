public class pro {
   public static void main(String[] args) {
     
   String blocks ="WBBWWBBWBW";
   int k =7;
    int i=0;
        int j=i;
        int minCount = k;
        int count =0;
        int n = blocks.length();
        while(j<n)
        {
            if(blocks.charAt(j) == 'W')
            {
                count++;
            }
            if(j-i+1 == k && j<k)
            {
                minCount = Math.min(minCount,count);
                
                if(blocks.charAt(i) == 'W')
                {
                    count--;
                }
                i++;
            }
            j++;
        }
        System.out.println(minCount);

   }

}
