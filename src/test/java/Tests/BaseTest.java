package Tests;

import Interfaces.EVE;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import tools.WebDriver;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest implements EVE{

    private static final String baseUrl ="https://demoqa.com/";
    @BeforeAll
    static void beforeConfig() {
        Configuration.browser= WebDriver.class.getName();

    }
    @BeforeEach
    public void before() {
        open(baseUrl);
    }
}
