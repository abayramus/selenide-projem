Feature: js executor

  @scrollwithjs
  Scenario: js executor

    Given kullanici "https://www.amazon.com/" adresine gider
    And tum ekran goruntusunu alir
    And footer elementi gorunur sekilde goster
    And tum ekran goruntusunu alir
    Then sayfayi acik tutar

