package it.interventi.controller.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/interventi")
public class InterventoControllerView {

    @GetMapping
    public String getHomePage () {
        return "interventi";
    }


}
