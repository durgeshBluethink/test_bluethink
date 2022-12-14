import java.util.Random;

public class randam_number {
    public static void main(String[] args) {
        Random random = new Random();
        // Generates Random float values
        int a = random.nextInt(100);
        int b = random.nextInt(1000);

        // Prints random integer values
        System.out.println("Randomly Generate number");
        System.out.println(a);
        System.out.println(b);

    }
}
