package doctorgroup.docteurqui.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DoctorController {
    @GetMapping("/Doctor/1")
    @ResponseBody
    public String doctor1() {
        return "<h1>Hello I'm the Doctor William Hartnell</h1>";
    }

    @GetMapping("/Doctor/10")
    @ResponseBody
    public String doctor2() {
        return "<h1>Hello I'm the Doctor David Tennant</h1>";
    }

    @GetMapping("/Doctor/13")
    @ResponseBody
    public String doctor3() {
        return "<h1>Hello I'm the Doctor Jodie Whittaker(the next Doctor Is a Former doctor)</h1>";
    }


}
