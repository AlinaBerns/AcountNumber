import java.util.Objects;

//Implementeer de UML
public class Account {
    private String accountNumber;
    public String newAccNumber;

    public Account(String accountNumber) {
        setAccountNumber(accountNumber);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    //public Account createNewAccount (String accountNumber) {
    //return new Account(accountNumber);
    //}
    private void setAccountNumber(String accountNumber) {

        //De formaat van het rekeningnummer moet zijn:
        // 3 cijfers - 7 cijfers - 2 cijfers
        String regex = "\\d{3}-\\d{7}-\\d{2}";
        if (accountNumber.length() != 12 && !accountNumber.matches(regex)) {
            throw new IllegalArgumentException("Not possible");
        }
        this.accountNumber = accountNumber;
        //checkAccount();

        //Wanneer het formaat van het rekeningnummer niet juist
        // is moet er een exception worden gegooid.
    }

    //Ik weet het niet...!!!
    private String replaceAllNumbers(){

        return this.accountNumber.replaceAll("[\\s\\-()]", "");
    }
    public void checkAccount(){
        newAccNumber = replaceAllNumbers();
        System.out.println(newAccNumber);

        if (Long.parseLong(newAccNumber.substring(0,10)) != Long.parseLong(newAccNumber.substring(11,12))) {
            throw new IllegalArgumentException("smthng wrong");
        }

    }


    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account)) return false;
        Account account = (Account) o;
        return Objects.equals(getAccountNumber(), account.getAccountNumber()) && Objects.equals(newAccNumber, account.newAccNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAccountNumber(), newAccNumber);
    }
}
