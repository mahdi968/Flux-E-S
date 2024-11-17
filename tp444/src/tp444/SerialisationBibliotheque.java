package tp444;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerialisationBibliotheque {
    public static void main(String[] args) {
        List<Livre> bibliotheque = new ArrayList<>();
        bibliotheque.add(new Livre("Le Petit Prince", "Antoine de Saint-Exupéry", 1943));
        bibliotheque.add(new Livre("1984", "George Orwell", 1949));
        bibliotheque.add(new Livre("Moby Dick", "Herman Melville", 1851));

 
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("bibliotheque.ser.txt"))) {
            oos.writeObject(bibliotheque);
            System.out.println("Bibliothèque sauvegardée avec succès !");
        } catch (IOException e) {
            System.err.println("Erreur lors de la sauvegarde : " + e.getMessage());
        }

       
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("bibliotheque.ser.txt"))) {
            List<Livre> bibliothequeRestaurée = (List<Livre>) ois.readObject();
            System.out.println("Bibliothèque restaurée avec succès !");
            for (Livre livre : bibliothequeRestaurée) {
                System.out.println(livre);
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erreur lors de la restauration : " + e.getMessage());
        }
    }
}