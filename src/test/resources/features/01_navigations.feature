@google
Feature: navigasyonlar
  Scenario: TC 01 navigasyon testi
    Given kullanici "https://www.google.com/" adresine gider
    And 5 saniye bekler
    Then kullanici "https://www.amazon.com/" adresine gider
    And 5 saniye bekler
    Then onceki sayfaya gider
    And 5 saniye bekler
    Then sonraki sayfaya gider
    And 5 saniye bekler
    Then sayfayi yeniler
    And 5 saniye bekler
    Then sayfayi acik tutar