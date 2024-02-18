package com.emids.CTMS;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CtmsStudy {

    @GetMapping("/study")
    public String study() {

        return "Study is all about the treatment of patients. Which make them feel better.";
    }

}