package ManyToMany;

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
        EtudiantD etudiant1 = new EtudiantD();
        etudiant1.setNom("Jamal");
        etudiant1.setPrenom("Hassani");
        EtudiantD etudiant2 = new EtudiantD();
        etudiant2.setNom("Malak");
        etudiant2.setPrenom("Skalii");


        // Association des étudiants au module
        ModuleD module = new ModuleD();
        module.setTitre("Proba ET Statistics");
        ModuleD module1 = new ModuleD();
        module1.setTitre("Java Poo");

        // Associate modules with students
        List<ModuleD> modules = new ArrayList<>();
        modules.add(module);
        modules.add(module1);
        etudiant1.setModules(modules);
        etudiant2.setModules(modules);

        // Associate students with modules
        List<EtudiantD> etudiants = new ArrayList<>();
        etudiants.add(etudiant1);
        etudiants.add(etudiant2);
        module.setEtudiants(etudiants);


        // Persist entities
        entityManager.persist(module);
        entityManager.persist(module1);
        entityManager.persist(etudiant1);
        entityManager.persist(etudiant2);

        // Commit the transaction
        entityManager.getTransaction().commit();

        entityManager.close();
        emf.close();

    }
}




