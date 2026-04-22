package sn.youdev;

import java.io.Serializable;

public class Etudiant implements Serializable {
    private String nom;
    private int age;
    private String email;

    public Etudiant(String nom, int age, String email) {
        this.nom = nom;
        this.age = age;
        this.email = email;
    }

    @Override
    public String toString() {
        return nom + "," + age + "," + email;
    }
}