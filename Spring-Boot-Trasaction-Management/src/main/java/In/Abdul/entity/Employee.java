package In.Abdul.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "Transaction_Employee")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {
    @Id
    @GeneratedValue
    private Integer id;

    private String name;
}
