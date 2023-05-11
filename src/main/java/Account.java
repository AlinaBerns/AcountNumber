
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
        String regex = "\\d{3}-\\d{7}-\\d{2}";
        if ((!accountNumber.matches(regex)) && (accountNumber.length() != 12) && !checkNumbers()) {
            throw new IllegalArgumentException("Not possible");
        }
            this.accountNumber = accountNumber;


            //Wanneer het formaat van het rekeningnummer niet juist
            // is moet er een exception worden gegooid.
        }

    private boolean checkNumbers () {
        long num1 = Long.parseLong(accountNumber.substring(0,10));
        long num2 = Long.parseLong(accountNumber.substring(11,12));
        long num3 = num1 % 97;

        return num3 == num2;
    }


    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                '}';
    }
}
