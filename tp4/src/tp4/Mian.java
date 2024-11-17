package tp4;
		
		import java.io.FileInputStream;
		import java.io.FileOutputStream;
		import java.io.IOException;
		public class Mian {

		    public static void main(String[] args) {
		        String source = "fichier.bin.txt"; 
		        String destination = "copie_fichier.binaire"; 

		        try (FileInputStream fis = new FileInputStream(source);
		             FileOutputStream fos = new FileOutputStream(destination)) {
		            int octet;
		            while ((octet = fis.read()) != -1) {
		                fos.write(octet);
		            }
		            System.out.println("Fichier copié avec succès.");
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		    }
		}


