package qa.tasks;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import qa.pageobjects.HomeAtributoServices;

@Component
public class MenuAtributo {
    @Autowired
    private HomeAtributoServices homeAtributoServices;

    public void irMenuAtributo(){
        homeAtributoServices.clickOnMenuPrincipal();
        homeAtributoServices.clickOnMenuDimension();
    }
}
