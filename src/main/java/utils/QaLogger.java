package utils;

import exercises.Exercise1;

import java.util.List;
import java.util.logging.Logger;

public class QaLogger {

    private final static Logger LOGGER = Logger.getLogger(Exercise1.class.getName());

    public static void logOccurrencesInArray(int[] occurrences) {
        for(int i=0; i < occurrences.length; i++) {
            LOGGER.info("Number of "+ i + "'s: "+ occurrences[i]);
        }
    }

    public static void logSumInArray(int sum) {
            LOGGER.info("Sum of digits in array = "+ sum);
    }

    public static void logIntInFactors(List<Integer> l) {
        LOGGER.info("Factors are: "+l.toString());
    }




}
