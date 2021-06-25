package CodeForce_Discord;

import java.util.Scanner;

public class NextRound4 {
     public static void main(String args[]){
          int n,k,arr[],next=0,i;

          Scanner sc=new Scanner(System.in); 
          System.out.println("Enter Total number of participents:");
          n = sc.nextInt();

          System.out.println("Enter which participents marks to compare.. suppose(5th boys).... the boy in 5th got 20 ... now how many boys got >20 or ==20? :");
          k = sc.nextInt();



          arr = new int[n];                                        // number of elements we want in our array
          System.out.println("Enter All Marks Participents get:");
          for(i=0; i<n; i++){                                            // 10,9,8,7,7,7,5,5 will enter into the array
               arr[i] = sc.nextInt();


               if(arr[i] >= arr[k-1] && arr[i]>0)
               next++;
               
          }
          System.out.println("===================");
          System.out.println(next);
          

         

     }
}
