import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.praktikum.yandex.Feline;
import ru.praktikum.yandex.Lion;

@RunWith(Parameterized.class)
public class LionManeParameterizedTest {

    private final String sex;
    private final Boolean expectedMane;

    public LionManeParameterizedTest(String sex, Boolean expectedMane) {
        this.sex = sex;
        this.expectedMane = expectedMane;
    }

    @Parameterized.Parameters
    public static Object[][] shouldHaveMane() {
        return new Object[][]{
                {"Самец", Boolean.TRUE},
                {"Самка", Boolean.FALSE},
        };
    }

    @Test
    public void doesHaveManeTestShoudReturnIsLionHaveMane() throws Exception {
        Lion lion = new Lion(sex, new Feline());
        Assert.assertEquals(expectedMane, lion.doesHaveMane());
    }
}