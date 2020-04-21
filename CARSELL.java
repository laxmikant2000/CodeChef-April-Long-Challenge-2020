
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		
		final int c = 1000000007; 
        
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            long[] arr = new long[n];

            for(int i = 0; i < n; ++i) {
                arr[i] = sc.nextLong();
            }
                
            Arrays.sort(arr);
            
            long sum = 0;
            int j = 0;
            
            for(int i = n - 1; i >= 0; --i) {
                
                if(arr[i] > 0) {
                    arr[i] -= j;
                }
                if(arr[i] > 0)
                sum = ((sum % c) + (arr[i] % c)) % c;
                ++j;
            }
            
            System.out.println(sum);
        }
	}
}
