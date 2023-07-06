import java.util.Scanner;

public class practice{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int s = sc.nextInt();
    int t = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int m = sc.nextInt();
    int n = sc.nextInt();
    int co[] = new int[m];
    int cd[] =new int[n];
    for (int i = 0; i < m; i++) {
        co[i]= sc.nextInt();
    }
    for (int j = 0; j < n; j++) {
        cd[j]=sc.nextInt();
    }
    for (int j2 = 0; j2 < m; j2++) {
             co[j2]=a+co[j2];
    }
    for (int j3 = 0; j3 < n; j3++) {
        cd[j3]=b+cd[j3];
}
int counta=0;
for (int k = 0; k < m; k++) {
if (co[k]>=s && co[k]<=t) {
    counta++;
}    
}
int countb=0;
for (int v = 0; v < n; v++) {
    if (cd[v]>=s && cd[v]<=t) {
        countb++;
    }    
    }
    System.out.println(counta);
    System.out.println(countb);
    }
}