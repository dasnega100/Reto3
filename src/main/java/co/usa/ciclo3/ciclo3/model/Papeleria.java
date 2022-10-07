package co.usa.ciclo3.ciclo3.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="papeleria")
public class Papeleria implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private Integer price;
    private String description;


}
