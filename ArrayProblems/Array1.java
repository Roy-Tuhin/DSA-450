//..................................................... Reverse Array element.....................................................
package arrayProblemsPkg;


public class Array1 {

    public static void main(String args[]) {
        int a[] = {7, 5, 3, 9, 5};

        fun(a, 0, 4);

    }

    public static void fun(int a[], int start, int end) {
        int temp;
        while (start < end) {
            temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
            System.out.println("tracking?");
        }
    }
}
