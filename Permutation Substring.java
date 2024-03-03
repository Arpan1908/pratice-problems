public class Main {
    public static void main(String[] args) {
        permutations("", "abc");
    }

    static void permutations(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i);
            permutations(f + up.charAt(0) + s, up.substring(1));
        }
    }
}
