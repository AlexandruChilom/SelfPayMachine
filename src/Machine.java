import java.util.Scanner;

public class Machine {
    public static void main(String[] args) {
        /* 1. Mesaj de intampinare : " Welcome to Kaufland "
        2. Introdu valoarea cumparaturilor : random number
        3. Introdu banii in aparat : random number
        4. Calculeaza restul
        5. Afiseaza bancnotele pe care le primesti
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Kaufland\n");
        System.out.println("Insert the value of your purchased goods: ");
        int valueofpurchasedGoods = sc.nextInt();
        System.out.println("Please insert the money: ");
        int moneyInserted = sc.nextInt();
        int change = moneyInserted - valueofpurchasedGoods;

        System.out.println("Your change is: " + change);

        while (change > 200) {
            System.out.println("200 lei");
            change -= 200;
        }
        while (change > 100) {
            System.out.println("100 lei");
            change -= 100;
        }
        while (change > 50) {
            System.out.println("50 lei");
            change -= 50;
        }
        while (change > 20) {
            System.out.println("20 lei");
            change -= 20;
        }
        while (change > 10) {
            System.out.println("10 lei");
            change -= 10;
        }
        while (change > 5) {
            System.out.println("5 lei");
            change -= 5;
        }
        while (change > 1) {
            System.out.println("1 leu");
            change -= 1;
        }
    }
}
