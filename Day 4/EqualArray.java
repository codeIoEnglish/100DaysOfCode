import java.io.*;
import java.util.*;
public class EqualArray {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		long t=sc.nextLong();
		
		while(t-->0)
		{
		  int n=sc.nextInt();
		  long arr[]=new long[n];
		  long brr[]=new long[n];
		  
		  for(int i=0;i<n;i++)
		  {
		      arr[i]=sc.nextLong();
		  }
		  
		  for(int i=0;i<n;i++)
		  {
		      brr[i]=sc.nextLong();
		  }
		  Solution ob = new Solution();
		  System.out.println(ob.check(arr,brr,n)==true?"1":"0");
		  
		  
		}
	}
}

class Solution{
    public static boolean check(long A[],long B[],int N)
    {
            HashMap<Long,Integer> hmap = new HashMap<>();

            for(int i=0;i<A.length;i++)
            {
                if(hmap.containsKey(A[i]))
                {
                    int count = hmap.get(A[i]);
                    hmap.put(A[i],count+1);
                }
                else
                {
                    hmap.put(A[i],1);
                }
            }
            for(int i=0;i<B.length;i++)
            {
                if(hmap.containsKey(B[i]))
                {
                    int count = hmap.get(B[i]);
                    count--;
                    if(count==0)
                    {
                        hmap.remove(B[i]);
                    }
                    else
                    {
                        hmap.put(B[i],count);
                    }
                }
                else
                {
                    return false;
                }
            }
            if(hmap.size()==0)
            {
                return true;
            }
            return false;
    }
}