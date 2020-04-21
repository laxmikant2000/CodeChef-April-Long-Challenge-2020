#include <bits/stdc++.h>
using namespace std;

#define ll long long

    ll primeFactors(ll n)  
    {  
        ll count;
        count = 0;
        
        while (n % 2 == 0)  
        {  
            ++count;  
            n = n/2;  
        }  
      
        for (ll i = 3; i <= sqrt(n); i = i + 2)  
        {  
           
            while (n % i == 0)  
            {  
                ++count; 
                n = n/i;  
            }  
        }  
      
        if (n > 2)  
            ++count;
            
        return count;
    }  



    bool isPrime(ll x) {
        
        if(x < 2)
            return true;
            
        for(ll i = 2; i * i <= x; ++i)
            if(x % i == 0)
                return false;
                
        return true;
    }

int main() {
	// your code goes here
	
	ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    
	int t;
	cin>>t;
	while(t-- > 0) {
	    ll x,k;
	    cin>>x>>k;
	    int res;
	    res = 0;
	    
	    if(x >= k) {
	    
	        ll p;
	        p = pow(2,k);
	    
		    if(x >= p && k == 1)
		        res = 1;
		    
		    else if(k == 2 &&  x >= p && !isPrime(x))
		        res = 1;
		    
		    else if(k >= 3 && x >= p) {
		        
		        int f;
		        f = primeFactors(x); 
		        
		        if(f >= k && !isPrime(x))
		            res = 1;
		    }
	    }
	    cout<<res<<"\n";
	}
    
	return 0;
}
