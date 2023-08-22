import org.junit.Assert;
import org.junit.Test;
import ru.praktikum.yandex.Feline;

import java.util.List;

public class FelineTest {
    Feline feline = new Feline();

    @Test
    public void eatMeatTestShouldReturnFelineFoodList() throws Exception {
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void getFamilyTestIsItFelineFamily() {
        String expectedFamily = "Кошачьи";

        Assert.assertEquals(expectedFamily, feline.getFamily());
    }

    @Test
    public void getKittensTestShouldReturnOne() {
        int expectedCount = 1;
        Assert.assertEquals(expectedCount, feline.getKittens());
    }

    @Test
    public void getKittensTestShouldReturnSpecifiedAmount() {
        int expectedCount = 3;
        Assert.assertEquals(expectedCount, feline.getKittens(expectedCount));
    }
}