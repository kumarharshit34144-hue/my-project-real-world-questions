import java.util.*;
public class ATMWidraaw {
    static void atm(){
        Scanner sc=new Scanner(System.in);
        System.out.println("\u001B[33mEnter Bank BAllance : ");
        double balance=sc.nextDouble();
        System.out.println("\u001B[33mEnter Withdrawal : ");
        int wid=sc.nextInt();
        double c=balance-wid;
        if(c<0){
            System.out.println("\u001B[31mYour can't widraw : ");
        }
        else{
            System.out.println("\u001B[32mWithdrawal successful.");
            System.out.println("\u001B[32mReamining amount is "+ c +".");
        }
    }
    public static void main(String[] args){
      atm();
    }
}
