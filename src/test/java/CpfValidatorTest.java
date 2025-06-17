import com.leonardo.validator.CpfValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CpfValidatorTest {

    @Test
    void testValidCpf() {
        assertTrue(CpfValidator.isValid("12345678909"));
    }

    @Test
    void testInvalidCpf() {
        assertFalse(CpfValidator.isValid("12345678900"));
    }

    @Test
    void testCpfWithAllSameDigits() {
        assertFalse(CpfValidator.isValid("11111111111"));
    }

    @Test
    void testCpfWithInvalidFormat() {
        assertFalse(CpfValidator.isValid("abc123"));
        assertFalse(CpfValidator.isValid(null));
        assertFalse(CpfValidator.isValid(""));
    }
}
