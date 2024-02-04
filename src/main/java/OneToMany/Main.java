package OneToMany;

import ManyToMany.EtudiantD;
import ManyToMany.ModuleD;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-tutorial");
        EntityManager entityManager = emf.createEntityManager();
        // Début de la transaction
        entityManager.getTransaction().begin();

        // Create EtudiantD instances
        EtudiantB etudiant1 = new EtudiantB();
        etudiant1.setNom("Houssam");
        etudiant1.setPrenom("Jamali");


        // Création des modules
        ModuleB module1 = new ModuleB();
        module1.setTitre("Math");
        module1.setEtudiant(etudiant1);

        ModuleB module2 = new ModuleB();
        module2.setTitre("Info");
        module2.setEtudiant(etudiant1);
        // Association des modules à l’étudiant
        List<ModuleB> modules = new ArrayList<>();
        modules.add(module1);
        modules.add(module2);
        etudiant1.setModules(modules);



        // Persist entities
        entityManager.persist(etudiant1);



        // Commit the transaction
        entityManager.getTransaction().commit();

        entityManager.close();
        emf.close();
    }
}
