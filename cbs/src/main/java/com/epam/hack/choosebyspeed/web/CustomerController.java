package com.epam.hack.choosebyspeed.web;
import com.epam.hack.choosebyspeed.domain.Customer;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;

@RooWebJson(jsonObject = Customer.class)
@Controller
@RequestMapping("/customers")
@RooWebScaffold(path = "customers", formBackingObject = Customer.class)
public class CustomerController {
}
