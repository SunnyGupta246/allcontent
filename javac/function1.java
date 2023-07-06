import java.util.*;
public class function1 {
//     public static void printmyname(String name )
//     {
// System.out.println(name);
//     }
public static void sum(int a , int b)
{
    System.out.println(a+b);
}
    public static void main(String[] args) {         //system is class 
  Scanner sc =new Scanner(System.in);    
//   String name =sc.nextLine();
int a =sc.nextInt();
int b =sc.nextInt();

//   printmyname(name);
sum(a, b);
    }
}