import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.Test;

public class RandomCharacterTest{
    RandomCharacter rChar = new RandomCharacter();

    //Declare a constant to use in the for loop
    private final static int MAX = 15;

    // Test if it returns a lowercase letter
    @Test
    public void testLowerCase(){
        for(int i = 0; i < MAX; i++){
            assertTrue(Character.isLowerCase(rChar.getRandomLowerCaseLetter()));
        }
    }

    // Test if it returns a uppercase letter
    @Test
    public void testUpperCase(){
        for(int i = 0; i < MAX; i++){
            assertTrue(Character.isUpperCase(rChar.getRandomUpperCaseLetter()));
        }
    }

    // Test if it returns a digit between 0-9
    @Test
    public void testDigit(){
        for(int i = 0; i < MAX; i++){
            char num = (char) rChar.getRandomDigitCharacter();
            assertTrue(num <=9 && num >=0);
        }
    }

    // Test if it returns a random character
    @Test
    public void testRandomCharacter(){
        for(int i = 0; i < MAX; i++){
            assertTrue(Character.isLetterOrDigit(rChar.getRandomCharacter()));
        }
    }

    // Test if random generated number is a prime number
    @Test
    public void testPrime(){
        for(int i = 0; i < MAX; i++){
            int no = rChar.getRandomPrimeNumbers();
            assertTrue(rChar.checkPrimeAlt(no));
        }
    }
}

