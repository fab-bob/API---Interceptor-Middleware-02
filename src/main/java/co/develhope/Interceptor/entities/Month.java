package co.develhope.Interceptor.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "months")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Month {
    @Id
    @GeneratedValue
    private int monthNumber;
    private String englishName;
    private String italianName;
    private String germanName;
}