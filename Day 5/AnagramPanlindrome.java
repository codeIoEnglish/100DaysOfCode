    import java.util.*;
    import java.lang.*;
    import java.io.*;
    
    public class AnagramPalindrome
    {
        public static void main (String[] args)
        {
            Scanner in = new Scanner(System.in);
            int t = in.nextInt();
            for(int i=0;i<t;i++){
                String s = in.next();
                if (new Sol().isPossible (s) == 1)
                    System.out.println ("Yes");
                else
                    System.out.println ("No");
            }
        }
    }
    
    
    class Sol
    {
        int isPossible (String S)
        {
            HashMap<Character,Integer> hmap = new HashMap<>();
            for(int i=0;i<S.length();i++)
            {
                if(hmap.containsKey(S.charAt(i)))
                {
                    int count = hmap.get(S.charAt(i));
                    hmap.put(S.charAt(i),count+1);
                }
                else
                {
                    hmap.put(S.charAt(i),1);
                }
            }
            int oddcount=0;
            for(int i:hmap.values())
            {
                if(i%2==1)
                 oddcount++;
            }
            if(S.length()%2==0 && oddcount==0)
            {
                return 1;
            }
            if(S.length()%2!=0 && oddcount==1 )
            {
                return 1;
            }
            else
                return 0;
        }
    }