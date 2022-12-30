import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//    sumInt(5, 6);

//    System.out.println(PISq());

//    System.out.println(multip(5, 10));

//    int[] arr = {1,2,3,4,5};
//        arr1(arr);

        int[] masyvas = rndArr();
        for (int i = 0; i < masyvas.length; i++) {
//            System.out.print(masyvas[i] + " ");
        }

//        System.out.println(sum(masyvas));

//        System.out.println(med(masyvas));

//    kvadratas(5, 3);
        String tekstas = "Siandien labai grazi diena";
//        count(tekstas);

//    kodas("Karolis");


    }

    // uzduotis lengvesnis 1
    public static void sumInt(int a, int b) {
        System.out.println(a + b);
    }

// uzduotis lengvesnis 2

    public static double PISq() {
        return 9.8596;
    }

// uzduotis lengvesnis 3

    public static int multip(int a, int b) {
        return a * b;
    }

// uzduotis lengvesnis 4

    public static void arr1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

// uzduotis lengvesnis 5

    public static int[] rndArr() {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.round(Math.random() * 100));
        }
        return arr;
    }

// uzduotis lengvesnis 6

    public static int sum(int[] arr) {
        return Arrays.stream(arr).sum();
    }

// uzduotis lengvesnis 7

    public static double med(int[] arr) {
        return sum(arr) / (arr.length * 1.0);
    }

// uzduotis lengvesnis 8

    public static String kvadratas(int row, int column) {
        for (int i = 1; i <= row; i++) {
            System.out.println();
            for (int j = 1; j <= column; j++) {
                System.out.print(" * ");
            }
        }
        return " * ";
    }
// uzduotis lengvesnis 9

    public static void count(String text) {
        int txt = text.length();
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
                count++;
            }
        }
        System.out.println("Tekste raidziu yra: " + count + " o tarpu: " + (txt - count));
    }

// uzduotis lengvesnis 10

    public static String kodas(String text) {
        System.out.println(new StringBuilder(text).reverse());
        return text;
    }
}