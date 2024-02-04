package ManyToOne;

import OneToMany.ModuleB;

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




        // Création des modules
        ModuleC module1 = new ModuleC();
        module1.setTitre("Math");

        // Création des étudiants
        EtudiantC etudiant1 = new EtudiantC();
        etudiant1.setNom("Jamall");
        etudiant1.setPrenom("Med");
        etudiant1.setModule(module1);
        EtudiantC etudiant2 = new EtudiantC();
        etudiant2.setNom("Moaad");
        etudiant2.setPrenom("Moaad");
        etudiant2.setModule(module1);

        // Association des étudiants au module
        List<EtudiantC> etudiants = new ArrayList<>();
        etudiants.add(etudiant1);
        etudiants.add(etudiant2);
        module1.setEtudiants(etudiants);


        // Enregistrement de module(et automatiquement des étudiants en cascade)
        entityManager.persist(module1);

        // Commit the transaction
        entityManager.getTransaction().commit();
        entityManager.close();
        emf.close();
    }
}
