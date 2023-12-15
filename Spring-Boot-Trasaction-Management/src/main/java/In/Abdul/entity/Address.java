package In.Abdul.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "Address_Transaction")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Address {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    @OneToOne
    private Employee employee_id;
}
