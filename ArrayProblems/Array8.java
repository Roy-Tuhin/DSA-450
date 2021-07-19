//================================================ M A I N   P R O G R A M E=================================
package ArrayProblems;
import java.util.Scanner;

public class Array8 {

     public static void main(String[] args) {
          System.out.println("Enter how many element you want to enter in your Array");
          int n;
          Scanner sc = new Scanner(System.in);
          n = sc.nextInt();


          System.out.println("Now enter your Elements");
          int arr[]= new int[n];
               for(int i=0; i<n; i++){
                    arr[i]= sc.nextInt();
               }    //System.out.println(Arrays.toString(arr));



               maxSubarraySum(arr, n); 



     }





     public static void maxSubarraySum(int array[], int num){           //{ 5 -4  -2   6  -1}  =6 ans   
          int maxSum=0;
          int curSum=0;

          for(int i=0; i<array.length; i++){
                curSum= curSum+ array[i];               
               if(curSum> maxSum){
                    maxSum= curSum;
                }
                
                if(curSum<0){
                    curSum=0;
                }

          } System.out.println(maxSum);
     }
     
}




//=============================================N O T E S=================================================
// package ArrayProblems;

// import java.util.Arrays;
// import java.util.Scanner;

// public class Array8 {

//      public static void main(String[] args) {
//           System.out.println("Enter how many element you want to enter in your Array");
//           int n;
//           Scanner sc = new Scanner(System.in);
//           n = sc.nextInt();


//           System.out.println("Now enter your Elements");
//           int arr[]= new int[n];
//                for(int i=0; i<n; i++){
//                     arr[i]= sc.nextInt();
//                }    //System.out.println(Arrays.toString(arr));





//                // int result = maxSubarraySum(arr, n);           // when function return any value
//                // System.out.println(result);
//                maxSubarraySum(arr, n); 



//      }




//      public static void maxSubarraySum(int array[], int num){              // return type must be int // if we wanna return value
//           int maxSum=0;
//           int curSum=0;

//           for(int i=0; i<num-1; i++){
                               
//                if(curSum> maxSum){
//                     maxSum= curSum;
//                 }
                
//                 if(curSum<0){
//                     curSum=0;
//                 }

//           }//return maxSum; 
//           System.out.println(maxSum);
//      }
     
// }
