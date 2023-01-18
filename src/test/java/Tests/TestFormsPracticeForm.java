package Tests;

import Persons.PersonInfo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestFormsPracticeForm extends BaseTest implements PersonInfo {
    @Test
    @DisplayName("Тест заполнения формы")
    public void testFormsPracticeForm(){
        forms.transitionForms();
        forms.inputFirstName(person.getName());
        forms.inputLastName(person.getLastName());
        forms.inputEmail(person.getEmail());
        forms.inputGender("Male");
        forms.inputNumber(person.getPhoneNumber());
        forms.inputDateOfBirth("26.09.2002");
        forms.inputHobbies("Reading","","");
        forms.avatarUpload();
        forms.inputAddress(person.getPermanentAddress());
        forms.submit();
        forms.closeWidow();
    }
}