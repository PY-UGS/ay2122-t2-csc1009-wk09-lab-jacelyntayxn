public class Main {
    public static void main (String[] args){
        char lowerLetter, upperLetter, randomChar;
        int digit, primeNum;

        //Declare a constant to use in the for loop
        final int REPEAT = 15;

        //Declare a new randomcharacter object 
        RandomCharacter rdm = new RandomCharacter();

        //Print out 15 random lower case letters
        System.out.println("Random Lower Case Letter: ");
        for (int i = 0; i < REPEAT; i++){
            lowerLetter = rdm.getRandomLowerCaseLetter();
            System.out.println(lowerLetter + " ");
        }

        //Print out 15 random upper case letters
        System.out.println("\nRandom Upper Case Letter: ");
        for (int i = 0; i < REPEAT; i++){
            upperLetter = rdm.getRandomUpperCaseLetter();
            System.out.println(upperLetter + " ");
        }
        
        //Print out 15 random digit numbers
        System.out.println("\nRandom Digit Number (0-9): ");
        for (int i = 0; i < REPEAT; i++){
            digit = rdm.getRandomDigitCharacter();
            System.out.println(digit + " ");
        }
        
        //Print out 15 random characters
        System.out.println("\nRandom Character: ");
        for (int i = 0; i < REPEAT; i++){
            randomChar = rdm.getRandomCharacter();
            System.out.println(randomChar + " ");
        }

        //Print out 15 random prime numbers
        System.out.println("\nRandom Prime Number: ");
        for (int i = 0; i < REPEAT; i++){
            primeNum = rdm.getRandomPrimeNumbers();
            System.out.println(primeNum + " ");
        }
    }
}
