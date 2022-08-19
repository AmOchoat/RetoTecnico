package co.com.choucair.certification.retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TestBusinessUnits extends PageObject {
    public final static Target BUTTON_NEW_BUSINESS_UNIT = Target.the("button to create a new business unit")
            .located(By.xpath("/html/body/main/section/div/div[2]/div[2]/div/div/div[1]/div/span"));

    public final static Target INPUT_BUSINESS_UNIT_NAME = Target.the("input the new business unit name")
            .located(By.id("Serenity_Pro_Organization_BusinessUnitDialog3_Name"));
    public final static Target BUTTON_SAVE_BUSINESS_UNIT = Target.the("button to save a new business unit")
            .located(By.xpath("/html/body/div[4]/div[2]/div/div[1]/div/div/div/div[1]/div"));
}
