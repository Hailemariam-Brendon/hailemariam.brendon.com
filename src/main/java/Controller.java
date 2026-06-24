import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/")
    public String homepage(){

        return "login-page";
    }

    @PostMapping("/home-page")
    public String homePage(){
        return "home-page";
    }
}
