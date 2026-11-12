import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
 
        int t = fs.nextInt();
        while (t-- > 0) {
            int n = fs.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = fs.nextInt();
            }
       
        int minIdx = 0;
        for(int i = 1; i < n; i++){
           if(arr[i] < arr[minIdx]){
               minIdx = i;
           }
        }
        arr[minIdx]++;
    long ans = 1;
    for(int i = 0; i < n; i++){
           ans *= arr[i];
        }
    out.println(ans);
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