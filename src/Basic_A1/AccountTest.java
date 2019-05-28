package Basic_A1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void getName() {
        Account myAccount = new Account("Simon The Great", 01020103, 1423);
        assertEquals("Simon The Great", myAccount.getName());
    }

    @Test
    void setName() {
    }

    @Test
    void getAccNumber() {
    }

    @Test
    void setAccNumber() {
    }

    @Test
    void getAccPin() {
    }

    @Test
    void setAccPin() {
    }
}