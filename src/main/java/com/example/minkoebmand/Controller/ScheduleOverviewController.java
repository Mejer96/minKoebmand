package com.example.minkoebmand.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ScheduleOverviewController {

    @GetMapping("/weekly-overview")
    public String requestWeeklyOverviewPage() {
        return "weekly-overview";
    }

    @GetMapping("/daily-overview")
    public String requestDailyOverviewPage() {
        return "daily-overview";
    }
}
