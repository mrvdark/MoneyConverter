import java.util.Scanner;

public class MoneyConverter {

    public static void main(String[] args) {
        double rate = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap USD: ");
        usd=sc.nextDouble();
        System.out.println(usd+"USD = "+rate*usd+"VND");
    }

}