package org.academiadecodigo.bootcamp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.servlet.http.HttpServlet;

public class ControllerServlet {

    @Controller
    public class HelloController {

        @RequestMapping(method = RequestMethod.GET, value = "/")
        public String sayHello(Model model) {

            Customer customer = new Customer();
            customer.setId(1);
            customer.setFirstName("Rui");
            customer.setLastName("Ferrão");
            customer.setEmail("rui.ferrao@academiadecodigo.org");
            customer.setPhone("916668877");

            model.addAttribute("greeting", "Hello World");

            return "index";

        }
    }
}
