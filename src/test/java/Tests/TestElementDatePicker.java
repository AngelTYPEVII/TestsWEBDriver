package Tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestElementDatePicker extends BaseTest{
    @Test
    @DisplayName("Тест поля для ввода даты")
    public void testWidgetsDatePicker(){
        datePicker.transitionDatePicker();
        datePicker.inputDate("September 26 2002 14:30","September 26, 2002 2:30 PM");
        datePicker.inputDate("01/01/2023/10:00","January 1, 2023 10:00 AM");
        datePicker.inputDate("qwerty123245","");
        datePicker.inputDate("------____+++","");
    }
}