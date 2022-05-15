package tests.qaguru;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.RegistrationFormPage;

import static io.qameta.allure.Allure.step;

public class RegistrationFormPageTest extends TestBase{
    @Test
    @DisplayName("Successful form filling test")
    void formFilling() {
        RegistrationFormPage page = new RegistrationFormPage();

        step("Open registration form", page::openPage);

        step("Fill registration form", () -> page.setFirstName()
                .setSurname()
                .setEmail()
                .selectGender()
                .setPhone()
                .setBirthDate()
                .setSubject()
                .selectHobby()
                .imageUpload()
                .setAddress()
                .setState()
                .setCity());

        step("Submit registration form", page::submitForm);

        step("Verify form data", () -> page.checkFormResult()
                .closeConfirmation());
    }
}