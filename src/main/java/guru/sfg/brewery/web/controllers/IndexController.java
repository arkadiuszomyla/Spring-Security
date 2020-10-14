package guru.sfg.brewery.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by jt on 2019-01-26.
 */
@Controller
public class IndexController {

    @GetMapping({"", "/"})
    public String index(){
        return "index";
    }
}
