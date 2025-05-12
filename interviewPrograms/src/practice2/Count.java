package practice2;

public class Count {

    public static void main(String[] args) {
        int num = 1234556444;

        //count number of digits even odd
        int even=0;
        int odd=0;

        while (num!=0){
            int rem = num%10;

            if (rem%2==0) {
                even++;
            }else {
                odd++;
            }
            num=num/10;
        }

        System.out.println("even "+even);
        System.out.println("odd "+odd);
    }


}
