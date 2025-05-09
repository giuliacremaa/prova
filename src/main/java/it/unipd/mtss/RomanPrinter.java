//////////////////////////////////////////////////////////////////// 
// GIULIA CREMA 2111945
// ANGELA FAVARO 2111015
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {

    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        StringBuilder asciiArt = new StringBuilder();
        String[][] asciiLetters = {
            {//Riga1
                "  __  __ ", "  _____  ", "   _____ ", "  _      ", 
                " __   __", " __      __", "  _____ " 
            },
            {//Riga2
                " |  \\/  |", " |  __ \\ ", "  / ____|", " | |     ",  // L
                " \\ \\ / /", " \\ \\    / /", " |_   _|" // I
            },
            {//Riga3
                " | \\  / |", " | |  | |", " | |     ", " | |     ",  // L
                "  \\ V / ", "  \\ \\  / / ", "   | |  " // I
            },
            {//Riga4
                " | |\\/| |", " | |  | |", " | |     ", " | |     ", // L
                "   > <  ", "   \\ \\/ /  ", "   | |  " // I
            }, 
            {//Riga5
                " | |  | |", " | |__| |", " | |____ ", " | |____ ", // L
                "  / . \\ ", "    \\  /   ", "  _| |_ " // I
            }, 
            {//Riga6
                " |_|  |_|", " |_____/ ", "  \\_____|", " |______|", // L
                " /_/ \\_\\", "     \\/    ", " |_____|" // I
            },
        };
        
        for( int z=0; z<6; z++) {
            for (char c : romanNumber.toCharArray()) {
                // Aggiungi la rappresentazione ASCII art orizzontale della lettera corrente
                asciiArt.append(asciiLetters[z]["MDCLXVI".indexOf(c)]);
            }
            asciiArt.append("\n");
        }
        return asciiArt.toString();
    }
}