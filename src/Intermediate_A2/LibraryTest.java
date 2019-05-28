package Intermediate_A2;

import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {
    private static final Logger log = LoggerFactory.getLogger(LibraryTest.class);

    @BeforeEach
    void init() {
        log.info("before each method of Library");
    }

    @AfterEach
    void tearDown() {
        log.info("after each method of Library");
    }

    @Test
    void rentBook() {
        int expected = 4;
        int actual = 2 + 2;
        assertEquals(expected, actual, "INCONCEIVABLE!");
        //
        Object nullValue = null;
        assertFalse(nullValue != null);
        assertNull(nullValue);
        assertNotNull("A String", "INCONCEIVABLE!");
        assertTrue(nullValue == null);
    }

    @Test
    @DisplayName("Dummy test")
    void returnBook() {
        int expected = 4;
        int actual = 2 + 2;
        Object nullValue = null;

        assertAll(
                "Assert All of these",
                () -> assertEquals(expected, actual, "INCONCEIVABLE!"),
                () -> assertFalse(nullValue != null),
                () -> assertNull(nullValue),
                () -> assertNotNull("A String", "INCONCEIVABLE!"),
                () -> assertTrue(nullValue == null));
    }
}