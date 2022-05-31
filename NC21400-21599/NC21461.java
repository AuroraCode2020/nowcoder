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
        double p = (a + b + c) / 2;
        cout.printf("circumference=%.2f", a + b + c);
        cout.printf(" area=%.2f", Math.sqrt(p * (p - a) * (p - b) * (p - c)));
        cout.flush();
    }
}
