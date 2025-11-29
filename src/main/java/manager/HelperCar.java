package manager;

import models.Car;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HelperCar extends HelperBase{


    public HelperCar(WebDriver wd) {
        super(wd);
    }

    public void openCarForm(){
        click(By.xpath("//*[text()=' Let the car work ']"));
    };

    public void fillCarForm(Car car) {

    }


}
