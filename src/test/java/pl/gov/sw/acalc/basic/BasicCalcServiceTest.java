package pl.gov.sw.acalc.basic;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BasicCalcServiceTest {

    private final BasicCalcService service = new BasicCalcServiceImpl();

    @Test
    @DisplayName("2 plus 5 should equal 7")
    void shouldAddTwoIntegers() {
        // given
        Integer addend1 = 2;
        Integer addend2 = 5;

        // when
        var sum = service.add(addend1, addend2);

        // then
        assertThat(sum).isEqualTo(7);
    }

    @Test
    @DisplayName("5 minus 2 should equal 3")
    void shouldSubstractTwoIntegers(){
        //given
        Integer minuend = 5;
        Integer subtrahend = 2;

        //when
        var sub = service.subtract(minuend, subtrahend);

        //then
        assertThat(sub).isEqualTo(3);
    }
}
