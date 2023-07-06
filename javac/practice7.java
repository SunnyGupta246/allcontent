import java.util.Scanner;

public class practice7 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String s1=sc.nextLine();
    String s2=sc.nextLine();
    int k=sc.nextInt();
    int v1=0;
    int v2=0;
    while (v1<s1.length() && v2<s2.length()){
        if (s1.charAt(v1)==s2.charAt(v2)){
            v1++;
            v2++;
        }
        else{
            break;
        }
    }
    int remain=s1.length()-v1+s2.length()-v2;
//     if (remain>k){
// System.out.println("No");
//     }
    // if (k<remain) {
    //     System.out.println("No");
        
    // }
        if ((k-remain)%2==0) {
                    System.out.println("Yes");
        }
        else if (k>s1.length()+s2.length())  {
            System.out.print("Yes");
        }
        else{
            System.out.println("No");
        }
    

    }
}

