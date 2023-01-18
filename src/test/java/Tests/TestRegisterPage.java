package Tests;

import Persons.PersonInfo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestRegisterPage extends BaseTest implements PersonInfo{
    @Test
    @DisplayName("Тест регистрации")
    public void testBookStoreApplicationRegister(){
        loginPage.skrollrBody();
        loginPage.transitionBookStoreApplication();
        registerUser.newUser();
        registerUser.inputFirstName(person.getName());
        registerUser.inputLastName(person.getLastName());
        registerUser.inputUserName(person.getUserName());
        registerUser.inputPassword("qwertzxcQQ123!");
        registerUser.registerNewUser();
    }
}