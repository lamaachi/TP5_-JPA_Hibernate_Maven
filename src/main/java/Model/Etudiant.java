package Model;


import lombok.*;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom,prenom;




    @ManyToOne
    @JoinColumn(name = "module_id")
    private Module module;


    // Pour jointure bidirectionnelle
//    @OneToOne(mappedBy = "etudiant", cascade = CascadeType.ALL)
//    private Module module;


    //One-To-Many
//    @OneToMany(mappedBy = "etudiant", cascade = CascadeType.ALL)
//    private List<Module> modules;



//    @OneToOne
//    @JoinColumn(name = "address_id")
//    private Module module;
}
