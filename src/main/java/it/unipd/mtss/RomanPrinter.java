//////////////////////////////////////////////////////////////////// 
// GIULIA CREMA 2111945
// ANGELA FAVARO 2111015
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {

    public static String print(int num) {
        if (num < 1 || num > 3) {
            throw new IllegalArgumentException("Errore: il numero deve essere tra 1 e 3.");
        }
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        StringBuilder asciiArt = new StringBuilder();
    
        String[][] asciiLetters = {
            {
                "  _____ " // I
            },

            {
                " |_   _|" // I
            },

            {
                "   | |  " // I
            },

            {
                "   | |  " // I
            },
                
            {
                "  _| |_ " // I
            },
                
            {
                " |_____|" // I
            },
        };
        
        for(int z=0; z<6; z++) {
            for (char c : romanNumber.toCharArray()) {
                asciiArt.append(asciiLetters[z]["I".indexOf(c)]);
            }
            asciiArt.append("\n");
        }
        return asciiArt.toString();
    }
}