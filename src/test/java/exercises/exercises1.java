package exercises;

import org.junit.jupiter.api.Test;
import java.util.logging.Logger;
import static org.assertj.core.api.Assertions.assertThat;

public class exercises1 {

    private final static Logger LOGGER = Logger.getLogger(exercises1.class.getName());

    @Test
    public void occurrencesOfDigitsInArray() {

        int[] occurrences = new int[10];
        int[] digits = {0,1,2,3,4,5,3,2,6,6,7,3,4,5,9,9,9,9,9,9};
        int[] expected = {1,1,2,3,2,2,2,1,0,6};

        for(int i=0; i < digits.length; i++) {
            int j = digits[i];
            occurrences[j]++;
        }
        
        for(int i=0; i < occurrences.length; i++) {
            LOGGER.info("Number of "+ i + "'s: "+ occurrences[i]);
        }

        assertThat(occurrences).isEqualTo(expected);
    }

}
