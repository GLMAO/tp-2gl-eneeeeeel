package com.polytech;
import com.polytech.tp.Cours;
import com.polytech.tp.CoursBuilder;
import com.polytech.tp.Etudiant;
import com.polytech.tp.GestionnaireEmploiDuTemps;
import com.polytech.tp.ICours;
import com.polytech.tp.Responsable;
import com.polytech.tp.Observer;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        // Création du gestionnaire (Subject)
        GestionnaireEmploiDuTemps g = new GestionnaireEmploiDuTemps();

        // Création des observateurs
        Observer e1 = new Etudiant("Ali");
        Observer r1 = new Responsable("Dr. Karim");

        // On attache les observateurs
        g.attach(e1);
        g.attach(r1);

        // Création d’un cours
        ICours java = new CoursBuilder()
                .setMatiere("Mathématiques")
                .setEnseignant("beddar youcef")
                .build();
        // Ajout du cours -> doivent recevoir une notification
        g.ajouterCours(java);

        // Modification du cours -> tous les observateurs doivent être notifiés
        g.modifierCours(java, "Déplacé à 15h00");

        // Notification manuelle
        g.setChangement("⚠️  Rappel : pas de cours demain !");
    }












    /*     partie builder 
    public static void main(String[] args) {
        System.out.println("=== Démonstration du Pattern Builder ===\n");
        
        
        System.out.println("--- Exemple 1 ");
        Cours cours1 = new CoursBuilder()
                .setMatiere("Mathématiques")
                .setEnseignant("beddar youcef")
                .build();
        
        
        cours1.toString();
        
        
        System.out.println("\n--- Exemple 2 : Cours complet ---");
        Cours cours2 = new CoursBuilder()
                .setMatiere("Programmation Java")
                .setEnseignant("Prof.mahani")
                .setSalle("A204")
                .setDate("15/01/2025")
                .setHeureDebut("14:30")
                .setEstOptionnel(false)
                .setNiveau("Intermédiaire")
                .setNecessiteProjecteur(true)
                .build();
        
        cours2.toString();
    }
        */
       
    
    
    
   

}
        
