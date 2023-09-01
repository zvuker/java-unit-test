import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CheckIsAdultTest {

    private final int age;
    private final boolean result;

    public CheckIsAdultTest(int age, boolean result) {
        this.age = age;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testData() {
        return Arrays.asList(new Object[][]{
                {17, false},
                {18, true},
                {21, true},
                {22, true}
        });
    }

    @Test
    public void checkIsAdultWhenAgeThenResult() {
        Program program = new Program();

        boolean isAdult = program.checkIsAdult(age);

        assertEquals("Incorrect result for age " + age, result, isAdult);
    }
}