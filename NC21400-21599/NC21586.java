import java.io.*;

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        double sum = 0;
        for (int i = 0; i < 5; i++) {
            cin.nextToken();
            sum += cin.nval;
        }
        cout.printf("%.1f", sum / 5.0);
        cout.flush();
    }
}
