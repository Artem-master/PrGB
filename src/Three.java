import java.util.Arrays;

public class Three {
    public static void main(String[] args) {
        changeArr();
        fillArr();
        incArr();
        bivArr();
        fiveArr(5,8);
    }
    public static void changeArr () {
        int [] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        for (int i = 0; i < arr.length; i++) {
            if (arr [i] == 1) {
                arr [i] = 0;
            } else if (arr [i] == 0) {
                arr [i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void fillArr () {
        int [] arr1 = new int[100];
        for (int i = 0; i < arr1.length; i++) {
            arr1 [i] = i+1;
        }
        System.out.println(Arrays.toString(arr1));
    }
    public static void incArr () {
        int [] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr [i] < 6) {
                arr [i] = arr [i] * 6;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void bivArr (){
        int[][] arr = new int[5][5];
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                if (arr[r] == arr [c]) {
                    arr [r][c] = 1;
                }
                System.out.print(arr[r][c] + " ");
            }
            System.out.println();
        }
    }
    public static int [] fiveArr (int len, int initialValue){
        int [] arr = new int[len];
        Arrays.fill(arr, initialValue);
        System.out.print(Arrays.toString(arr));
        return arr;
    }
}
