import java.util.Scanner;

public class practice2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x1=sc.nextInt();
    int v1=sc.nextInt();
    int x2=sc.nextInt();
    int v2=sc.nextInt();
    int temp;
  
    for (int i = 1; i <= 10000; i++) {
        if ((x1+(i-1)*v1)==(x2+(i-1)*v2)) {
            System.out.println("YES");
            
            break;
        }
        else if(i==10000)
        {
            System.out.println("NO");
        }
    }
    // System.out.println(1==-1);
    }
}
