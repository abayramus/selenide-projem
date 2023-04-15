Feature: iframe _ windows

  @iframe
  Scenario: TC01 iframe ve window
    Given kullanici "https://testcenter.techproeducation.com/index.php?page=iframe" adresine gider
    And switch to frame 1
    And kullanici back to techproeducation.com linkine tiklar
    And switch to window 2
    Then sayfayi acik tutar

