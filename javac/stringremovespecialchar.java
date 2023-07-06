public class stringremovespecialchar {
    public static void main(String[] args) {
    String str ="Su#%nn@*y";
    String sd = str.replaceAll("[^a-zA-Z0-9]","");
    System.out.println(sd);
    }
}
