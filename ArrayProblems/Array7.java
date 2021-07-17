package ArrayProblems;
import java.util.Arrays;
import java.util.Scanner;

// public class Array7 {
//      public static void main(String[] args) {
//           int n;
//           Scanner sc = new Scanner(System.in);                     // taking input from user
//           n = sc.nextInt();

//           System.out.println("you enter: " + n);
//      }
     
// }



// public class Array7 {
//      public static void main(String[] args) {
//           int n;
//           Scanner sc = new Scanner(System.in);
//           n = sc.nextInt();

//           int a[]=new int[n];                                      // entering elements in array By user
//           for(int i=0; i<n;i++){
//               a[i]=sc.nextInt();
//           }

//           System.out.println("============================");

//           for(int i=0; i<n;i++){
//                System.out.println(a[i]);
//           }
//      }
     
// }











public class Array7 {
     public static void main(String[] args) {
          int n;
          Scanner sc = new Scanner(System.in);
          n = sc.nextInt();

          int arr[]=new int[n];
          for(int i=0; i<n;i++){
              arr[i]=sc.nextInt();
          }



          rotate(arr,n);
     }






     private static void rotate(int array[], int num) {         //{1,2,3,4,5}

          int x= array[num-1];     //array[5-1]//4 = 5     //   {5,   2,3,4,_}            // last element in variable X



          
          for(int i=num-1; i>0 ; i-- ){
               array[i]=array[i-1];                         // a[4] = value in a[3]   // 4      // a[4]=4      //   {_,   2,3,_,4}    
          }



          array[0]=x;                                       // last element in 1st position in  our array  


 



                    
          for(int i=0; i<num;i++){
               System.out.print(array[i]);
          }
         // System.out.println(Arrays.toString(array));



     }
     
}

