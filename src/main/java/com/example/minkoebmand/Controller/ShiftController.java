package com.example.minkoebmand.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShiftController {

    @GetMapping("/create-shift")
    public String requestCreateShiftPage() {
        return "create-shift";
    }



}
