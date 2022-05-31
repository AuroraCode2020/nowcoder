import java.io.*;

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        cin.nextToken();
        double a = cin.nval;
        cin.nextToken();
        double b = cin.nval;
        cin.nextToken();
        double h = cin.nval;
        cout.printf("%.3f", (a + b) * h / 2);
        cout.flush();
    }
}
