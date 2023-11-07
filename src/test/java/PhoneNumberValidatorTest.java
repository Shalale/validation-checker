import org.example.Output;
import org.example.PhoneNumberValidation;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneNumberValidatorTest {

    PhoneNumberValidation validation = new PhoneNumberValidation();

    @Test
    public void testValidPhoneNumber() {
        String phoneNumber = "0 0 30 69 74 0 9 22 52";
        assertTrue(validation.isValid(phoneNumber));

        phoneNumber = "2 10 69 30 6 6 4";
        assertTrue(validation.isValid(phoneNumber));
    }

    @Test
    public void testInvalidPhoneNumber() {
        String phoneNumber = "30 2 5 58";
        assertFalse(validation.isValid(phoneNumber));

        phoneNumber = "2 10 69 30 6 60 4";
        assertFalse(validation.isValid(phoneNumber));
    }

    @Test
    public void testSimpleValidationOutputValid() {
        Output output = new Output();
        String phoneNumber = "0 0 30 69 74 0 9 22 52";
        String expectedOutput = "00306974092252     [phone number: VALID]";

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        output.simpleValidationOutput(phoneNumber);

        String actualOutput = outputStream.toString().trim(); // Trim to remove leading/trailing whitespace

        System.setOut(System.out); // Reset System.out to its original state

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testSimpleValidationOutputInvalid() {
        Output output = new Output();
        String phoneNumber = "2 10 69 30 6 60 4";
        String expectedOutput = "21069306604     [phone number: INVALID]";

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        output.simpleValidationOutput(phoneNumber);

        String actualOutput = outputStream.toString().trim(); // Trim to remove leading/trailing whitespace

        System.setOut(System.out); // Reset System.out to its original state

        assertEquals(expectedOutput, actualOutput);
    }
}
