package stepdefinitions;

import io.cucumber.java.en.Given;

import static com.codeborne.selenide.Selenide.open;

public class CommonStepDefinitions {

    @Given("kullanici {string} adresine gider")
    public void kullanici_adresine_gider(String string) {
        open(string);
    }
}
