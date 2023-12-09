import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile {
    public static void main(String[] args) {
        // Crearea unui obiect Scanner pentru citirea de la tastatură
        Scanner scanner = new Scanner(System.in);

        // Deschiderea unui fișier pentru scriere
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            System.out.println("Introduceti textul (introduceti 'exit' pentru a opri):");

            // Citirea de la tastatură și scrierea în fișier până când se introduce "exit"
            String line;
            while (!(line = scanner.nextLine()).equalsIgnoreCase("exit")) {
                writer.write(line);
                writer.newLine(); // Adaugă un separator de linie între fiecare linie
            }

            System.out.println("Textul a fost scris in fisier cu succes.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Închideți scanner-ul
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
