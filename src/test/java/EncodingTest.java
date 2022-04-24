import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EncodingTest {

    Encoding encoding;
    @BeforeEach
    void setUp() {
        encoding=new Encoding();
    }

    @AfterEach
    void tearDown() {
        encoding=null;
    }
    @Test
    void setOriginalText() {
        String originalText="abc";
        encoding.setOriginalText(originalText);
        assertEquals("ABC",encoding.getOriginalText());
    }

    @Test
    void getOriginalText() {
        String originalText="abc";
        encoding.setOriginalText(originalText);
        assertEquals("ABC",encoding.getOriginalText());
    }

    @Test
    void cipher() {
        String originalText="abc";
        encoding.setOriginalText(originalText);
        encoding.key = 3;
        assertEquals("DEF",encoding.cipher());
    }

}