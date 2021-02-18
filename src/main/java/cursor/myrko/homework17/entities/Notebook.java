package cursor.myrko.homework17.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;
import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "notebooks")
@Accessors(chain = true)
public class Notebook {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name = "notebook_id")
private Integer id;

private String model;

String manufacturer;

private String pocessor;

@Column(name = "memory_capacity")
private Integer memory;

private boolean isUsed;

@Column(name = "case_type")
private String caseType;

private Integer price;

@Column(name = "manufacture_date")
private LocalDate localDate;
}
