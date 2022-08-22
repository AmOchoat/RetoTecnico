package co.com.choucair.certification.retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TestMeetingPage extends PageObject {
    public final static Target BUTTON_NEW_MEETING = Target.the("button to create a new meeting")
            .located(By.xpath("//div[@class='tool-button add-button icon-tool-button']/div/span"));
    public final static Target INPUT_MEETING_NAME = Target.the("input the meeting name")
            .located(By.xpath("//input[@name='MeetingName']"));

    public final static Target CONTAINER_MEETING_TYPE = Target.the("container the meeting type")
            .located(By.xpath("//div[contains(@id,'_MeetingTypeId') and not(contains(@id,'_MeetingGrid'))]/a"));

    public final static Target INPUT_MEETING_TYPE = Target.the("button to select business type")
            .located(By.xpath("//label[text()='*Meeting Type' and contains(@for,'_search')]/following-sibling::input"));

    public final static Target INPUT_MEETING_NUMBER = Target.the("input the meeting number")
            .located(By.xpath("//input[@name='MeetingNumber']"));

    public final static Target INPUT_MEETING_START_DATE = Target.the("input the meeting number")
            .located(By.xpath("//input[@name='StartDate']"));

    public final static Target INPUT_MEETING_END_DATE = Target.the("input the meeting number")
            .located(By.xpath("//input[@name='EndDate']"));

    public final static Target CONTAINER_MEETING_UNIT = Target.the("container the meeting type")
            .located(By.xpath("//div[contains(@id,'_UnitId') and not(contains(@id,'_MeetingGrid'))]/a"));
    public final static Target INPUT_MEETING_UNIT = Target.the("input to select the meeting unit")
            .located(By.xpath("//label[text()='Unit' and contains(@for,'_search')]/following-sibling::input"));

    public final static Target BUTTON_CREATE_MEETING = Target.the("button to create a meeting")
            .located(By.xpath("//div[@class='tool-button save-and-close-button icon-tool-button']"));

}
