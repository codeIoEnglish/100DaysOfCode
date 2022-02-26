import java.io.*;
import java.util.*;

public class SnakePattern
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
            {
                for(int j = 0; j < n; j++)
                 matrix[i][j] = sc.nextInt();
            }
            
            Solution ob = new Solution();
            ArrayList<Integer> ans = ob.snakePattern(matrix);
            for (Integer val: ans) 
                System.out.print(val+" "); 
            System.out.println();
        }
        sc.close();
    }
}

class Solution
{
    
    static ArrayList<Integer> snakePattern(int matrix[][])
    {
         int rows = matrix.length;
         int cols = matrix[0].length;

         ArrayList<Integer> answer = new ArrayList<>();
         for(int i=0;i<rows;i++)
         {
             if(i%2==0)
             {
                 for(int j=0;j<cols;j++)
                 {
                     answer.add(matrix[i][j]);
                 }
             }
             else{
                 for(int j=cols-1;j>=0;j--)
                 {
                     answer.add(matrix[i][j]);
                 }
             }
         }
         return answer;
    }
}