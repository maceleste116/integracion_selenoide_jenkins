package qa.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import qa.util.SortAtributo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class HomeAtributoServices {

    @Autowired
    private WebDriver driver;

    @Autowired
    private WebDriverWait wait;

    @Autowired
    private HomeAtributoPage homeAtributoPage;

    public void clickOnMenuPrincipal() {
        this.wait.until(ExpectedConditions.visibilityOf(this.homeAtributoPage.getMenuPrincipal()));
        this.homeAtributoPage.getMenuPrincipal().click();
    }

    public void clickOnMenuDimension() {
        this.wait.until(ExpectedConditions.visibilityOf(homeAtributoPage.getMenuAtributo()));
        this.homeAtributoPage.getMenuAtributo().click();
    }

    public void clickOnButtonCrear() {
        //this.wait.until(ExpectedConditions.visibilityOf(homeAtributoPage.getButtonCrear()));
        this.homeAtributoPage.getButtonCrear().click();
    }

    public void clickOnButtonVolver(){
        this.homeAtributoPage.getButtonVolver().click();
    }

    public void clickOnTablaMostrarAccion() {
        this.wait.until(ExpectedConditions.visibilityOf(this.homeAtributoPage.getTablaMostrarAccion()));
        this.homeAtributoPage.getTablaMostrarAccion().click();
    }

    public void clickOnTablaButtonEditar() {
        this.wait.until(ExpectedConditions.visibilityOf(homeAtributoPage.getTablaButtonEditar()));
        this.homeAtributoPage.getTablaButtonEditar().click();
    }

    public void clickOnTablaButtonEliminar() {
        this.wait.until(ExpectedConditions.visibilityOf(homeAtributoPage.getTablaButtonEliminar()));
        this.homeAtributoPage.getTablaButtonEliminar().click();
    }


    //TABLA

    public void clickOnIconAsc(){
        this.wait.until(ExpectedConditions.visibilityOf(homeAtributoPage.getIconSortAsc()));
        homeAtributoPage.getIconSortAsc().click();
    }

    public void clickOnIconDesc(){
        homeAtributoPage.getIconSortDesc().click();
    }

    public boolean sortAscTableAtributo() {

        SortAtributo sortAtributo = new SortAtributo();

        List<String> allItems = homeAtributoPage.getMostrarTableHome().findElements(By.className("item"))
                .stream()
                .map(WebElement::getText)
                .map(String::trim)
                .collect(Collectors.toList()); //obtener todos los ítems de la tabla sin encabezado

        //System.out.println(allItems); print todos los items
        //System.out.println(allItems.get(0)); // print primer elemento
        //System.out.println(allItems.size()); // print tamaño de la lista

        List<String> firstColumn = new ArrayList<String>(); //Obtener la primera columna
        List<String> firstColumnAsc = new ArrayList<String>();

        int multiplo = 6; // obtener todos los items de la primera columna
        for(int i=0; i<allItems.size(); i++){
            if (i%multiplo == 0 ){
                firstColumn.add(allItems.get(i));
                firstColumnAsc.add(allItems.get(i));
            }
        }
        System.out.println("Antes de llamar al método:" + firstColumn);
        System.out.println("Antes de llamar al método:" + firstColumnAsc);
        firstColumnAsc = sortAtributo.sortAscAtributo(firstColumnAsc);
        System.out.println("Después de llamar al método:" + firstColumn);
        System.out.println("Después de llamar al método:" + firstColumnAsc);


        int count = 0;
        for(int i=0; i<firstColumn.size(); i++) {
            if (firstColumn.get(i).equals(firstColumnAsc.get(i))) {
                count++;

            }
        }
        if (count == firstColumn.size()) {
            return true;

        }else {
            return false;

        }
    }

    public boolean sortDescTableAtributo() {

        SortAtributo sortAtributo = new SortAtributo();

        List<String> allItems = homeAtributoPage.getMostrarTableHome().findElements(By.className("item"))   // get table headers
                .stream()
                .map(WebElement::getText)
                .map(String::trim)
                .collect(Collectors.toList());

        List<String> firstColumn = new ArrayList<String>();
        List<String> firstColumnDesc = new ArrayList<>();
        int multiplo = 9;
        for(int i=0; i<allItems.size(); i++){
            if (i%multiplo == 0 ){
                firstColumn.add(allItems.get(i));
                firstColumnDesc.add(allItems.get(i));
            }
        }

        firstColumnDesc = sortAtributo.sortDescAtributo(firstColumnDesc);

        int count = 0;
        for(int i=0; i<firstColumn.size(); i++) {
            if (firstColumn.get(i).equals(firstColumnDesc.get(i))) {
                count++;

            }
        }
        if (count == firstColumn.size()) {
            return true;

        }else {
            return false;

        }
    }

}
