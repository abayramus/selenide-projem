@google
Feature: navigasyonlar
  Scenario: TC 01 navigasyon testi
    Given kullanici "https://www.google.com/" adresine gider
    Then kullanici "https://www.amazon.com/" adresine gider
    And 5 saniye bekler
    Then onceki sayfaya gider
    Then sonraki sayfaya gider
    Then sayfayi yeniler
    Then sayfayi acik tutar