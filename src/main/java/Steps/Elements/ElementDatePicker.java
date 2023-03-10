package Steps.Elements;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import tools.Input;
import tools.Transition;

import static com.codeborne.selenide.Selenide.$;

public class ElementDatePicker {
    private final Transition transition =new Transition("Widgets","Date Picker");
    private final Input dateAndTimePickerInput = new Input("dateAndTimePickerInput");


    @Step("Переход с домашней страницы на страницу \"Date Picker\"")
    public void transitionDatePicker(){
        transition.transitionOne();
        $(By.xpath("//div[@class='left-pannel']")).scrollTo();
        transition.transitionTwo();
    }

    @Step("Ввод в поле \"Date And Time\"")
    public void inputDate(String date,String expected){
        while (dateAndTimePickerInput.getValueInput().length()>0)
            dateAndTimePickerInput.sendKeysBackSpaseInput();
        dateAndTimePickerInput.setValueInput(date);
        dateAndTimePickerInput.sendKeysEnterInput();
        dateAndTimePickerInput.checkTextInput(expected);
    }
}