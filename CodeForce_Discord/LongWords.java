package CodeForce_Discord;
import java.util.Scanner;

public class LongWords {
     public static void main(String args[]){

          Scanner sc = new Scanner(System.in);
          int wNumber = sc.nextInt();                 // how many #word u will type? #### 4

          for(int i=0; i<wNumber; i++){
               String word = sc.next();                 // will enter word one by one// suppose coutn=4,so 4 word will be add

               int wLen = word.length();

               if(wLen > 10){
                    word = word.charAt(0)    +    ""   +   (wLen-2)        +  word.charAt(wLen-1);  
                    System.out.println(word);     
               }else{
                    System.out.println(word);    
               }
          
          }


     }
}
