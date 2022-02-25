#include<bits/stdc++.h>
using namespace std;

int isPossible (string s);

int main()
{
    int t; cin >> t;
    while (t--)
	{
		string s; cin >> s;
		if (isPossible (s))
			cout << "Yes\n";
		else
			cout << "No\n";
	}
}

// Contributed By: Pranay Bansal
// } Driver Code Ends


int isPossible (string S)
{
    // your code here
    unordered_map <char, int> hmap;
    for(int i=0;i<S.size();i++)
    {
        hmap[S[i]]++;
    }
    int oddCount = 0;
    for(auto i : hmap){
        if(i.second %2 == 0)
            continue;
        else
            oddCount ++;
    }
    if(S.size() %2 ==0 && oddCount == 0)
    {
        return 1;
    }
    if(S.size()%2 != 0 && oddCount == 1)
        return 1;
    else
        return 0;
}