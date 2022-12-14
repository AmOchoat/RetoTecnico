package co.com.choucair.certification.retotecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class TestScheduleMeeting extends PageObject {

    public final static Target LABEL_MEETING_NAME = Target.the("label with the meeting name")
            .located(By.xpath("//div[@class='ui-widget-content slick-row even' and @style='top:0px']/div[2]/a[text()]"));

    public final static Target LABEL_MEETING_NUMER = Target.the("label with the meeting number")
            .located(By.xpath("//div[@class='ui-widget-content slick-row even' and @style='top:0px']/div[3][text()]"));

    public final static Target LABEL_MEETING_TYPE = Target.the("label with the meeting type")
            .located(By.xpath("//div[@class='ui-widget-content slick-row even' and @style='top:0px']/div[4][text()]"));

    public final static Target LABEL_MEETING_BUSINESS_UNIT = Target.the("label with the meeting business unit")
            .located(By.xpath("//div[@class='ui-widget-content slick-row even' and @style='top:0px']/div[8][text()]"));

    public final static Target COLUMN_MEETING_ID = Target.the("column to sort column meeting name")
            .located(By.xpath("//div[contains(@id,'MeetingId')]"));

    public final static Target TOAST_ERROR_MESSAGE = Target.the("toast with error message")
            .located(By.xpath("//div[@class='toast-message']"));

}
