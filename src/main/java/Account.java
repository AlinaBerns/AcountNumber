
//Implementeer de UML
public class Account {
    private String accountNumber;

    public Account(String accountNumber) {
        setAccountNumber(accountNumber);
    }

    //public Account createNewAccount (String accountNumber) {
        //return new Account(accountNumber);
    //}
    private void setAccountNumber(String accountNumber) {

        //De formaat van het rekeningnummer moet zijn:
        // 3 cijfers - 7 cijfers - 2 cijfers
        if (accountNumber.matches("[0-9+]") && accountNumber.length() == 12) {
            String regex = "\\d{3}-\\d{7}-\\d{2}";
            this.accountNumber = (accountNumber).replaceAll(accountNumber, regex);
        }


        long num1 = Long.parseLong(accountNumber.substring(0,10));
        long num2 = Long.parseLong(accountNumber.substring(11,12));

        //Wanneer het formaat van het rekeningnummer niet juist
        // is moet er een exception worden gegooid.
        //throw new IllegalArgumentException("Not possible");

        }


    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                '}';
    }
}
