package ex25;

public class Main {
        public static void main(String[] args) {
            Customer c1 = new Customer(101, "Chiến", 'm');
            Account a1 = new Account(1001, c1, 500);

            System.out.println(a1);
            a1.deposit(200);
            System.out.println(a1);
            a1.withdraw(900);
            System.out.println(a1);
        }

}
