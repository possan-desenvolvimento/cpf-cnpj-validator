import com.leonardo.validator.CnpjValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CnpjValidatorTest {

    @Test
    void testValidCnpj() {
        assertTrue(CnpjValidator.isValid("11222333000181"));
    }

    @Test
    void testInvalidCnpj() {
        assertFalse(CnpjValidator.isValid("11222333000100"));
    }

    @Test
    void testCnpjWithInvalidFormat() {
        assertFalse(CnpjValidator.isValid("123abc"));
        assertFalse(CnpjValidator.isValid(null));
        assertFalse(CnpjValidator.isValid(""));
    }

}
