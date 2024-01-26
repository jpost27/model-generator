package com.fanduel.modelgenerator.v1;

import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

@Slf4j
public class Commands {


    // safaridriver --enable
    public void setup() {
        try {
            WebDriverManager.safaridriver().setup();
            WebDriver driver = new SafariDriver();
            // Exercise
            driver.get("https://www.google.com");
            String title = driver.getTitle();

            // Verify
            assert (title).contains("Selenium WebDriver");
            driver.quit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
