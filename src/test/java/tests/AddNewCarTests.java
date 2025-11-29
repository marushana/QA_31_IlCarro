package tests;

import models.Car;
import models.User;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Random;

public class AddNewCarTests extends TestBase{

    @BeforeClass
    public void preCondition(){
        if(!app.getHelperUser().isLogged()){
            app.getHelperUser().login(new User().withEmail("marushana@yandex.ru").withPassword("Pokrov13041986!"));
        }
    }
    @Test
    public void addNewCarSuccess(){
        int i = new Random().nextInt(1000)+1000;
        Car car = Car.builder()
                .location("Haifa, Israel")
                .manufacture("Mazda")
                .model("M3")
                .year("2024")
                .fuel("petrol")
                .carClass("C")
                .seats(4)
                .carRegNumber("678-900"+i)
                .price(50.)
                .about("Very nice car")
                .build();

        app.getHelperCar().openCarForm();
        app.getHelperCar().fillCarForm(car);
        app.getHelperCar().submitCarForm();
    }



}
