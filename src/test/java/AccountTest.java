import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    @Test
    void shouldBeDisplayedCorrectlyInTheConsole() {
        Account account = new Account("321-3213211-23");

        String expectedNumber = "321-3213211-23";

        String actualNumber = account.getAccountNumber();

        assertEquals(expectedNumber, actualNumber);

    }

    //@Test
    //void mustReturnZeroIfTheLastTwoNumbersDoNotMatchTheRemainderOfTheDivisionOfTheFirstTenNumbersBy97(){}

    @ParameterizedTest
    @ValueSource(strings = {"432-4325687-24", "235-5423345-57", "345-5432453-54"})
    void shouldThrowIllegalArgumentExceptionWhenNumberIsNotCorrect(String notCorrectNumber) {
        Executable executable = () -> new Account(notCorrectNumber);

        assertThrows(IllegalArgumentException.class, executable);
    }
    @ParameterizedTest
    @ValueSource(strings = {"000-0000000-00", "235-5423345-57", "345-5432453-54"})
    void shouldReturnEqualsIfNumberHasOnlyNulls(String notCorrectNumber) {
        Account account = new Account(notCorrectNumber);
        Account test = new Account("000-0000000-00");

        assertEquals(account,test);
    }

    @Test
    void shouldReturnEqualsIfNumberIsEmpty() {
        Account account = new Account(" ");
        Account test = new Account(" ");

        assertEquals(test, account);
    }
}
