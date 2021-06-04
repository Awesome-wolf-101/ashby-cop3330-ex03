import java.util.Scanner;

public class APP {

    public static void main(String[] args) {
        System.out.println("What is the quote?");
        Scanner sc = new Scanner(System.in);
        String Quote = sc.nextLine();
        System.out.println("Who said it?");
        String QuoteSayer  = sc.nextLine();
        System.out.print(QuoteSayer + ", says \"");
        System.out.print(Quote + "\"");

    }
}
