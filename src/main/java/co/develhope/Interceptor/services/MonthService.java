package co.develhope.Interceptor.services;

import co.develhope.Interceptor.entities.Month;
import co.develhope.Interceptor.reposotories.MonthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonthService {
    @Autowired
    private MonthRepository monthRepository;

    public List<Month> read() {
        return monthRepository.findAll();
    }

    public Month insert(Month month) {
        return monthRepository.save(month);
    }
}