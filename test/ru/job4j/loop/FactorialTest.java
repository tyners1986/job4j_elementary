
import org.junit.Test;
import ru.job4j.loop.Factorial;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

    public class FactorialTest {
        @Test
        public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
            int rs = Factorial.calc(5);
            int expectedD = 120;
            assertThat(rs, is(expectedD));
            /* напишите здесь тест, проверяющий, что факториал для числа 5 равен 120. */
        }

        @Test
        public void whenCalculateFactorialForZeroThenOne() {
            int rs = Factorial.calc(0);
            int expectedD = 1;
            assertThat(rs, is(expectedD));
            /* напишите здесь тест, проверяющий, что факториал для числа 0 равен 1. */
        }
    }

