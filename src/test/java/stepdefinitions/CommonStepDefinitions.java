package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static com.codeborne.selenide.Selenide.*;

public class CommonStepDefinitions {

    @Given("kullanici {string} adresine gider")
    public void kullanici_adresine_gider(String string) {
        open(string);
        // Bir sayfaya gitmek için open() metdodu kullanılıyor. driver.get yerine
    }

    @And("{int} saniye bekler")
    public void saniyeBekler(int arg0) {
        sleep(arg0*1000);
    }

    @Then("onceki sayfaya gider")
    public void oncekiSayfayaGider() {
        back();
    }

    @Then("sonraki sayfaya gider")
    public void sonrakiSayfayaGider() {
        forward();
    }

    @Then("sayfayi yeniler")
    public void sayfayiYeniler() {
        refresh();
    }

    @Then("sayfayi acik tutar")
    public void sayfayiAcikTutar() {
    }
}
