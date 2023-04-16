Feature: actions
  @draganddrop
  Scenario: TC01 drag and drop
    Given kullanici "https://jqueryui.com/droppable/" adresine gider
    And switch to frame 1
    And kullanici source elementi target elementine surukler
    Then sayfayi acik tutar

    @dropanddropby
    Scenario: TC02 drag and drop by
      Given kullanici "https://jqueryui.com/droppable/" adresine gider
      And switch to frame 1
      And kullanici source elementini 300 by 10 koordinatlarina surukler
      And verilen coordinatlara 300 by 10 suruklendigini dogrular
