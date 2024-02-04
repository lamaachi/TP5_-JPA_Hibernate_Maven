package Model;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Module {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titre;

//    @ManyToOne
//    @JoinColumn(name = "etudiant_id")
//    private Etudiant etudiant;

    @OneToMany(mappedBy = "module",cascade = CascadeType.ALL)
    private List<Etudiant> etudiants;


//    @OneToOne
//    @JoinColumn(name = "etudiant_id")
//    private Etudiant etudiant; ;


//    @ManyToOne
//    @JoinColumn(name = "etudiant_id")
//    private Etudiant etudiant;

}
