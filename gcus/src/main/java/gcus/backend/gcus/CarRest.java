package gcus.backend.gcus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;

@RestController
public class CarRest {
    @PostMapping("/api/cars")
    public Car car(){
        System.out.println("UserApicontroller start...");
        Car car=new Car(1,"Grandeur","Hyundai",6000);
        return car;
    }
    @GetMapping("/api/getCar")
    public Car get(){
        System.out.println("UserApicontroller start...");
        Car car=new Car(2,"Sonata","Hyundai",3000);
        return car;
    }
}