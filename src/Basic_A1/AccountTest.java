package Basic_A1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void deposit() {
        Account my = new Account("Harry", 3245, 10.0f);
        assertEquals(true, my.deposit(5));
        assertEquals(false, my.deposit(-5));
        assertEquals(true, my.deposit(0));
        assertEquals(my.getBalance() == 15.0f, my.deposit(5));
        assertEquals(my.getBalance()== 10.0f, my.deposit(-5) );
    }

    @Test
    void withdraw() {
    }

    @Test
    void addInterest() {
    }

    @Test
    void getBalance() {
    }

    @Test
    void getAccountNumber() {
    }

    @Test
    void toString1() {
    }
}