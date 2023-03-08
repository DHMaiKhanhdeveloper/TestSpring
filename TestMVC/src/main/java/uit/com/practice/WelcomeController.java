package uit.com.practice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	   @RequestMapping({"/", "/add"})
	    public String welcome(){
	        return "welcome";
	    }

}
