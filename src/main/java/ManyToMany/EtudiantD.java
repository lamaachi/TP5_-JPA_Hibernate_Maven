package ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EtudiantD {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom,prenom;

    @ManyToMany
    @JoinTable(name="etudiant_module",joinColumns = @JoinColumn(name="etudiant_id"),inverseJoinColumns = @JoinColumn(name="module_id"))
    private List<ModuleD> modules ;


}
