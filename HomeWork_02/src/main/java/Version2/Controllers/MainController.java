package Version2.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class MainController {
    @GetMapping("/") // указывается обрабатываемый url адрес - главная страница
    public String home(Model model){
        model.addAttribute("title", "Главная страница");
        // в это строчке параметр title будет передан в шаблон - название странички
        return "home";
    }
}
