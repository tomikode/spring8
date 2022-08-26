package example.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    
// https://www.youtube.com/watch?v=x9GaBXH0H4s
// https://www.youtube.com/watch?v=KTBWCJPKiqk
// https://andriperera.medium.com/spring-boot-restful-application-with-cloud-sql-for-mysql-7bfad7b3824b

    @GetMapping
    String tests(Model model) {
        model.addAttribute("testAttribute", "coming from controller");
        return "test";
    }

}
