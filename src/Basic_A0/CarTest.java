package Basic_A0;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void getKw() {
    }

    @org.junit.jupiter.api.Test
    void setKw() {
    }

    @org.junit.jupiter.api.Test
    void getSpeed() {
    }

    @org.junit.jupiter.api.Test
    void setSpeed() {
    }

    @org.junit.jupiter.api.Test
    void getModel() {
    }

    @org.junit.jupiter.api.Test
    void setModel() {
    }

    @org.junit.jupiter.api.Test
    void getManufacturer() {
        Car myCar = new Car("Auris", 140, "200", "Toyota");
        assertEquals("BMW", myCar.getManufacturer());
    }

    @org.junit.jupiter.api.Test
    void setManufacturer() {
    }
}