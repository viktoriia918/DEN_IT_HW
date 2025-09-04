package aqa_hw_7.task_2;

import org.testng.annotations.DataProvider;

public class TestDataProvider {

    @DataProvider(name = "bonusSection")
    public static Object[][] bonusSection() {
        return new Object[][] { { "Бонусна програма" } };
    }

    @DataProvider(name = "youtubeIcon")
    public static Object[][] youtubeIcon() {
        return new Object[][] { { "youtube.com" } };
    }
}