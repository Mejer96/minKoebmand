package com.example.minkoebmand.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

// user tasks 2.1, 2.2
@Controller
public class ScheduleOverviewController {

    // user task 2.1
    @CrossOrigin
    @GetMapping("/weekly-overview")
    public String requestWeeklyOverviewPage() {
        return "weekly-overview-shifts";
    }

    // user task 2.2
    @CrossOrigin
    @GetMapping("/daily-overview/{weekNumber}/{weekDay}")
    public String requestDailyOverviewPage(@PathVariable("weekNumber") int weekNumber, @PathVariable("weekDay") String weekDay) {
        return "daily-overview";
    }
}
