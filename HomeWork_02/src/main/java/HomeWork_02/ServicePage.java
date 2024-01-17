package HomeWork_02;

import org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class ServicePage {
    public String getGreetingString(){
        return "Hello my dear friend!";
    }
}
