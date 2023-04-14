package stepdefinitions;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static com.codeborne.selenide.Selenide.*;

public class CommonStepDefinitions {

    @Given("kullanici {string} adresine gider")
    public void kullanici_adresine_gider(String string) {
        open(string);
    }
    @Then("{int} saniye bekler")
    public void saniye_bekler(Integer int1) {
//        selenide default olarak 4 saniye bekler
//        4 saniyeden fazla beklemek icin sleep metotu kullanilir
//        sleep foncsiyonu millisecond kabul eder. saniyeye cevirmek icin 1000 ile carpilir
        sleep(int1*1000);
    }
    @Then("onceki sayfaya gider")
    public void onceki_sayfaya_gider() {
        back();
    }
    @Then("sonraki sayfaya gider")
    public void sonraki_sayfaya_gider() {
        forward();
    }
    @Then("sayfayi yeniler")
    public void sayfayi_yeniler() {
        refresh();
    }
    @Then("sayfayi acik tutar")
    public void sayfayi_acik_tutar() {
//        Varyasilan selenide ayarlarinda, browser otomatik kapanmakdadir
//        Configuration.holdBrowserOpen=false;//VARSAYILAN
        Configuration.holdBrowserOpen=true;
    }
}
