package co.com.choucair.certification.retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TestBusinessUnits extends PageObject {
    public final static Target BUTTON_NEW_BUSINESS_UNIT = Target.the("button to create a new business unit")
            .located(By.xpath("//div[@class='tool-button add-button icon-tool-button']/div/span"));

    public final static Target INPUT_BUSINESS_UNIT_NAME = Target.the("input the new business unit name")
            .located(By.id("Serenity_Pro_Organization_BusinessUnitDialog3_Name"));
    public final static Target BUTTON_SAVE_BUSINESS_UNIT = Target.the("button to save a new business unit")
            .located(By.xpath("//div[@class='tool-button save-and-close-button icon-tool-button']/div/span"));
}
