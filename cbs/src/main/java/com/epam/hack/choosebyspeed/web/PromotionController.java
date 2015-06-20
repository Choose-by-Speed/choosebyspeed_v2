package com.epam.hack.choosebyspeed.web;
import com.epam.hack.choosebyspeed.domain.Promotion;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;

@RooWebJson(jsonObject = Promotion.class)
@Controller
@RequestMapping("/promotions")
@RooWebScaffold(path = "promotions", formBackingObject = Promotion.class)
public class PromotionController {
}
