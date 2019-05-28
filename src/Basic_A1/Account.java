package Basic_A1;

public class Account {

    private String name;
    private int accNumber;
    private int accPin;


    public Account(String name, int accNumber, int accPin) {

        this.name = name;
        this.accNumber = accNumber;
        this.accPin = accPin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public int getAccPin() {
        return accPin;
    }

    public void setAccPin(int accPin) {
        this.accPin = accPin;
    }
}
