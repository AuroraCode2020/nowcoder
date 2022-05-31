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
        double c = cin.nval;
        cout.printf("%.0f", 0.2 * a + 0.3 * b + 0.5 * c);
        cout.flush();
    }
}
