package com.polytech.tp;

public class CoursEnLigne extends CoursDecorator {

    public CoursEnLigne(ICours cours) {
        super(cours); // Appelle le constructeur de CoursDecorator
    }

    @Override
    public String getDescription() {
        // Ajoute dynamiquement "(En ligne)" à la description existante
        return super.getDescription() + " (En ligne)";
    }

    @Override
    public double getDuree() {
        // Si la durée ne change pas, on délègue simplement à l'objet décoré
        return super.getDuree();
    }
}
