import java.util.Random;

public class RandomCharacter{
    Random random = new Random();


    public char getRandomUpperCaseLetter(){
        // Letter A in ASCII = 65, A-Z -> 65-90
        // Generate random number between 65-90 and convert to char
        char upperLetter = (char) ('A' + random.nextInt(26));
        return upperLetter;
    }

    public char getRandomLowerCaseLetter(){
        // Letter a in ASCII = 97, a-z -> 97-122
        // Generate random number between 97-122 and convert to char
        char lowerLetter = (char) ('a' + random.nextInt(26));
        return lowerLetter;
    }
 
    public int getRandomDigitCharacter(){
        // Generate random number between 0-9
        return (int)(random.nextInt(10));
    }

    public char getRandomCharacter(){
        String alphaNumericString = "abcdefghijklmnopqrstuvxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        // Generate random number that represents index of the string
        int randomNum = random.nextInt(alphaNumericString.length());
        // Return character based on the randomNum generated
        return alphaNumericString.charAt(randomNum);
    }

    public int getRandomPrimeNumbers(){
        while(true){
            // Generate a number from range 2 to 100
            int no =  (int)(random.nextInt(98)+2);
            if(checkPrime(no) == true){
                return no;
            }
        }
    }

    public boolean checkPrime(int no){
        boolean isPrime = true;
        int i = 2;
        while(i <= no/2){
            if (no % i == 0){
                isPrime = false;
                break;
            }
            ++i;
        }
        return isPrime;
    }

    // Another method to check if checkPrime method is correct
    public boolean checkPrimeAlt(int no){
        boolean isPrime = true;
        for(int i = 2; i<= no/2; ++i){
            if(no % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }


}