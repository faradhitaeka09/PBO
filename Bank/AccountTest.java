import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = input.nextLine();

        System.out.print("masukan balance: ");
        double balance = input.nextDouble();

        System.out.print("masukan bunga: ");
        double bunga = input.nextDouble();

        SavingAccount savingAccount = new SavingAccount(name,balance, bunga);

        System.out.println("name: " + savingAccount.getName());
        System.out.println("balance: " + savingAccount.getBalance());

        System.out.print("masukan cash: ");
        double cash = input.nextDouble();

        savingAccount.deposit(cash);

        System.out.println("update deposit " + savingAccount.getBalance());

        savingAccount.addToData();
    }
}
