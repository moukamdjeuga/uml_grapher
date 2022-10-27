package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static fr.lernejo.Sample.Operation.ADD;

class SampleTest {

    private final Sample sample = new Sample();

    @Test
    void add_2_and_2_should_return_4() {
        int result = sample.op(ADD, 2, 2);

        Assertions.assertThat(result)
            .as("Addition of 2 and 2")
            .isEqualTo(4);
    }

    @Test
    void testADD(){
        Sample sample = new Sample();
        org.junit.jupiter.api.Assertions.assertEquals(sample.op(ADD,2, 2),4);
    }
    @Test
    void testNullFact(){
        Sample sample = new Sample();
        org.junit.jupiter.api.Assertions.assertThrows(IllegalArgumentException.class, () -> sample.fact(-4));
    }
    @Test
    void testFactZero(){
        Sample sample = new Sample();
        org.junit.jupiter.api.Assertions.assertEquals(sample.fact(0), 1);
    }

}
