package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import pages.BNSPage;

import java.util.List;

import static java.lang.Thread.sleep;

public class BNSDataTableStep extends AbstarctClass {

    BNSPage bnsp= PageFactory.initElements(driver, BNSPage.class);


    @Given("User is on BNS signup webpage")
    public void user_is_on_BNS_signup_webpage() {
        driver.get("file:///C:/Users/A%20R%20Tarafder/Desktop/BNS.html");
    }

    @When("User will enter data from following table")
    public void user_will_enter_data_from_following_table(DataTable table1) {
        List<String> data1=table1.row(1);
        bnsp.enterFirstName(data1.get(0));
        bnsp.enterLastName(data1.get(1));
        bnsp.enterEmail(data1.get(2));
        bnsp.enterPassword(data1.get(3));
        bnsp.enterPhone(data1.get(4));

    }

    @When("User will select data from following table")
    public void user_will_select_data_from_following_table(DataTable table2) {
        List<String> data1=table2.column(1);
        bnsp.selectMonth(data1.get(0));
        bnsp.selectDay(data1.get(1));
        bnsp.selectYear(data1.get(2));
    }

    @When("User will select from following table")
    public void user_will_select_from_following_table(DataTable table3) {
        List<String> data1=table3.row(1);
        if(data1.get(0).equalsIgnoreCase("Male")) {
            bnsp.clickMale();
        }
        else{
            bnsp.clickFemale();
        }

    }

    @When("User will click on Submit button")
    public void user_will_click_on_Submit_button() {
        bnsp.clickSubmit();
    }

    @Then("User should get meaasge as following table")
    public void user_should_get_meaasge_as_following_table(DataTable table4) {
        List<String> data1=table4.row(1);
        bnsp.verifyMessage(data1.get(0));
    }

}
