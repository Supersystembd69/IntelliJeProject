package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;
import pages.BNSPage;

public class BNSData extends AbstarctClass{

    BNSPage bnsp= PageFactory.initElements(driver, BNSPage.class);

    @Given("user on BNS signup webpage")
    public void user_on_BNS_signup_webpage() {
        driver.get("file:///C:/Users/A%20R%20Tarafder/Desktop/BNS.html");
    }

    @When("user enter {string} in firstname textbox, {string} in lastname textbox, {string} in email textbox,{string} in password textbox,{string} in phonenumber textbox")
    public void user_enter_in_firstname_textbox_in_lastname_textbox_in_email_textbox_in_password_textbox_in_phonenumber_textbox(String FN, String LN, String EM, String PW, String Pho) {
        bnsp.enterFirstName(FN);
        bnsp.enterLastName(LN);
        bnsp.enterEmail(EM);
        bnsp.enterPassword(PW);
        bnsp.enterPhone(Pho);
    }

    @When("userselect {string} from month dropdownbox , {string} from day dropdownbox, {string} from year dropdownbox")
    public void userselect_from_month_dropdownbox_from_day_dropdownbox_from_year_dropdownbox(String MN, String DY, String YR) {
        bnsp.selectMonth(MN);
        bnsp.selectDay(DY);
        bnsp.selectYear(YR);
    }

    @When("user select on {string} from gender radio button")
    public void user_select_on_from_gender_radio_button(String gender) {
        if(gender.equalsIgnoreCase("Male")) {
            bnsp.clickMale();
        }
        else {
            bnsp.clickFemale();
        }

    }

    @When("user click on Submit button")
    public void user_click_on_Submit_button() {
        bnsp.clickSubmit();

    }

    @Then("user should see meaasge {string}")
    public void user_should_see_meaasge(String Msn) {
        bnsp.verifyMessage(Msn);

    }

}
