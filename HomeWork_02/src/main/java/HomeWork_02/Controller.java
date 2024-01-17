package HomeWork_02;

import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

@RestController
public class Controller {
    private final ServicePage servicePage;
    public Controller(ServicePage servicePage) {
        this.servicePage = servicePage;
        System.out.println("Program is run!!!" );

    }
    @GetMapping("/str")
    public String helloString(){
        return this.servicePage.getGreetingString();
    }
    @GetMapping("/pic")
    public File helloPic(){
        return new File("hello.jpeg");
    }
}
