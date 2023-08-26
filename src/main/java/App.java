import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.spi.DecimalFormatSymbolsProvider;

public class App {
    public static void main(String[] args) {
        //int num = Integer.parseInt(String.valueOf(123));
        //int num2 = Integer.parseInt(String.valueOf(4561238));
        //int num3 = Integer.parseInt(String.valueOf(12));
        //String accountNumber = (num + "-" + num2 + "-" + num3);




        //System.out.println(accountNumber);

        Account account = new Account("987-6543214-13");

        System.out.println(account);

        account.checkAccount();
    }
}
