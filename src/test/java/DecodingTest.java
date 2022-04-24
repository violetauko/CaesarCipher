import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecodingTest {
    Decoding decoding;

    @BeforeEach
    void setUp() {
        decoding=new Decoding();
    }

    @AfterEach
    void tearDown() {
        decoding=null;

    }

    @Test
    void setCipherText() {
        String cipherText="abc";
        decoding.setCipherText(cipherText);
        assertEquals("ABC",decoding.getCipherText());
    }

    @Test
    void getCipherText() {
    }

    @Test
    void decodcipher() {
        String originalText="ABC";
        decoding.setCipherText(originalText);
        decoding.key = 3;
        assertEquals("DEF ",decoding.decodcipher());
    }
}