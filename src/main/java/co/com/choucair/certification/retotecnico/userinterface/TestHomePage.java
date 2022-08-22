package co.com.choucair.certification.retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TestHomePage extends PageObject {
    public static final Target LABEL_ORGANIZATION = Target.the("Label to select organization option")
            .located((By.xpath("//ul[@id='nav_menu1_3']/li[1]")));
    public static final Target LABEL_BUSINESS_UNITS = Target.the("Label to select organization option")
            .located((By.xpath("//i[@class='s-sidebar-icon fa fa-sitemap']/following-sibling::span[text()='Business Units']")));

    public static final Target LABEL_MEETING = Target.the("Label to select organization option")
            .located((By.xpath("//ul[@id='nav_menu1_3']/li[2]")));

    public static final Target LABEL_MEETINGS_ITEM = Target.the("Label to select organization option")
            .located((By.xpath("//i[@class='s-sidebar-icon fa s-sidebar-noicon']/following-sibling::span[text()='Meetings']")));

}
