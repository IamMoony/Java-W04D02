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
        assertEquals(15, my.getBalance());
        assertEquals(false, my.deposit(-5));
        assertEquals(15, my.getBalance());
        assertEquals(true, my.deposit(0));
        assertEquals(15, my.getBalance());
        assertEquals(true, my.deposit(2.5f));
        assertEquals(17.5f, my.getBalance());
    }

    @Test
    void withdraw() {
        Account my = new Account("Simon", 14433, 10.0f);

        assertEquals(true, my.withdraw(2, 2));
        assertEquals(6, my.getBalance());
        assertEquals(false, my.withdraw(-2, -2));
        assertEquals(6, my.getBalance());
        assertEquals(false, my.withdraw(5, 2));
        assertEquals(6, my.getBalance());
        // Test end
        assertEquals(false, my.withdraw(5, -2));
        assertEquals(6, my.getBalance());
        assertEquals(false, my.withdraw(-5, 2));
        assertEquals(6, my.getBalance());


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