Feature: Create a new Business Unit and schedule a new reunion to the business unit
    As user, I want to create a new business unit and create a new reunion to the business unit
    Scenario: Create a new Businees Unit with a correct name and schedule a valid reunion
    Given than Carlos wants to create a new business unit and schedule a reunion
      | strUserAccount  | strUserPassword |
      | admin           | serenity        |
    When he creates a new business unit and schedule a new reunion
      | strBusinessUnit  | strMeetingName         | strMeetingType | strMeetingNumber | strStartDate | strEndDate  |
      | Admin            | Admin                  | Strategy       | 1                | 08/17/2022   | 08/18/2022  |
    Then the reunion is listed in the meeting list
      | strBusinessUnit  | strMeetingName  | strMeetingType | strMeetingNumber |
      | Admin            | Admin           | Strategy       | 1                |

  Scenario: Create a new Businees Unit with a correct name and try to schedule a meeting with an incorrect date
    Given than Carlos wants to create a new business unit and schedule a reunion
      | strUserAccount  | strUserPassword |
      | admin           | serenity        |
    When he creates a new business unit and schedule a new reunion with an invalid date
      | strBusinessUnit  | strMeetingName         | strMeetingType | strMeetingNumber | strStartDate | strEndDate  |
      | Admin            | Admin                  | Strategy       | 1                | 08/18/2022   | 08/17/2022  |
    Then the message error is shown to the user
      | strErrorMessage |
      | Please validate empty or invalid inputs (marked with red) before submitting the form. |
