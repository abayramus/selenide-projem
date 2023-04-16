@crossbrowser
Feature: cross browser
  @headless
  Scenario: TC01 headless
    Given kullanici browser tipini "headless" olarak secer
    Given kullanici "https://www.amazon.com/" adresine gider
    Then tum ekran goruntusunu alir

  @firefox
  Scenario: TC02 firefox
    Given kullanici browser tipini "firefox" olarak secer
    Given kullanici "https://www.amazon.com/" adresine gider
    Then tum ekran goruntusunu alir

  @safari
  Scenario: TC03 safari - windowsda fail
    Given kullanici browser tipini "safari" olarak secer
    Given kullanici "https://www.amazon.com/" adresine gider
    Then tum ekran goruntusunu alir

  @edge
  Scenario: TC04 edge - macde fail
    Given kullanici browser tipini "edge" olarak secer
    Given kullanici "https://www.amazon.com/" adresine gider
    Then tum ekran goruntusunu alir
