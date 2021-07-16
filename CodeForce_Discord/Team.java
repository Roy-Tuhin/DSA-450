package CodeForce_Discord;

import java.util.Scanner;

public class Team {
     public static void main(String args[]) {
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt(); // 3 quiz problem

          int view = 0;
          int count = 0; // the count of no of friends which are sure of hte solution
          int problemsCount = 0; // problem they solve//output

          for (int i = 1; i <= n; i++) { // loop for problem-->1,2,3.

               count = 0;

               for (int j = 1; j <= 3; j++) {
                    view = sc.nextInt();
                    if (view == 1) {
                         count++;
                    }
               }

               if (count >= 2) {
                    problemsCount++;
               }

          }

          System.out.println(problemsCount);

     }

}