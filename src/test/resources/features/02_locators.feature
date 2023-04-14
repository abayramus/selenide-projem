@locators
  Feature: locators
    Scenario: TC01 locators
      Given kullanici "https://testcenter.techproeducation.com/index.php?page=form-authentication" adresine gider
      And 3 saniye bekler
      And kullanici adini gir
      And 3 saniye bekler
      And kullanici sifresini gir
      And 3 saniye bekler
      When submit buttonuna tikla
      And 5 saniye bekler
      Then giris yapildigini test et

#      1. feature file olustur
#      2. test caseleri yaz
#      3. yeni test adimlari icin yeni bir step definition class olustur ve step definitions(java metotlari) olustur
#      4. Page class olustur pages klasorunun altinda
#      5. kullaniciAdi, sifresi ve submit butonunu o sayfada bul
#

