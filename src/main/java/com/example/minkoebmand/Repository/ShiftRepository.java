package com.example.minkoebmand.Repository;

import com.example.minkoebmand.Model.Shift;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.Set;
// user task 1.3
public interface ShiftRepository extends CrudRepository<Shift, Long> {

    // user task 2.3
    Set<Shift> findShiftsByWeekNumber(int weekNumber);

    // user task 2.3
    Set<Shift> findShiftsByDate(Date date);

}
