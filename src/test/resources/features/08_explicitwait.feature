Feature: explicit wait
  @explicitwait
  Scenario: explicit wait
    Given kullanici "https://the-internet.herokuapp.com/dynamic_loading/1" adresine gider
    And start butonuna tiklar
    Then kullanici "Hello World!" metnini dogrular
    Then sayfayi acik tutar