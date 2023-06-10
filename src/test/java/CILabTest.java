import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CILabTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {
        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }

    @Test
    public void getStringTest() {
        assertNull(myString.getString());
    }

    @Test
    public void setStringTest() {
        String testString = "Hello, World!";
        myString.setString(testString);
        assertEquals(testString, myString.getString());
    }

    @Test
    public void detectCapitalUseTest1() {
        myString.setString("USA");
        assertTrue(myString.detectCapitalUse());
    }

    @Test
    public void detectCapitalUseTest2() {
        myString.setString("leetcode");
        assertTrue(myString.detectCapitalUse());
    }

    @Test
    public void detectCapitalUseTest3() {
        myString.setString("Google");
        assertTrue(myString.detectCapitalUse());
    }

    @Test
    public void detectCapitalUseTest4() {
        myString.setString(null);
        assertFalse(myString.detectCapitalUse());
    }

    @Test
    public void detectCapitalUseTest5() {
        myString.setString("HelloWorld");
        assertFalse(myString.detectCapitalUse());
    }


    
}
