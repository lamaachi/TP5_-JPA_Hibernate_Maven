import Model.Etudiant;
import Model.Module;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-tutorial");
//        EntityManager entityManager = emf.createEntityManager();
//        // Début de la transaction
//        entityManager.getTransaction().begin();
//        // Création d'un étudiant
//        Etudiant etudiant = new Etudiant();
//        etudiant.setNom("Ali");
//        etudiant.setPrenom("Mohamed");
//
//        // Création des modules
//        Module module1 = new Module();
//        module1.setTitre("Math");
//        module1.setEtudiantList(etudiant);
//        Module module2 = new Module();
//        module1.setTitle("Info");
//        Module2.setEtudiant(etudiant);
//        // Association des modules à l’étudiant
//        List<Module> modules = new ArrayList<>();
//        modules.add(module1);
//        modules.add(module2);
//        etudiant.setModules(modules);


//        Module module1 = new Module();
//        module1.setTitre("Math");
//        module1.setEtudiant(etudiant);
//        Module module2 = new Module();
//        module2.setTitre("Info");
//        module2.setEtudiant(etudiant);
//        //Association des modules à l’étudiant
//          List<Module> modules = new ArrayList<>();
//        modules.add(module1);
//        modules.add(module2);
//        etudiant.setModules(modules);

        //many-to-One
//        Module module1 = new Module();
//        module1.setTitre("Math");
//
//        Etudiant etudiant1 = new Etudiant();
//        etudiant1.setNom("AAAa");
//        etudiant1.setPrenom("AAAb");
//        etudiant1.setModule(module1);
//        Etudiant etudiant2 = new Etudiant();
//        etudiant2.setNom("BBBa");
//        etudiant2.setPrenom("BBBb");
//        etudiant2.setModule(module1);
//
//        // Association des étudiants au module
//        List<Etudiant> etudiants = new ArrayList<>();
//        etudiants.add(etudiant1);
//        etudiants.add(etudiant2);
//        module1.setEtudiants(etudiants);
//        entityManager.persist(module1);
//        // Enregistrement de l'étudiant
//        entityManager.persist(etudiant1);
//        entityManager.persist(etudiant2);
//        entityManager.getTransaction().commit();
//        // Fermeture des ressources
//        entityManager.close();
//        emf.close();
    }
}
