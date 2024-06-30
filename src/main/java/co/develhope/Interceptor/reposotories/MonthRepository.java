package co.develhope.Interceptor.reposotories;

import co.develhope.Interceptor.entities.Month;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MonthRepository extends JpaRepository<Month, Integer> {
    Optional<Month> findByMonthNumber(int monthNumber);
}
