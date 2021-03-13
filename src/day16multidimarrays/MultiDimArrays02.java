package day16multidimarrays;

public class MultiDimArrays02 {
    /*
     Find the sum of all elements in the multidimensional array
     */
    public static void main(String[] args) {

        int arr[][] = {{3, 4}, {5}, {6, 8, 4}, {2, 9}};

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                sum = sum + arr[i][j];

            }
        }
        System.out.println(sum);


    }
}
