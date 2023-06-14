public class Draft {
    public static void main(String[] args) {
        String s = "Hell{o w}orld!";
        System.out.println(s);
        String t = s.replaceAll("[{}]", "");
        System.out.println(t);
    }
}