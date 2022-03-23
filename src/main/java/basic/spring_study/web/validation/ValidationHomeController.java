package basic.spring_study.web.validation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/validation/validationHome")
public class ValidationHomeController {

    @GetMapping
    public String goValidationHome() {
        return "validation/validationHome";
    }

}
