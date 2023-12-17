import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    ZonedDateTime dateTime = OffsetDateTime.parse("2002-03-01T13:00:00Z").toZonedDateTime();

    @Test
    void formatoFull() {
        String result =Main.formatoFull(dateTime);
        assertEquals("venerdi 1 marzo 2002 13:00:00 Z", result);
    }

    @org.junit.jupiter.api.Test
    void formatoMedium() {
        String result = Main.formatoMedium(dateTime);
        assertEquals("1 marzo 2012,13:00:00",result);
    }

    @org.junit.jupiter.api.Test
    void formatoShort() {
        String result = Main.formatoShort(dateTime);
        assertEquals("01/03/02 , 13:00", result);
    }
}