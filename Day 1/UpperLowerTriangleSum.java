    import java.io.*;
    import java.util.*;

   public class UpperLowerTriangleSum
    {
        public static void main(String args[])throws IOException
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            
            while(t-- > 0)
            {
                int n = sc.nextInt();
                
                int matrix[][] = new int[n][n];
                for(int i = 0; i < n; i++)
                    for(int j = 0; j < n; j++)
                        matrix[i][j] = sc.nextInt();
    
                Solution ob = new Solution();
                ArrayList<Integer> ans = ob.sumTriangles(matrix,n);
                for (Integer val: ans) 
                    System.out.print(val+" "); 
                System.out.println();
            }
            
        }
    }
    
    
    class Solution
    {
        
        static ArrayList<Integer> sumTriangles(int matrix[][], int n)
        {
            int uppersum =0;
            int lowersum=0;

            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(i<=j)
                    {
                        uppersum+=matrix[i][j];
                    }
                    if(i>=j)
                    {
                        lowersum+=matrix[i][j];
                    }
                }
            }
            ArrayList<Integer> answer = new ArrayList<>();
            answer.add(uppersum);
            answer.add(lowersum);
            return answer;
        }
    }