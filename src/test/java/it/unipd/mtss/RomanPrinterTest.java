package it.unipd.mtss;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class RomanPrinterTest {
    @Test
    public void testPrint() {
        assertEquals("  _____ \n |_   _|\n   | |  \n   | |  \n  _| |_ \n |_____|\n", RomanPrinter.print(1));
        assertEquals("  _____   _____ \n |_   _| |_   _|\n   | |     | |  \n   | |     | |  \n  _| |_   _| |_ \n |_____| |_____|\n", RomanPrinter.print(2));
        assertEquals("  _____   _____   _____ \n |_   _| |_   _| |_   _|\n   | |     | |     | |  \n   | |     | |     | |  \n  _| |_   _| |_   _| |_ \n |_____| |_____| |_____|\n", RomanPrinter.print(3));
    }

    @Test
    public void testStampaNumeroBasso() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> RomanPrinter.print(0));
        assertEquals("Errore: il numero deve essere tra 1 e 3.", e.getMessage());
    }

    @Test
    public void testStampaNumeroAlto() {
        Exception e = assertThrows(IllegalArgumentException.class, () -> RomanPrinter.print(4));
        assertEquals("Errore: il numero deve essere tra 1 e 3.", e.getMessage());
    }
}