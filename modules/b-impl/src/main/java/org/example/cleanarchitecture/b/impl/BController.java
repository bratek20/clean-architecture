package org.example.cleanarchitecture.b.impl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BController {

    @GetMapping("/user")
    @ResponseBody
    public String getUser() {
        return "User information";
    }
}
