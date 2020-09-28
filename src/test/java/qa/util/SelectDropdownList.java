package qa.util;

import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class SelectDropdownList {

    public void selectDropdown(List<WebElement> dropdown, String opcion) {
        for (WebElement element : dropdown) {
            if (opcion.equals(element.getText())) {
                element.click();
                break;
            }
         }
            //System.out.println("No se encuentra ramo");
        
    }
}
