package co.com.choucair.certification.retotecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TestMeetingPage extends PageObject {
    public final static Target BUTTON_NEW_MEETING = Target.the("button to create a new meeting")
            .located(By.xpath("/html/body/main/section/div/div[2]/div[2]/div/div/div[1]/div/span"));
    public final static Target INPUT_MEETING_NAME = Target.the("input the meeting name")
            .located(By.xpath("//input[@name='MeetingName']"));

    public final static Target CONTAINER_MEETIN_TYPE = Target.the("container the meeting type")
            .located(By.xpath("/html/body/main/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[2]/div[1]/a"));

    public final static Target INPUT_MEETING_TYPE = Target.the("button to select business type")
            .located(By.xpath("/html/body/div[6]/div/input"));

    public final static Target INPUT_MEETING_NUMER = Target.the("input the meeting number")
            .located(By.xpath("//input[@name='MeetingNumber']"));

    public final static Target INPUT_MEETING_START_DATE = Target.the("input the meeting number")
            .located(By.xpath("//input[@name='StartDate']"));

    public final static Target INPUT_MEETING_END_DATE = Target.the("input the meeting number")
            .located(By.xpath("//input[@name='EndDate']"));

    public final static Target CONTAINER_MEETING_UNIT = Target.the("container the meeting type")
            .located(By.xpath("/html/body/main/section/div[2]/div[2]/div[1]/div[2]/form/div/div/div/div/div[7]/div[1]/a"));
    public final static Target INPUT_MEETING_UNIT = Target.the("input to select the meeting unit")
            .located(By.xpath("/html/body/div[7]/div/input"));

    public final static Target BUTTON_CREATE_MEETING = Target.the("button to create a meeting")
            .located(By.xpath("/html/body/main/section/div[2]/div[2]/div[1]/div[1]/div/div/div/div[1]"));

}
