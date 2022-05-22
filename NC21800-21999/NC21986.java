import java.io.*;

public class Main {
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));
    public static void main(String[] args) throws Exception {
        cin.nextToken();
        double n = cin.nval;
        cout.printf("%.3f", n);
        cout.flush();
    }
}
