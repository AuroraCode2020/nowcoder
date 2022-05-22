import java.io.*;
import java.util.ArrayList;

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
        int s = a + b;
        ArrayList<Character> L = new ArrayList<>();
        while (s != 0) {
            int temp = s % 16;
            s /= 16;
            if (temp == 10) {
                L.add('a');
            } else if (temp == 11) {
                L.add('b');
            } else if (temp == 12) {
                L.add('c');
            } else if (temp == 13) {
                L.add('d');
            } else if (temp == 14) {
                L.add('e');
            } else if (temp == 15) {
                L.add('f');
            } else {
                L.add((char) (temp + '0'));
            }
        }
        for (int i = L.size() - 1; i >= 0; i--) {
            cout.print(L.get(i));
        }
        cout.flush();
    }
}
