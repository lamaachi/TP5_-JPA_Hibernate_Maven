package OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EtudiantB {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom,prenom;


    @OneToMany(mappedBy = "etudiant", cascade = CascadeType.ALL)
    private List<ModuleB> modules;

}
