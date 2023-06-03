@Test
public void checkIsAdultWhenAgeIsMoreThan18True() {
    Program program = new Program();
    boolean isAdult = program.checkIsAdult(19);
    boolean actual = isAdult;
    boolean expected = true;
	assertEquals("Ошибка ошибочная", expected, isAdult);
}