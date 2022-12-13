package com.example.minkoebmand.RestController;

import com.example.minkoebmand.Model.Shift;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShiftAPI {

    @GetMapping("/get-shift-by-id-api")
    public void getShiftByIDFromRepository() {

    }

    @GetMapping("/get-shifts-by-week-api")
    public void getShiftsByWeekFromRepository() {

    }

    @PostMapping("/save-shift-api")
    public void saveShiftToRepository(Shift shift) {

    }

}
