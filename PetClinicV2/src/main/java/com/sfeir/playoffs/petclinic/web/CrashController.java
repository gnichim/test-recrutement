package com.sfeir.playoffs.petclinic.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Controller used to showcase what happens when an exception is thrown
 *
 * Also see how the bean of type 'SimpleMappingExceptionResolver' has been declared inside /WEB-INF/mvc-core-config.xml
 */
@Controller
public class CrashController {

    public CrashController() {
        super();
    }

    @RequestMapping(value = "/oups", method = RequestMethod.GET)
    public String triggerException() {
        throw new RuntimeException("Expected: controller used to showcase what " +
            "happens when an exception is thrown");
    }
}
