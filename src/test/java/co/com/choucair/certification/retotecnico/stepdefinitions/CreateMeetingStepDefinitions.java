package co.com.choucair.certification.retotecnico.stepdefinitions;


import co.com.choucair.certification.retotecnico.model.CreateMeetingData;
import co.com.choucair.certification.retotecnico.questions.MeetingError;
import co.com.choucair.certification.retotecnico.questions.Meetings;
import co.com.choucair.certification.retotecnico.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;

import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class CreateMeetingStepDefinitions {

    @Before
    public void setStage() {
        setTheStage(new OnlineCast());
    }

    @Given("^than Carlos wants to create a new business unit and schedule a reunion$")
    public void thanCarlosWantsToCreateANewBusinessUnitAndScheduleAReunion(List<CreateMeetingData> createMeetingData) {
        theActorCalled("Carlos").wasAbleTo(OpenUp.thePage(), SignIn.theAccount(createMeetingData.get(0)));
    }

    @When("^he creates a new business unit and schedule a new reunion$")
    public void heCreatesANewBusinessUnitAndScheduleANewReunion(List<CreateMeetingData> createMeetingData) {
        theActorInTheSpotlight().attemptsTo(HomePage.selectOrganization(), BusinessUnits.create(createMeetingData.get(0)), Meeting.schedule(createMeetingData.get(0)));
    }

    @Then("^the reunion is listed in the meeting list$")
    public void theReunionIsListedInTheMeetingList(List<CreateMeetingData> createMeetingData) {
        theActorInTheSpotlight().should(seeThat(Meetings.wasScheduled(createMeetingData.get(0))));
    }

    @When("^he creates a new business unit and schedule a new reunion with an invalid date$")
    public void heCreatesANewBusinessUnitAndScheduleANewReunionWithAnInvalidDate(List<CreateMeetingData> createMeetingData) {
        theActorInTheSpotlight().attemptsTo(HomePage.selectOrganization(), BusinessUnits.create(createMeetingData.get(0)), BadMeeting.schedule(createMeetingData.get(0)));
    }

    @Then("^the message error is shown to the user$")
    public void theMessageErrorIsShownToTheUser(List<CreateMeetingData> createMeetingData) {
        theActorInTheSpotlight().should(seeThat(MeetingError.isShow(createMeetingData.get(0))));
    }

}
