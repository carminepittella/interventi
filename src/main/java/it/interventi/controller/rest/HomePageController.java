package it.interventi.controller.rest;

import it.interventi.utils.costants.Costants;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/homepage")
@RequiredArgsConstructor
public class HomePageController {

    /**************************** GET ****************************/

    @GetMapping("")
    private String getAllInterventi () {
        return Costants.LinkPages.REDIRECT + Costants.LinkPages.HOME_PAGE;
    }

}
