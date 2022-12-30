public class teorija {
    public static void teorija(String[] args) {

        sayHi();
        double simPI = simplifiedPI();
        System.out.println(simPI);
        System.out.println(sumInt(16, 30));
        sayToHi("Jonai");

        String lopas = "Jurgis";
        sayToHi(lopas);
    }

    public static void sayToHi(String name) {
        System.out.println("Labas rytas " + name);
    }

    public static int sumInt(int a, int b) {
        return a + b;
    }

    public static void sayHi() {
        System.out.println("Labas rytas");
    }

    public static double simplifiedPI() {
        return 3.14;
    }
}