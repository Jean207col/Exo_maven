package sn.youdev;

import java.io.FileWriter;
import java.io.IOException;
public class App {
    public static void main(String[] args) {

        Etudiant e = new Etudiant("Jean", 22, "jean@gmail.com");

        try (FileWriter writer = new FileWriter("etudiants.txt", true)) {
            writer.write(e.toString() + "\n");
            System.out.println("Étudiant enregistré !");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}