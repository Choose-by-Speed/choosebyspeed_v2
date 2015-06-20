package com.epam.hack.choosebyspeed.web;
import com.epam.hack.choosebyspeed.domain.Product;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;

@RooWebJson(jsonObject = Product.class)
@Controller
@RequestMapping("/products")
@RooWebScaffold(path = "products", formBackingObject = Product.class)
public class ProductController {
}
