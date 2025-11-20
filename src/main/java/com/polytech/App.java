package com.polytech;
import com.polytech.tp.Cours;
import com.polytech.tp.CoursBuilder;

/**
 * Hello world!
 *
 */
public class App {
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
}
        
