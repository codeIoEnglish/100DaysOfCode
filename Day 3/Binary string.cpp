#include<bits/stdc++.h>
using namespace std;


 // } Driver Code Ends

class Solution
{
    public:
    //Function to count the number of substrings that start and end with 1.
    long binarySubstring(int n, string a){
        
        int count1 = 0;
        for(int i=0;i<n;i++)
        {
            if(a[i] == '1')
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

};

// { Driver Code Starts.

int main()
{
    int t,n,count;
    string a;
    cin>>t;
    while(t--)
    {
        count = 0;
        cin >> n;
        cin >> a;
        Solution obj;
        cout << obj.binarySubstring(n, a) << endl;
    }
}
  // } Driver Code Ends