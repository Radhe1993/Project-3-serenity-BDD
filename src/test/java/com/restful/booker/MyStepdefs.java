package com.restful.booker;

import com.restful.booker.userinfo.BookingSteps;
import com.restful.booker.utils.TestUtils;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class MyStepdefs {


    static String firstName = "Ram" + TestUtils.getRandomValue();
    static String lastName = "SitaRam" + TestUtils.getRandomValue();
    static String additionalNeeds = "Practice";
    static int totalPrice;
    static boolean depositPaid;
    static int bookingId;

    static String token;
    @Steps
    BookingSteps bookingSteps;
    @Given("^I get all data$")
    public void iGetAllData() {
    }

    @When("^I send POST request to create a new booking with firstName\"([^\"]*)\", lastName\"([^\"]*)\", totalprice \"([^\"]*)\", depositpaid \"([^\"]*)\", checkin \"([^\"]*)\", checkout\"([^\"]*)\" additionalneeds \"([^\"]*)\"$")
    public void iSendPOSTRequestToCreateANewBookingWithFirstNameLastNameTotalpriceDepositpaidCheckinCheckoutAdditionalneeds(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {
     bookingSteps.creatingBooking(firstName,  lastName,  totalPrice,  depositPaid,  additionalNeeds);
    }

    @Then("^I verify that new booking is created by id$")
    public void iVerifyThatNewBookingIsCreatedById() {
    }

    @And("^I send a Put request with  firstName\"([^\"]*)\", lastName\"([^\"]*)\", totalprice \"([^\"]*)\", depositpaid \"([^\"]*)\", checkin \"([^\"]*)\", checkout\"([^\"]*)\" additionalneeds \"([^\"]*)\"$")
    public void iSendAPutRequestWithFirstNameLastNameTotalpriceDepositpaidCheckinCheckoutAdditionalneeds(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6) throws Throwable {
       bookingSteps. updatingBooking( firstName,  lastName,  totalPrice,  depositPaid, additionalNeeds,  token,  bookingId);
    }

    @And("^The totalprice \"([^\"]*)\" is successfully updated$")
    public void theTotalpriceIsSuccessfullyUpdated(String arg0) throws Throwable {

    }

    @And("^I send delete booking by id$")
    public void iSendDeleteBookingById() {

        bookingSteps. deleteBooking( bookingId, token);
    }

    @Then("^The booking is successfully deleted from the record$")
    public void theBookingIsSuccessfullyDeletedFromTheRecord() {
    }
}
