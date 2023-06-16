package org.fjank.thleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class XmlController {
    @GetMapping(value = "/test")
    public ModelAndView test() {
        String str = """
                The five markup-significant characters: <, >, &, " and ' All non ASCII characters.
                Note that <, > and & must be escaped to avoid breaking the xml.
                æøå is non ASCII and should be escaped.
                """;
        ModelAndView mv = new ModelAndView("xmlTemplate");
        mv.getModel().put("str", str);
        return mv;
    }
}