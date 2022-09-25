package controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {


    private String MyService;

    public MyController(String myService) {
        MyService = myService;
    }

    @GetMapping("/getName")
    public String getName(@RequestParam String MyService) {
        return getName("Mario");

    }

    @GetMapping("/welcomemessage")
    public String welcome() {
        return "Welcome";



    }
}

