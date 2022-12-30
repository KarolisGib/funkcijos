public class Main {

    public static void main(String[] args) {

//        sumInt(5, 6);
//        PISq();
//        System.out.println(multip(5, 10));


        int[] nums = rndIntArr(5);
        System.out.println(nums);


    }

    // uzduotis lengvesnis 1
    public static void sumInt(int a, int b) {
        System.out.println(a + b);
    }

// uzduotis lengvesnis 2

    public static double PISq() {
        return 3.14 * 3.14;
    }

// uzduotis lengvesnis 3

    public static int multip(int a, int b) {
        return a * b;
    }

// uzduotis lengvesnis 4

//    public static int[] arr1() {
//        int[] a = new int[];
//        for (int i = 0; i < int[le]; i++) {
//            a[i];
//        }
//        return a;
//    }

// uzduotis lengvesnis 5

    public static int[] rndIntArr(int length){
        int[] nums = new int[length];
        for (int i = 0; i < length; i++) {
            nums[i] = (int) (Math.round(Math.random()));
        }
        return nums;
    }

// uzduotis lengvesnis 6
// uzduotis lengvesnis 7
// uzduotis lengvesnis 8

    public static String kvadratas(int row, int column){
    for (int i = 1; i < row; i++) {
            System.out.println();
        for (int j = 1; j < column; j++) {
                System.out.print(" * ");
        }
        }
    }
// uzduotis lengvesnis 9
// uzduotis lengvesnis 10


}