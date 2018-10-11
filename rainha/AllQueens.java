
package rainha;

import java.util.Scanner;


public class AllQueens {

    public static void main(String[] args) {
       Scanner stdin= new Scanner(System.in);
       System.out.println("Numero de rainha a colocar? ");
       int nr=stdin.nextInt();
       
       Queens q= new Queens(nr);
       q.colocaRainha();
    }
    
}
