package Basic_A1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    void getName() {
        Account myAccount = new Account("Simon", 02233, 1423);
        assertEquals("Simon", myAccount.getName());
    }

    @Test
    void setName() {
        Account myAccount = new Account("Annina", 04455, 1933);
        assertEquals("Anna", myAccount.getName());
    }

    @Test
    void getAccNumber() {
        Account myAccount = new Account("Mark", 12234, 1234);
        assertEquals(12234, myAccount.getAccNumber());
    }

    @Test
    void setAccNumber() {
        Account myAccount = new Account("Benjamin", 12233, 1423);
        assertEquals(12233, myAccount.getAccNumber());
    }

    @Test
    void getAccPin() {
        Account myAccount = new Account("Warmhud", 14455, 1556);
        assertEquals(14455, myAccount.getAccPin());
    }

    @Test
    void setAccPin() {
        Account myAccount = new Account("Gregor", 15566, 1342);
        assertEquals(1342, myAccount.getAccPin());
    }
}