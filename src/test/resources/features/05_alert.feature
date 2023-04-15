Feature: alerts

  @alert
  Scenario: TC01 alert
    Given kullanici "https://testcenter.techproeducation.com/index.php?page=javascript-alerts" adresine gider
    And alert prompt butonuna tiklar
    And kullanici alerte "nasilsin" metnini yazar ve OK e tiklar
    Then kullanici sonucun "nasilsin" icerdigini dogrular
