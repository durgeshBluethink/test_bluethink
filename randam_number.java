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

        // Generates Random float values
        float f = random.nextFloat();
        float i = random.nextFloat();

        // Prints random float values
        System.out.println("Randomly Generated Float Values");
        System.out.println(f);
        System.out.println(i);

        // Generates Random Long values
        long p = random.nextLong();
        long q = random.nextLong();

        // Prints random long values
        System.out.println("Randomly Generated Long Values");
        System.out.println(p);
        System.out.println(q);

        // Generates Random boolean values
        boolean m = random.nextBoolean();
        boolean n = random.nextBoolean();
        
        // Prints random boolean values
        System.out.println("Randomly Generated Boolean Values");
        System.out.println(m);
        System.out.println(n);

    }
}
