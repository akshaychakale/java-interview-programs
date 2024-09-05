package basic;

public class AddNumberFromString {
    public static void main(String[] args) {
        String s = "as2 re3 swfg4 gdg12";
        String[] strarray =s.split(" ");

        int sum=0;
        for (int i = 0; i < strarray.length; i++) {
            String n = strarray[i].replaceAll("[a-z ]", "");
            int nums=Integer.parseInt(n);
            sum+=nums;

        }

        System.out.println(sum);


    }
}
