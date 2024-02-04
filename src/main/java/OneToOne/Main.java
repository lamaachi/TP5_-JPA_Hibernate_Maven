package OneToOne;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa-tutorial");
        EntityManager entityManager = emf.createEntityManager();
        // Début de la transaction
        entityManager.getTransaction().begin();


        // Création d'un étudiant
        EtudiantA etudiant = new EtudiantA();
        etudiant.setNom("Ali");
        etudiant.setPrenom("Mohamed");


        // Création d’un module
        ModuleA module1 = new ModuleA();
        module1.setTitre("Math");
        module1.setEtudiant(etudiant);

        // Association du module à l’étudiant
        etudiant.setModule(module1);


        entityManager.persist(etudiant);
        // Commit the transaction
        entityManager.getTransaction().commit();

        entityManager.close();
        emf.close();
    }
}
