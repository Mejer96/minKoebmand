package com.example.minkoebmand.Service;

import com.example.minkoebmand.Model.Shift;
import com.example.minkoebmand.Repository.ShiftRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.*;

@Getter
@Setter
@Service
// user task 1.1 and 2.3
public class ShiftService implements IShiftService {
    private ShiftRepository shiftRepository;

    public ShiftService(ShiftRepository shiftRepository) {
        this.shiftRepository = shiftRepository;
    }

    @Override
    public Set<Shift> findAll() {
        Set<Shift> set = new HashSet<>();
        shiftRepository.findAll().forEach(set::add);
        return set;
    }

    // user task 1.1
    @Override
    public Shift save(Shift object) {
        return shiftRepository.save(object);
    }

    // user task 1.1
    @Override
    public void delete(Shift object) {
        shiftRepository.delete(object);
    }

    // user task 1.1
    @Override
    public void deleteByID(Long aLong) {
        shiftRepository.deleteById(aLong);
    }

    // user task 1.1
    @Override
    public Optional<Shift> findById(Long aLong) {
        return shiftRepository.findById(aLong);
    }

    // user task 2.3
    public Set<Shift> findShiftsByWeekNumber(int weekNumber) {
        Set<Shift> set = new HashSet<>();
        shiftRepository.findShiftsByWeekNumber(weekNumber).forEach(set::add);
        return set;
    }

    public Set<Shift> findShiftsByDate(Date date) {
        return shiftRepository.findShiftsByDate(date);
    }

    // user task 2.3
    public int getDayFromDateObject(Date date) {
        Calendar calender = Calendar.getInstance();
        calender.setTime(date);
        return calender.get(Calendar.DAY_OF_WEEK);
    }

    // user task 2.4
    public String defineWeekdayByNumber(int weekday) {
        String weekDayString = null;

        switch (weekday) {
            case 1:
                weekDayString = "Sunday";
                break;
            case 2:
                weekDayString ="Monday";
                break;
            case 3:
                weekDayString ="Tuesday";
                break;
            case 4:
                weekDayString = "Wednesday";
                break;
            case 5:
                weekDayString = "Thursday";
                break;
            case 6:
                weekDayString = "Friday";
                break;
            case 7:
                weekDayString = "Saturday";
                break;
        }
        return weekDayString;
    }

}
