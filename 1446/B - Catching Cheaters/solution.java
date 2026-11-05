import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
 
        int n = fs.nextInt();
        int m = fs.nextInt();
 
        String A = fs.next();
        String B = fs.next();
        
        int[][] dp = new int[n+1][m+1];
        int ans=0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(A.charAt(i - 1) == B.charAt(j - 1)){
                    dp[i][j] = dp[i-1][j-1] + 2;
                }else {
                    dp[i][j] = Math.max(0, Math.max(dp[i-1][j], dp[i][j - 1]) - 1);
                    
                }
                ans = Math.max(ans, dp[i][j]);
            }
        }
        out.println(ans);
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