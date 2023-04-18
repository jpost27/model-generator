package com.fanduel.modelgenerator;

import com.fanduel.modelgenerator.cleaner.PackageCleaner;
import com.fanduel.modelgenerator.generator.ModelGenerator;
import com.fanduel.modelgenerator.generator.sportradar.SportRadarModelGenerator;
import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import javax.validation.constraints.NotNull;
import java.io.IOException;

@ShellComponent
@RequiredArgsConstructor
@Slf4j
public class Commands {

    private ModelGenerator generator;

    @ShellMethod(value = "Initialize SportRadar generator.")
    public void sportradar(@NotNull @ShellOption(help = "Sportradar url that you want scraped for API links. " +
            "Example: https://developer.sportradar.com/docs/read/baseball/MLB_v7") String docsUrl) {
        if (!docsUrl.contains("sportradar")) {
            log.warn("Your provided url doesn't contain 'sportradar'. Seems sketchy but we'll try to roll with it...");
        }
        generator = new SportRadarModelGenerator(docsUrl);
        generator.collectDocumentationUrls();
    }

    @ShellMethod(value = "Print currently loaded URL metadata.")
    public void print() {
        generator.print();
    }

    @ShellMethod(value = "Generate models from loaded urls.")
    private void generate(@NotNull @ShellOption(help = "Name of the package to generate the models under.") String sportRadarPackageName) throws IOException {
        generator.generate(sportRadarPackageName);
        new PackageCleaner().clean(sportRadarPackageName);
    }

    @ShellMethod(value = "Setup webdriver.")
    public void setup() {
        WebDriverManager.safaridriver().setup();
        WebDriver driver = new SafariDriver();
        // Exercise
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/");
        String title = driver.getTitle();

        // Verify
        assert (title).contains("Selenium WebDriver");
        driver.quit();
    }
}
