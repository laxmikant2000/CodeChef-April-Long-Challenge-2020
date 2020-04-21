import java.io.*;
import java.util.*;
 
class CodeChef {
    
    public static void compute(int n) {
        
        if(n % 2 == 0) {
		        out.println(n / 2);
		        for(int i = 1; i <= n; i += 2) {
		            out.println(2 + " " + i + " " + (i + 1));
		        }
		    }
		    else {
		        out.println(n / 2);
		        
		        for(int i = 1; i <= n - 1; i += 2) {
		            
		            if(i == 1) 
		                out.println(3 + " " + i + " " + (i + 1) + " " + n);
		            else   
		                out.println(2 + " " + i + " " + (i + 1));
		        }
		    }
    }


    public static void main(String[] args) {
        
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
 
        int t = sc.nextInt();
		
		while(t-- > 0) {
		    int n = sc.nextInt();
		    
		    if(n == 1) {
		        out.println(1);
		        out.println(1 + " " + 1);
		    }
		    else
		        compute(n);
		}

        /*
        int n      = sc.nextInt();        // read input as integer
        long k     = sc.nextLong();       // read input as long
        double d   = sc.nextDouble();     // read input as double
        String str = sc.next();           // read input as String
        String s   = sc.nextLine();       // read whole line as String
 
        int result = 40*n;
        out.println(result);                    // print via PrintWriter
        */
        
        out.close();
    }

    //-----------PrintWriter for faster output---------------------------------
    public static PrintWriter out;

    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;
 
        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
    //--------------------------------------------------------
}
