import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
 
        int n = fs.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = fs.nextInt();
        }
    if(n == 0){
        out.println(0);
        out.flush();
        return;
    }
int inc = 1;
int maxlen = 1;
for(int i = 1; i < n; i++){
    if(arr[i - 1] <= arr[i]){
        inc += 1;
    }else {
    inc = 1;
}
maxlen = Math.max(maxlen, inc);
}
out.println(maxlen);
 
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