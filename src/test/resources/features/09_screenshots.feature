@ekrangoruntusu
Feature: screenshots

  @tumekrangoruntusu
  Scenario: tum ekran goruntusu
    Given kullanici "https://www.google.com/" adresine gider
    And tum ekran goruntusunu alir

    @googleimage
    Scenario: belirli elemenetin ekran goruntusu
      Given kullanici "https://www.google.com/" adresine gider
      And google image goruntusunu al

