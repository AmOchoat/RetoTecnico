package co.com.choucair.certification.retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TestHomePage extends PageObject {
    public static final Target LABEL_ORGANIZATION = Target.the("Label to select organization option")
            .located((By.xpath("/html/body/aside/div[2]/div[2]/div[1]/ul/li[3]/ul/li[1]")));
    public static final Target LABEL_BUSINESS_UNITS = Target.the("Label to select organization option")
            .located((By.xpath("/html/body/aside/div[2]/div[2]/div[1]/ul/li[3]/ul/li[1]/ul/li[1]/a/span")));

    public static final Target LABEL_MEETING = Target.the("Label to select organization option")
            .located((By.xpath("/html/body/aside/div[2]/div[2]/div[1]/ul/li[3]/ul/li[2]")));

    public static final Target LABEL_MEETINGS_ITEM = Target.the("Label to select organization option")
            .located((By.xpath("/html/body/aside/div[2]/div[2]/div[1]/ul/li[3]/ul/li[2]/ul/li[1]/a/span")));

}
