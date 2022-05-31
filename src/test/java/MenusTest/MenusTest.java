package MenusTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MenusTest {

    @Test(groups = "positive")
    public void menuOneTest() {
        Assert.assertEquals("Введите 1 или 0\n1. Зоопарк\n0. Выход",
                "Введите 1 или 0\n1. Зоопарк\n0. Выход");
    }

    @Test(groups = "positive")
    public void menuTwoTest() {
        Assert.assertEquals("Введите цифру от 1 до 3 или 0 для возврата в предыдущее меню\n1. Млекопитающие\n2. Птицы" +
                        "\n3. Рыбы\n0. Назад",
                "Введите цифру от 1 до 3 или 0 для возврата в предыдущее меню\n1. Млекопитающие\n2. Птицы" +
                        "\n3. Рыбы\n0. Назад");
    }

    @Test(groups = "positive")
    public void menuThreeTest() {
        Assert.assertEquals("Введите цифру от 1 до 3 или 0 для возврата в предыдущее меню\n1. Млекопитающие\n2. Птицы" +
                        "\n3. Рыбы\n0. Назад",
                "Введите цифру от 1 до 3 или 0 для возврата в предыдущее меню\n1. Млекопитающие\n2. Птицы" +
                        "\n3. Рыбы\n0. Назад");
    }

}
