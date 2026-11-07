import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
 
        int n = fs.nextInt();
        int k = fs.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = fs.nextInt();
        }
    int l = 0;
    int sum = 0;
    for(int i = 0; i < k; i++){
        sum += arr[i];
    }
   int minSum = sum;
   int j = 0;
   for(int r = k; r < n; r++){
       sum -= arr[l];
       l++;
       sum += arr[r];
       if(sum < minSum){
minSum = sum;
j = l;
       }
    }
 
     out.println(j + 1);
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