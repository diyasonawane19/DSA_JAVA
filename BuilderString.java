public class BuilderString {
    public static void main(String[] args) {

       StringBuilder sb = new StringBuilder("Diya");
       System.out.println(sb);
       System.out.println(sb.charAt(0));
       sb.setCharAt(0,'R');
       System.out.println(sb);
       sb.insert(0,'P');
       System.out.println(sb);

       sb.insert(4, 'a');
       System.out.println(sb);
       sb.delete(0, 1);    // delete the first character(n,n+1)
       System.out.println(sb);

       StringBuilder sb2 = new StringBuilder("H");
       sb2.append("e");
         sb2.append("l");
            sb2.append("l");
                sb2.append("o");
                System.out.println(sb2);
                System.out.println(sb2.length());
    }
}
