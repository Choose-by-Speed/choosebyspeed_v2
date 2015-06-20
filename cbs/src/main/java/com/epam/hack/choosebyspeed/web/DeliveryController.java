package com.epam.hack.choosebyspeed.web;
import com.epam.hack.choosebyspeed.domain.Delivery;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;

@RooWebJson(jsonObject = Delivery.class)
@Controller
@RequestMapping("/deliverys")
@RooWebScaffold(path = "deliverys", formBackingObject = Delivery.class)
public class DeliveryController {
}
