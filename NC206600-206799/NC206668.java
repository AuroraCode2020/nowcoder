import java.io.*;
import java.util.ArrayList;

public class Main {
    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    public static BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
    public static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    public static PrintWriter cout = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws Exception {
        cin.nextToken();
        int x = (int) cin.nval;
        cin.nextToken();
        int n = (int) cin.nval;
        ArrayList<Integer> L = new ArrayList<>();
        for (int i = 1; i <= 7; i++) {
            L.add(i);
        }
        int i;
        for (i = x; n != 0; i++, n--) {
            if (i > 7) {
                i = 1;
            }
        }
        cout.print(L.remove(i - 1));
        cout.flush();
    }
}
