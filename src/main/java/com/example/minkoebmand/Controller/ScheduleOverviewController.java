package com.example.minkoebmand.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ScheduleOverviewController {

    // user task 2.1
    @GetMapping("/weekly-overview")
    public String requestWeeklyOverviewPage() {
        return "weekly-overview-shifts";
    }

    // user task 2.2
    @GetMapping("/daily-overview/{weekNumber}/{weekDay}")
    public String requestDailyOverviewPage(@PathVariable("weekNumber") int weekNumber, @PathVariable("weekDay") String weekDay) {
        return "daily-overview";
    }
}
