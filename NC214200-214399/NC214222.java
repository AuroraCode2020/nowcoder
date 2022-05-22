import java.io.*;
import java.math.BigInteger;

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        double a, b;
        cin.nextToken();
        a = cin.nval;
        cin.nextToken();
        b = cin.nval;
        cout.printf("%.3f", b / a * 100);
        cout.print("%");
        cout.flush();
    }
}
