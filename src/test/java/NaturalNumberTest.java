import org.junit.jupiter.api.Test;

import static org.hamcrest.JMock1Matchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.assertj.core.api.Assertions.assertThat;

public class NaturalNumberTest {
    @Test
    void smallPerfectNumberIsClassifiedCorrectly() {
        NaturalNumber naturalNumber = new NaturalNumber(6);

        Classification result = naturalNumber.getClassification();

        assertEquals(Classification.PERFECT,result);
    }

    @Test
    void mediumPerfectNumberIsClassifiedCorrectly() {
        NaturalNumber naturalNumber = new NaturalNumber(28);

        Classification result = naturalNumber.getClassification();

        assertEquals(Classification.PERFECT,result);
    }

    @Test
    void largePerfectNumberIsClassifiedCorrectly() {
        NaturalNumber naturalNumber = new NaturalNumber(33550336);

        Classification result = naturalNumber.getClassification();

        assertEquals(Classification.PERFECT,result);
    }

    @Test
    void smallAbundantNumberIsClassifiedCorrectly() {
        NaturalNumber naturalNumber = new NaturalNumber(12);

        Classification result = naturalNumber.getClassification();

        assertEquals(Classification.ABUNDANT,result);
    }

    @Test
    void mediumAbundantNumberIsClassifiedCorrectly() {
        NaturalNumber naturalNumber = new NaturalNumber(24);

        Classification result = naturalNumber.getClassification();

        assertEquals(Classification.ABUNDANT,result);
    }

    @Test
    void smallDeficientNumberIsClassifiedCorrectly() {
        NaturalNumber naturalNumber = new NaturalNumber(8);

        Classification result = naturalNumber.getClassification();

        assertEquals(Classification.DEFICIENT,result);
    }

    @Test
    public void testThatNonNegativeIntegerIsRejected() {
        IllegalArgumentException expected =
                assertThrows(
                        IllegalArgumentException.class,
                        () -> new NaturalNumber(0));
        assertThat(expected)
                .hasMessage("You must supply a natural number (positive integer)");
    }

    @Test
    public void testThatNegativeIntegerIsRejected() {
        IllegalArgumentException expected =
                assertThrows(
                        IllegalArgumentException.class,
                        () -> new NaturalNumber(-1));
        assertThat(expected)
                .hasMessage("You must supply a natural number (positive integer)");
    }

}
