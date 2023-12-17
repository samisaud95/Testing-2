//Crea un oggetto OffsetDateTime da questa stringa 2002-03-01T13:00:00Z
//Formatta la data ottenuta in FULL, MEDIUM e SHORT
//Stampa le varie versioni -Crea dei test per questo esercizio

import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;


public class Main {
    public static void main(String[] args) {


        OffsetDateTime data1 =OffsetDateTime.parse("2002-03-01T13:00:00Z");

        String data1StrinnFull = data1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println("Data 1 FULL è : ----------" + data1StrinnFull);

        String data1StringMediun = data1.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
        System.out.println("Data 1 MEDIUN è : --------" + data1StringMediun);

        String data1StringShort = data1.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));
        System.out.println("Data 1 SHORT è : ---------" + data1StringShort);

    }
    public static String formatoFull(ZonedDateTime date){
        return date.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL));
    }
    public static String formatoMedium(ZonedDateTime date){
        return date.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
    }
    public static String formatoShort(ZonedDateTime date){
        return date.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));
    }




}

