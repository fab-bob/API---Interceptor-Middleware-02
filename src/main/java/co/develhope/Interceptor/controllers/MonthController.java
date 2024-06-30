package co.develhope.Interceptor.controllers;

import co.develhope.Interceptor.entities.Month;
import co.develhope.Interceptor.services.MonthService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/months")
public class MonthController {

    @Autowired
    private MonthService monthService;

    @GetMapping
    public ResponseEntity<List<Month>> getMonth() {
        List<Month> months = monthService.read();
        return ResponseEntity.ok(months);
    }

    @PostMapping
    public ResponseEntity<Month> createMonth(@RequestBody Month month) {
        Month savedMonth = monthService.insert(month);
        return ResponseEntity.ok(savedMonth);
    }
}