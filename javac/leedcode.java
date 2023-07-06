import java.util.*;
// import java.util.math

public class leedcode {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0,m=0;
        double k;
        for (int i = 0; i < 100; i++) {

            if (n < Math.pow(2, i)) {

                k = Math.pow(2, i);
                m=(int) (k-n);
                count++;
                // break;
            }
            if (m<0 ) {
                break;
                
            }
                if (m==1) {
                    count++;
                    break;
                }


        }
        System.out.println(count);
    }

}