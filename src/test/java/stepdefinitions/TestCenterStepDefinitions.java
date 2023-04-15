package stepdefinitions;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.TestCenterPage;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.switchTo;
import static com.codeborne.selenide.WebDriverRunner.url;
import static java.lang.Thread.sleep;

public class TestCenterStepDefinitions {

    TestCenterPage testCenterPage = new TestCenterPage();
    @Given("kullanici adini gir")
    public void kullanici_adini_gir() {
        testCenterPage.kullaniciAdi.setValue("techproed");
    }
    @Given("kullanici sifresini gir")
    public void kullanici_sifresini_gir() {
        testCenterPage.kullaniciSifresi.setValue("SuperSecretPassword");

    }
    @When("submit buttonuna tikla")
    public void submit_buttonuna_tikla() {
        testCenterPage.submitButton.click();
    }
    @Then("giris yapildigini test et")
    public void giris_yapildigini_test_et() {
//        Assert.assertTrue(testCenterPage.girisMesaji.isDisplayed());//JUNIT
//        testCenterPage.girisMesaji.shouldBe(Condition.visible);
        testCenterPage.girisMesaji.shouldBe(visible);// SELENIDE ASSERTION.
        // FAIL EDERSE EKRAN GORUNTUSU OTOMATIK OLARAK ALINIR VE build DOSYASINA KAYDEDILIR
    }
//DROPDOWN STEP DEFS
    @And("{string} secili degilse sec")
    public void seciliDegilseSec(String text) {

//        eger text = Checkbox 1 VE checkbox 1 secili degise, checkbox1 e tikla
        if (text.equals("Checkbox 1") && !testCenterPage.checkbox1.isSelected()){
            testCenterPage.checkbox1.click();
//            Assert.assertTrue(testCenterPage.checkbox1.isSelected());//junit
//            testCenterPage.checkbox1.shouldBe(Condition.checked);//selenide uzun version
            testCenterPage.checkbox1.shouldBe(checked);//selenide kisa version
        }
        if (text.equals("Checkbox 2") && !testCenterPage.checkbox2.isSelected()) {
            testCenterPage.checkbox2.shouldNotBe(checked);
            testCenterPage.checkbox2.click();
            testCenterPage.checkbox2.shouldBe(checked);
        }
        if (text.equals("Red")&& !testCenterPage.red.isSelected()){
            testCenterPage.red.shouldNotBe(checked);//secili olmadigini test et
            testCenterPage.red.click();//sec
            testCenterPage.red.shouldBe(checked);//secili oldugunu test et
        }

        if (text.equals("Football")&& !testCenterPage.football.isSelected()){
            testCenterPage.football.shouldNotBe(checked);//secili olmadigini test et
            testCenterPage.football.click();//sec
            testCenterPage.football.shouldBe(checked);//secili oldugunu test et
        }



    }

    @And("kullanici yil olarak {int}, ay olarak {string}, gun olarak {int}")
    public void kullaniciYilOlarakAyOlarakGunOlarak(int yil, String ay, int gun) throws InterruptedException {
//        testCenterPage.yil.selectOption(2000);//INDEX = 2000. MAKUL DEGIL.
//        testCenterPage.yil.selectOption(String.valueOf(yil));//METIN = "2000". CALISIR
        testCenterPage.yil.selectOptionByValue(String.valueOf(yil));//VALUE = "2000". CALISIR

        sleep(3000); //HARD WAIT

        testCenterPage.ay.selectOption(ay);//GORUNEN METIN ILE SEC ="June". POPULER.

        sleep(3000);

        testCenterPage.gun.selectOption(gun-1);//INDEX = 25-1 = 24. BU 25. gunu secer.

        sleep(3000);



    }

//    ALERT STEP DEFS
    @And("alert prompt butonuna tiklar")
    public void alertPromptButonunaTiklar() {
        testCenterPage.promptButton.click();
    }

    @And("kullanici alerte {string} metnini yazar ve OK e tiklar")
    public void kullaniciAlerteMetniniYazarVeOKETiklar(String arg0) throws InterruptedException {
        switchTo().alert().sendKeys(arg0);//Alerte FF gelen metni girelim
        sleep(3000);
        switchTo().alert().accept();//OK e tiklayalim
        sleep(3000);
//        Selenide.sleep(3000);//SELENIDE SLEEP. DINAMIC.
//        Thread.sleep(3000);//JAVA SLEEP. HARD. 3 SANIYE BEKLE.
    }

    @Then("kullanici sonucun {string} icerdigini dogrular")
    public void kullaniciSonucunIcerdiginiDogrular(String arg0) {
        testCenterPage.sonuc.shouldHave(text(arg0));//FF dan gelen metnin sonuc elementinde icerildigi dogrula.Tercih edilen.
//        Assert.assertTrue(testCenterPage.sonuc.getText().contains(arg0));//JUNIT ILE DE ASSERT EILEBILIR.
    }

    @And("switch to frame {int}")
    public void switchToFrame(int frame) {
        switchTo().frame(frame-1);//1-1 = 0. index = 1. iframe
    }

    @And("kullanici back to techproeducation.com linkine tiklar")
    public void kullaniciBackToTechproeducationComLinkineTiklar() throws InterruptedException {
        testCenterPage.techProLink.click();
        System.out.println("TechPro Linkine Tiklandi ve Yeni pencere acildi");
        Thread.sleep(3000);
//        System.out.println("SAYFA URL I : "+ WebDriverRunner.url());//DRIVER HALA TEST PAGE DE
        System.out.println("SAYFA URL I : "+ url());//DRIVER HALA TEST PAGE DE
    }

    @And("switch to window {int}")
    public void switchToWindow(int targetWindow) throws InterruptedException {
        switchTo().window(targetWindow-1, Duration.ofSeconds(5));// INDEX. Duration.ofSeconds(5)) zorunlu degil
        System.out.println("Yeni pencereye gecil yapildi");
        Thread.sleep(3000);
        System.out.println("YENI SAYFA URL I : "+url());//YENI SAYFA URL NI VERECEKDIR
    }
}
