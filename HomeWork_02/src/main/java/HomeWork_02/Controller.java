package HomeWork_02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private final ServicePage servicePage;
    public Controller(ServicePage servicePage) {
        this.servicePage = servicePage;
        System.out.println("Program is run!!!" );
    }
    @GetMapping("/")
    public String helloString(){
        return this.servicePage.getGreetingString();
    }
}
