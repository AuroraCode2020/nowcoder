import java.io.*;

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        cin.nextToken();
        int a = (int) cin.nval;
        cin.nextToken();
        int b = (int) cin.nval;
        cin.nextToken();
        int c = (int) cin.nval;
        cout.println(2 * a * b + 2 * a * c + 2 * b * c);
        cout.print(a * b * c);
        cout.flush();
    }
}
