import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SavingAccount {

    private double balance;
    private String name;
    private double bunga;

    public SavingAccount(String name, double balance, double bunga) {
        this.balance = balance;
        this.name = name;
        this.bunga = bunga;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double cash) {
        double deposit = balance + (balance * bunga) + cash;
        this.balance += deposit;
    }

    public void addToData() {
        try {

            String fileName = "C:/Users/LENOVO/IdeaProjects/PBO 7/src/DataUang.txt";


            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            reader.close();

            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            String ubah = String.valueOf(balance);
            writer.write(ubah);
            writer.newLine();
            writer.close();

        } catch (IOException e) {
            System.out.println("file tidak tersedia : " + e.getMessage());
        }
    }

}
