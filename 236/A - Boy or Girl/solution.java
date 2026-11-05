import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
 
        String str = fs.next();
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            
                set.add(ch);
            
        }
        if(set.size() % 2 == 0){
            out.println("CHAT WITH HER!");
        }else {
            out.println("IGNORE HIM!");
        }
 
        out.flush();
    }
 
    static class FastScanner {
        private final BufferedReader br;
        private StringTokenizer st;
 
        FastScanner(InputStream in) {
            br = new BufferedReader(new InputStreamReader(in));
        }
 
        String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) {
                String line = br.readLine();
                if (line == null) return null;
                st = new StringTokenizer(line);
            }
            return st.nextToken();
        }
 
        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }
 
        long nextLong() throws IOException {
            return Long.parseLong(next());
        }
    }
}