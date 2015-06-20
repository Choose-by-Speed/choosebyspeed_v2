package com.epam.hack.choosebyspeed.web;
import com.epam.hack.choosebyspeed.domain.Provider;
import org.springframework.roo.addon.web.mvc.controller.json.RooWebJson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.roo.addon.web.mvc.controller.scaffold.RooWebScaffold;

@RooWebJson(jsonObject = Provider.class)
@Controller
@RequestMapping("/providers")
@RooWebScaffold(path = "providers", formBackingObject = Provider.class)
public class ProviderController {
}
