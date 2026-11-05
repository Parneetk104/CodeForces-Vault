import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
 
        String str1 = fs.next();
        String str2 = fs.next();
        
            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();
            if(str1.equals(str2)){
                out.println(0);
            }else if(str1.compareTo(str2) < 0){
                out.println(-1);
            }else {
                out.println(1);
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