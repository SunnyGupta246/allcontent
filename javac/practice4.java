import java.util.*;

public class practice4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int k = 0;
        for (int i = 0; i < m; i++) {
            int n = sc.nextInt();

            for (int j = 3; j < n; j++) {

                if (j % 3 == 0 || j % 5 == 0) {
                    k = j + k;
                }

            }
            System.out.println(k);
            k=0;
        }

    }
}
