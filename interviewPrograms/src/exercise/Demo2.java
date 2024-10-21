package exercise;

public class Demo2 {

    public static void main(String[] args) {
        String[] arr = {"Red", "yellow", "Purple", "blue"};

        for (int i = 0; i < arr.length; i++) {
            StringBuilder modified= new StringBuilder();
            for (char c: arr[i].toCharArray()){
                if (Character.isUpperCase(c)) {
                    modified.append(Character.toLowerCase(c));
                } else if (Character.isLowerCase(c)) {
                    modified.append(Character.toUpperCase(c));
                }else {
                    modified.append(c);
                }
            }
            arr[i]=modified.toString();
        }

        for (String s : arr){
            System.out.println(s);
        }

    }
}
