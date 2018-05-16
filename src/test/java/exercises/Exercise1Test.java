package exercises;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

public class Exercise1Test {

    Exercise1 ex = new Exercise1();

    @Test
    public void occurrencesOfDigitsInArrayTest() {
        int[] digits = {0,1,2,3,4,5,3,2,6,6,7,3,4,5,9,9,9,9,9,9};
        int[] expectedArray = {1,1,2,3,2,2,2,1,0,6};
        assertThat(ex.occurrencesOfDigitsInArray(digits))
                    .isEqualTo(expectedArray)
                    .hasSameSizeAs(expectedArray);
    }

    @Test
    public void occurrencesOfDigitsInEmptyArrayTest() {
        int[] digits = {};
        int[] expectedArray = {0,0,0,0,0,0,0,0,0,1};
        assertThat(ex.occurrencesOfDigitsInArray(digits))
                .isEqualTo(expectedArray);
    }

    @Test
    public void sumOfDigitsInArrayTest() {
        int[] digits = {0,1,2,3,4,4,5,6,7,7,7,9};
        assertThat(ex.sumOfDigitsInArray(digits))
                .isEqualTo(55);
    }

    @ParameterizedTest
    @CsvSource({"15646, '[2, 7823]'", "67547, '[67547]'", "1000, '[2, 2, 2, 5, 5, 5]'"})
    public void decomposeIntInFactorsTest(int i, String s) {
        assertThat(ex.decomposeIntInFactors(i).toString())
                .isEqualTo(s);
    }

    @Test
    public void pojoAssignTest() {
        Exercise1.PojoAssign myPojoAssign = new Exercise1.PojoAssign(1);
        System.out.println(myPojoAssign.getAtt1());
        Exercise1.PojoAssign myPojoAssign2 = new Exercise1.PojoAssign(2);
        System.out.println(myPojoAssign2.getAtt1());
        myPojoAssign2 = myPojoAssign;
        myPojoAssign.setAtt1(3);
        System.out.println(myPojoAssign2.getAtt1()); // it points to myPojoAssign !!
        assertThat(myPojoAssign2).isEqualTo(myPojoAssign);
    }


}
