
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner automat = new Scanner(System.in);
        Account sparkonto = new Account(300);
        Account lohnkonto = new Account(12);
        int konto;
        boolean exit = false;
        while (!exit) {
            System.out.println("Hello There, Name a About  of Cash that you want to work with");
            int amount = automat.nextInt();
            System.out.println("what would u like to do ? 1. u can add the amout to ur Konto(1) or withdraw it(2) With (0) u can exit");
            Scanner select = new Scanner(System.in);
            int select1 = select.nextInt();
            System.out.println("Für Lohnkonto wählen Sie 1, für Sparkonto wählen Sie 2");
            int kontoselect = select.nextInt();
            if (kontoselect == 1) {
                switch (select1) {
                    case 1:
                        sparkonto.deposit(amount);
                        konto = sparkonto.getBalance();
                        System.out.println("ur Konto is now " + konto);
                        break;
                    case 2:
                        sparkonto.withdraw(amount);
                        konto = sparkonto.getBalance();
                        System.out.println("ur Konto is now " + konto);
                        break;
                    case 0:
                        System.out.println("Good Bye");
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid Input");
                        break;
                }
            } else if (kontoselect == 2) {
                switch (select1) {
                    case 1:
                        lohnkonto.deposit(amount);
                        konto = lohnkonto.getBalance();
                        System.out.println("ur Konto is now " + konto);
                        break;
                    case 2:
                        lohnkonto.withdraw(amount);
                        konto = lohnkonto.getBalance();
                        System.out.println("ur Konto is now " + konto);
                        break;
                    case 0:
                        System.out.println("Good Bye");
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid Input");
                        break;
                }
            } else {
                System.out.println("Invalid Input");
            }
        }
    }


}