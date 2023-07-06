import java.util.*;

public class codeforces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int counttwo = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 2) {
                counttwo++;
            }
        }
        if (counttwo == 0) {
            System.out.println(1);
        }
        if (counttwo % 2 != 0) {
            System.out.println(-1);
        } else {
            int k = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] == 2) {
                    k++;
                    if (k == counttwo / 2) {
                        System.out.println(i + 1);
                    }

                }
            }

        }

    }
}
