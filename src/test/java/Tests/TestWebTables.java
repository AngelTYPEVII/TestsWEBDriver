package Tests;

import Persons.PersonInfo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestWebTables extends BaseTest implements PersonInfo{
    @Test
    @DisplayName("Тест заполнения таблицы")
    public void testWebTables(){
        webTables.transitionElements();
        webTables.addUser();
        webTables.inputFirstUserName(person.getName());
        webTables.inputLastUserName(person.getLastName());
        webTables.inputUserEmail(person.getEmail());
        webTables.inputUserAge(person.getAge());
        webTables.inputSalary(100000);
        webTables.inputDepartment("SzszSZLKK123");
        webTables.submit();
    }
}