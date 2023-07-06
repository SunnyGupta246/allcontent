import java.util.*;

public class practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int k = 0;

        int n = sc.nextInt();

        for (int j = 0; j < m; j++) {

            if (j % 3 == 0 || j % 5 == 0) {
                k = j + k;
            }

        }
        System.out.println(k);
        k=0;
        for (int j = 0; j < m; j++) {

            if (j % 3 == 0 || j % 5 == 0) {
                k = j + k;
            }

        }
        System.out.println(k);
        k = 0;

    }
}
