package ArrayProblems;///// shif +alt + f ==== format code
/*
public class Array5 {

     public static void main(String args[]) {
          int arr[] = {  -1, 2, -3, 4, 5, 6, -7, 8, 9  };
          int n = arr.length;

          rearrange(arr, n);                           // passing the array[] & our array length vlaue 
          printArray(arr, n);
     }





     static void rearrange(int a[], int i) {          // telling function, an integer array[] , and  a number you will get
          int j=0, temp;

           for(int k=0;  k<i; k++){
                if(a[k]< 0){                           // {  -1, 2, -3, 4, 5, 6, -7, 8, 9  };

                          temp=a[k];
                          a[k] = a[j];
                          a[j]=temp;

                          j++;


                }

           }
     }





     static void printArray(int x[], int n){
          for(int i=0; i<n; i++){
               System.out.println(x[i]);
          }
     }

}

*/


//////////////////////////////////////////////////////////////// A     P    R    P    C    H    2    ///////////////////////////////////////////////////////



public class Array5{
     public static void main(String args[]) {

          int arr[]={-12, 11, -13, -5, 6, -7, 5, -3, -18};
          int arr_size= arr.length;

          int left=0;                                            // left ----> will point 1st index arr[0]                        //left = 0
          int right=arr_size-1;                                  // right ----> will point last index arr[8]                      // 9-1= 8

          shiftall(arr, left, right);
          display(arr, arr_size);
          
     }




     static void shiftall(int a[], int le, int ri){

          while (le <= ri){
               if(  a[le]< 0     &&  a[ri] < 0  ){    // Condition to check if the left // and the right elements are // negative
                    le++;
               }


               else if( a[le] > 0    &&    a[ri]<0){
                    int temp = a[le];//11  //6
                    a[le]= a[ri];// a[1]= -18   
                    a[ri]= temp; //a[8]= 11             {-12, -18, -13, -5, 6, -7, 5, -3, 11};             //  le=2        //  ri=7 

                    le++;
                    ri--;
               }




               else if(a[le]>0  &&  a[ri]>0){
                    ri--;
               }


               else{
                    le++;
                    ri++;
               }

          }


     }






     static void display(int arr[], int n){
          for(int i=0; i<=n; i++){
               System.out.println(arr[i]);
          }
     }
}