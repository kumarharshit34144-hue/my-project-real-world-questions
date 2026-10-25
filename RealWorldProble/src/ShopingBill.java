import java.util.*;
public class ShopingBill {
    public static void main(){
        Scanner sc= new Scanner(System.in);
        int[] price=new int[3];
        int[] quentity=new int[3];
        int total=0;
        System.out.println("Enter price of three product :");
        for(int i = 0 ; i < 3 ; i++) {
            price[i] = sc.nextInt();
        }
        System.out.println("Enter quantity of three product :");
        for(int i = 0 ; i < 3 ; i++) {
            quentity[i] = sc.nextInt();
        }
        for(int i = 0 ; i < 3 ; i++){
            int cost=price[i]*quentity[i];
            total=total+cost;
        }
        int dic=total*10/100;
        int bill=total-dic;
if(total>=2500){

    System.out.println("Discount : "+ dic);
    System.out.println("Final Bill :"+ bill);
}
else{
    System.out.println("Discount 0.");
    System.out.println("Final bill : "+ total);
}

    }
}
