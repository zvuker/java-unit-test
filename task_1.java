
@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
  
    // Проверка, что isAdult равно true
    assertEquals("Expected isAdult to be true", true, isAdult);
}