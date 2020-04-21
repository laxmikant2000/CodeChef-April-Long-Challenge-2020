

import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int t = sc.nextInt();
		while(t-- > 0) {
		    int n = sc.nextInt();
		    int[] pos = new int[n + 1];
            Stack<Integer> stck = new Stack<>();
            int res = 0;
            
		    for(int i = 1; i <= n; ++i) {
		        pos[i] = sc.nextInt();
		        
		        if(pos[i] == 1) {
		            stck.push(i);
		        }
		    }
		    
		    if(stck.size() == 1) {
		        System.out.println("YES");
		    }
		    else {
		        while(!stck.isEmpty()) {
		            int a = stck.peek();
		            stck.pop();
		            if(!stck.isEmpty()) {
		                int b = stck.peek();
		                res = Math.abs(a - b);
		                if(res < 6) {
		                    System.out.println("NO");
		                    break;
		                }
		            }
		        }
		        
		        if(res >= 6)
		            System.out.println("YES");
		    }
		}
	}
}
