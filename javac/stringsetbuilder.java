public class stringsetbuilder {
    public static void main(String[] args) {
   StringBuilder st = new StringBuilder("Sunny");
   System.out.println(st);
   System.out.println(st.length());
   System.out.println(st.capacity());
   System.out.println(st.toString());
   System.out.println(st.reverse());
   st.setCharAt(0, 'u');
   System.out.println(st);
    }
}
