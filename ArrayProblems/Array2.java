// Max and Min element in a Array
package ArrayProblems;

public class Array2 {
     public static void main(String args[]) {

          int arr[] = { 2, 4, 6, 7, 8, 6, 0 };
          int arr_size = arr.length;

          getMinMax(arr, arr_size); // F u c t i o n call
     }

     public static void getMinMax(int[] arr, int arr_size) {
          int min, max;

          if (arr[0] > arr[1]) {
               max = arr[0];
               min = arr[1];
          } else {
               max = arr[1];
               min = arr[0];
          }

          for (int i = 0; i < arr_size; i++) {

               if (arr[i] > max) {
                    max = arr[i];
               } else if (arr[i] < min) {
                    min = arr[i];
               }
          }
          System.out.println(max);
          System.out.println(min);

     }
}
