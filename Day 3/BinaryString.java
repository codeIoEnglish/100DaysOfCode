// { Driver Code Starts
    import java.util.*;
    import java.lang.*;
    import java.io.*;
    
   public class BinaryString{
        public static Scanner sc = new Scanner(System.in);
        public static void main (String[] args){
            int t;
            t=sc.nextInt();
            sc.nextLine();
            while((t--)!=0){
                int n=sc.nextInt();
                sc.nextLine();
                String s = new String();
                s=sc.nextLine();
                Solution obj = new Solution();
                System.out.println(obj.binarySubstring(n, s));
            }
        }
    }
    
    
    
    
    class Solution
    {
        
        public static int binarySubstring(int n, String a)
        {
            int count1 = 0;
        for(int i=0;i<n;i++)
        {
            if(a.charAt(i) == '1')
                count1++;
        }
        
        int answer = 0;
        count1--;
        while(count1 > 0)
        {
            answer += count1;
            count1--;
        }
        return answer;
        }
    }