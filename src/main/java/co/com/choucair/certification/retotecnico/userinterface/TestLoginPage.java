package co.com.choucair.certification.retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TestLoginPage extends PageObject {
    public static final Target INPUT_USER = Target.the("Input user account")
            .located(By.id("StartSharp_Membership_LoginPanel0_Username"));
    public static final Target INPUT_PASSWORD = Target.the("Input user password")
            .located(By.id("StartSharp_Membership_LoginPanel0_Password"));
    public static final Target BUTTON_SIGN_IN = Target.the("Button to Sign In")
            .located(By.id("StartSharp_Membership_LoginPanel0_LoginButton"));
}

