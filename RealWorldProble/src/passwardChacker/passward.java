package passwardChacker;
import java.util.*;
public class passward {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter User Name : ");
        String user = sc.next();
        System.out.println("Enter Password : ");
boolean is=false;
        String correct = "@harshit33";
        for (int i = 1; i <= 3; i ++) {
            String pass = sc.next();
            if (pass.equals(correct)){
                System.out.println("succes");
                is=true;
break ;
            }
            else{

                System.out.println("Incorrect");
            }
        }
        if(!is){
            System.out.println("locked!");
        }
    }
}