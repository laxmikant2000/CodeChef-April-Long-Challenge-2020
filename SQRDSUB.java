#include<bits/stdc++.h>

using namespace std;

#define ll long long 

int main() {
    
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    
    int test;
    cin>>test;
    
    while(test--) {
        
        int size;
        cin>>size;
        
        ll rona = 1;
        
        int in[size];
        vector<ll> al, al2;
        
        for(int pointer = 0; pointer < size; ++pointer) {
            
            int input;
            cin>>input;
            
            in[pointer] = abs(input);
            
            if(abs(input) % 2) 
                ++rona;
            else if(abs(input) % 4) {
                al.push_back(rona);
                rona = 1;
            }
            else 
                rona = 1;
            
        }
        
        rona = 1;
        
        for(int pointer = 0; pointer < size; ++pointer) {
            
            if((in[pointer] % 2) == 0 && in[pointer] % 4 != 0) {
                
                rona = 1;
                ++pointer;
                
                while((in[pointer] % 2) && pointer < size)  
                    ++rona, ++pointer;
                    
                --pointer;
                al2.push_back(rona);
            }
        }
        
        ll res;
        res = 0;
        
        for(int pointer = 0; pointer < al.size(); ++pointer) {
            res += (al[pointer] * al2[pointer]);
        }
        
        cout<<(ll)size * (size + 1) / 2 - res<<"\n";
    }
    
    return 0;
}
