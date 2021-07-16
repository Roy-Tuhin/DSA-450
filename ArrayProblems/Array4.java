package ArrayProblems;

public class Array4 {
     public static void main(String args[]) {
          int arr[] = { 1, 0, 0, 1, 0, 2, 2 };

          int Z = 0;
          int One = 0;
          int T = 0;

          for (int i = 0; i < arr.length; i++) { // This is how to access and print Array element
               // System.out.println(arr[i]);

               if (arr[i] == 0) {
                    Z++;
               } else if (arr[i] == 1) {
                    One++;
               } else if (arr[i] == 2) {
                    T++;
               }
          }
          // System.out.println(Z);
          // System.out.println(One); // will show---> value of Zero=3, One=2, & Two=2
          // System.out.println(T);

          // Now perform a loop Until Z, One, T variable VALUE ==0
          for (int j = 0; j <= Z; j++) {
               arr[j] = 1779;

          } // =============================================================================

          /*
           * for (int i = 3; i <= 4; i++) { arr[i] = 1;
           * 
           * } //
           * =============================================================================
           * 
           * for (int i = 5; i <= 6; i++) { arr[i] = 9;
           * 
           * } //
           * =============================================================================
           */
          for (int i = 0; i < arr.length; i++) { // This is how to access and print Array element
               System.out.println(arr[i]);
          }
     }
}