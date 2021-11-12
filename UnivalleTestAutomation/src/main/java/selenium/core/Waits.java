package selenium.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.function.Function;

public final class Waits {

	private final WebDriver driver;

	public Waits(WebDriver driver) {
		this.driver = driver;
	}

	public <T> T waitForCondition(int timeOutSeconds, Function<WebDriver, T> condition) {
		return new WebDriverWait(driver, Duration.ofSeconds(timeOutSeconds).getSeconds())
                .ignoring(WebDriverException.class)
                .until(condition);
	}

}
