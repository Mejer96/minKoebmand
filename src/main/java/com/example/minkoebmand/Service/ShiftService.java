package com.example.minkoebmand.Service;

import com.example.minkoebmand.Model.Shift;
import com.example.minkoebmand.Repository.ShiftRepository;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Getter
@Setter
@Service
public class ShiftService implements IShiftService {
    private ShiftRepository shiftRepository;

    public ShiftService(ShiftRepository shiftRepository) {
        this.shiftRepository = shiftRepository;
    }

    @Override
    public ArrayList<Shift> findAll() {
        return null;
    }

    @Override
    public Shift save(Shift object) {
        return null;
    }

    @Override
    public void delete(Shift object) {

    }

    @Override
    public void deleteByID(Long aLong) {

    }

    @Override
    public Optional<Shift> findById() {
        return Optional.empty();
    }
}
