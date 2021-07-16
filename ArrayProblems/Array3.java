package ArrayProblems; //kth Max and Min element in a Array

public class Array3 {
     public static void main(String args[]) {
          int arr[] = { 3, 8, 4, 7 };
          int arr_size = arr.length;

          bubble_sort(arr, arr_size);
          System.out.println((arr_size - 3));
     }

     public static void bubble_sort(int a[], int n) {

          for (int r = 1; r <= n - 1; r++) {

               for (int i = 0; i <= n - 1 - r; i++) {
                    if (a[i] > a[i + 1]) {
                         int temp = a[i];
                         a[i] = a[i + 1];
                         a[i + 1] = temp;
                    }
               }
          }
     }
}
