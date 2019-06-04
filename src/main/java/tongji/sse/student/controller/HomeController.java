package tongji.sse.student.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Component
public class HomeController {

    @RequestMapping("/")
    @ResponseBody
    String homePage() {
        return "Hello";
    }
}
