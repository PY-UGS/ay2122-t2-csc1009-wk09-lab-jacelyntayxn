import java.util.Random;

public class RandomCharacter{
    //Declare a new random object 
    Random random = new Random();

    //Method to geta random upper case letter
    public char getRandomUpperCaseLetter(){
        // Letter A in ASCII = 65, A-Z -> 65-90
        // Generate random number between 65-90 and convert to char
        char upperLetter = (char) ('A' + random.nextInt(26));
        return upperLetter;
    }

    //Method to get a random lower case letter
    public char getRandomLowerCaseLetter(){
        // Letter a in ASCII = 97, a-z -> 97-122
        // Generate random number between 97-122 and convert to char
        char lowerLetter = (char) ('a' + random.nextInt(26));
        return lowerLetter;
    }
 
    //Method to get a random digit
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

    //A method to get a random prime number
    public int getRandomPrimeNumbers(){
        while(true){
            // Generate a number from range 2 to 100
            int no =  (int)(random.nextInt(98)+2);
            // check whether the number is a prime number
            if(checkPrime(no) == true){
                return no; //return the value 
            }
        }
    }

    //A method to check that the number is a prime number
    public boolean checkPrime(int no){
        boolean isPrime = true;
        int i = 2;  
        while(i <= no/2){ 
            if (no % i == 0){ //If the remainder is 0
                isPrime = false;  
                break;
            }
            ++i; //Increment i
        }
        return isPrime;
    }

    // Another method to check if checkPrime method is correct
    public boolean checkPrimeAlt(int no){
        boolean isPrime = true;
        for(int i = 2; i<= no/2; ++i){
            if(no % i == 0){ //If the remainder is 0
                isPrime = false; 
                break;
            }
        }
        return isPrime;
    }


}