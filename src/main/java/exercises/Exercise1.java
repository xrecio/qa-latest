package exercises;

import utils.QaLogger;

import java.util.ArrayList;
import java.util.List;

public class Exercise1 {

    QaLogger qaLogger;

    public int[] occurrencesOfDigitsInArray(int[] digits) {
        int[] occurrences = new int[10];
        for(int i=0; i < digits.length; i++)
            occurrences[digits[i]]++;
        qaLogger.logOccurrencesInArray(occurrences);
        return occurrences;
    }

    public int sumOfDigitsInArray(int[] digits) {
        int sum = 0;
        for(int i=0; i < digits.length; i++)
            sum += digits[i];
        qaLogger.logSumInArray(sum);
        return sum;
    }

    public List<Integer> decomposeIntInFactors(Integer i) {
        List<Integer> factors = new ArrayList<>();
        while (i != 1) {
            for (int j=2; j <= i; j++) {
                if ((i % j) == 0) {
                    factors.add(j);
                    i /= j;
                    j = 1;
                }
            }
        }
        qaLogger.logIntInFactors(factors);
        return factors;
    }

    public static class PojoAssign {

        private int att1;

        public void setAtt1(int att1) {
            this.att1 = att1;
        }

        public int getAtt1() {
            return att1;
        }

        public PojoAssign(int one) {
            setAtt1(one);
        }

    }

}
