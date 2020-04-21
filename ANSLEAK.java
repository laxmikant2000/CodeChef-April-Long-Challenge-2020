

import java.io.*;
import java.util.*;
 
class CodeChef {
    
    public static void main(String[] args) {
        
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
 
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            
            List<Integer> al = new ArrayList<>();
            
            for(int i = 0; i < n; ++i) {
                
                for(int j = 0; j < k; ++j) {
                   al.add(sc.nextInt());
                }
            }
            
            for(int i = 0; i <= n / 2; ++i)
                out.print(al.get(i) + " ");
            
            for(int i = al.size() - (n / 2) + 1; i < al.size(); ++i) {
                out.print(al.get(i) + " ");
            }
            
            out.println();
        }

        out.close();

    }

   
    public static PrintWriter out;

   
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
}
