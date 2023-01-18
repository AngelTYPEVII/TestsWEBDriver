package Tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestWidgetsMenu extends BaseTest{
    @Test
    @DisplayName("Тест наведения на элементы меню")
    public void testWidgetsMenu(){
        menu.transitionMenu();
        menu.hoverMainItem2();
        menu.hoverSubList();
        menu.hoverSubItem2();
    }
}