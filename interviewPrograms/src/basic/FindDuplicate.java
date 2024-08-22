package basic;

public class FindDuplicate {
    public static void main(String[] args) {

        String[] cars = {"Honda", "KIA", "tata", "KIA"};

        for (int i = 0; i < cars.length; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[i].equals(cars[j])) {
                    System.out.println("Duplicate element : " + cars[i]);
                }
            }
        }
    }
}
