package com.polytech.tp;

public class CoursBuilder {
    
    private String matiere;
    private String enseignant;
    // hed la partie si tu charge juste les deux premier , voir App.java 
    private String salle = "Non assignée";
    private String date = "Non définie";
    private String heureDebut = "09:00";
    private boolean estOptionnel = false;
    private String niveau = "Débutant";
    private boolean necessiteProjecteur = false;
    
    
    public CoursBuilder setMatiere(String matiere) {
        this.matiere = matiere;
        return this;
    }
    public CoursBuilder setEnseignant(String enseignant) {
        this.enseignant = enseignant;
        return this;
    }
     public CoursBuilder setSalle(String salle) {
        this.salle = salle;
        return this;
    }
      public CoursBuilder setDate(String date) {
        this.date = date;
        return this;
    }
    public CoursBuilder setHeureDebut(String heureDebut) {
        this.heureDebut = heureDebut;
        return this;
    }


    public CoursBuilder setEstOptionnel(boolean estOptionnel) {
        this.estOptionnel = estOptionnel;
        return this;
    }
     public CoursBuilder setNiveau(String niveau) {
        this.niveau = niveau;
        return this;
    }
    public CoursBuilder setNecessiteProjecteur(boolean necessiteProjecteur) {
        this.necessiteProjecteur = necessiteProjecteur;
        return this;
    }
    
    
    

     
    
      public Cours build() {
        // Validation des attributs obligatoires
        if (matiere == null || matiere.trim().isEmpty()) {
            throw new IllegalStateException("La matière est obligatoire");
        }
        if (enseignant == null || enseignant.trim().isEmpty()) {
            throw new IllegalStateException("L'enseignant est obligatoire");
        }
        
        // Création de l'objet Cours
        return new Cours(this.matiere, this.enseignant, this.salle, this.date, this.heureDebut, this.estOptionnel, this.niveau, this.necessiteProjecteur);
    }
}