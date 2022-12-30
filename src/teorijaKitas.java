public class teorijaKitas {

    public static void teorijaKitas(String[] args) {
        int[] nums = rndIntArr(60,-160,200);
        printIntArr(nums);
        nums = rndIntArr(60,-160,200);
        printIntArr(nums);
        nums = rndIntArr(60,-160,200);
        printIntArr(nums);
        nums = rndIntArr(60,-160,200);
        printIntArr(nums);

        nums = rndIntArr(60,-160,200);
        printIntArr(nums);
        nums = rndIntArr(60,-160,200);
        printIntArr(nums);
        nums = rndIntArr(60,-160,200);
        printIntArr(nums);
    }

    public static void printIntArr(int[] arr){
        String res = "";
        for (int i = 0; i < arr.length; i++) {
            res += arr[i] + ", ";
        }
        System.out.println( res.substring(0,res.length() -2) + "." );
    }

    public static int[] rndIntArr(int length, int min, int max){
        int[] nums = new int[length];
        for (int i = 0; i < length; i++) {
            nums[i] = (int) (min + Math.round(Math.random() * (max - min)));
        }
        return nums;
    }
}
