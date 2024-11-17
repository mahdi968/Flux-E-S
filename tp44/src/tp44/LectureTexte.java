package tp44;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LectureTexte {
    public static void main(String[] args) {
        String inputFilePath = "livres.txt"; 
        String outputFilePath = "sortie.txt";

       
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {

            String line;
            
            while ((line = reader.readLine()) != null) {
               
                System.out.println(line);
            
                writer.write(line);
                writer.newLine(); 
            }

        } catch (IOException e) {
            System.err.println("Une erreur est survenue lors de la lecture ou de l'écriture du fichier : " + e.getMessage());
        }
    }
}
