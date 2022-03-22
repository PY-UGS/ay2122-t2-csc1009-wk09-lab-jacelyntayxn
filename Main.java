public class Main {
    public static void main (String[] args){
        char lowerLetter, upperLetter, randomChar;
        int digit, primeNum;

        final int REPEAT = 15;

        RandomCharacter rdm = new RandomCharacter();

        System.out.println("Random Lower Case Letter: ");
        for (int i = 0; i < REPEAT; i++){
            lowerLetter = rdm.getRandomLowerCaseLetter();
            System.out.println(lowerLetter + " ");
        }

        System.out.println("\nRandom Upper Case Letter: ");
        for (int i = 0; i < REPEAT; i++){
            upperLetter = rdm.getRandomUpperCaseLetter();
            System.out.println(upperLetter + " ");
        }

        System.out.println("\nRandom Digit Number (0-9): ");
        for (int i = 0; i < REPEAT; i++){
            digit = rdm.getRandomDigitCharacter();
            System.out.println(digit + " ");
        }
        
        System.out.println("\nRandom Character: ");
        for (int i = 0; i < REPEAT; i++){
            randomChar = rdm.getRandomCharacter();
            System.out.println(randomChar + " ");
        }

        System.out.println("\nRandom Prime Number: ");
        for (int i = 0; i < REPEAT; i++){
            primeNum = rdm.getRandomPrimeNumbers();
            System.out.println(primeNum + " ");
        }
    }
}
