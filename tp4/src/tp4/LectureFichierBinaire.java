package tp4;

import java.io.FileInputStream;
import java.io.IOException;

public class LectureFichierBinaire {
    public static void main(String[] args) {
        String cheminFichier = "fichier.bin.txt"; 

        try (FileInputStream fis = new FileInputStream(cheminFichier)) {
            int octet;
            while ((octet = fis.read()) != -1) {
                System.out.print(octet + " ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
