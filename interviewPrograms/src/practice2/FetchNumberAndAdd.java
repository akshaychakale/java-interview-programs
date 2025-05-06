package practice2;

public class FetchNumberAndAdd {
    public static void main(String[] args) {
        String s="s2r8f4g3";

        String str = s.replaceAll("[a-z]", "");
        System.out.println(str);

        int count=0;
        for (char c: str.toCharArray()){
            int n = Integer.parseInt(String.valueOf(c));
            count+=n;
        }
        System.out.println(count);
    }
}
