import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class deleteNutricionist {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el código que quiere eliminar:");
        String deleteid = sc.nextLine();

        File f1 = new File("./registerNutritionist.csv");
        ArrayList<Dietitian> dietitians = new ArrayList<>();
        try (Scanner fileScanner = new Scanner(f1)) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length >= 3) {
                    Dietitian dietitian = new Dietitian(parts[0], parts[1], parts[2]);
                    dietitians.add(dietitian);
                } else {
                    System.out.println("La línea " + line + " no tiene suficientes elementos para crear un paciente.");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Se ha producido un error al cargar los pacientes: " + e.getMessage());
        }
     // Guardar la nueva información en el archivo CSV
        try (FileWriter fw = new FileWriter(f1, false); BufferedWriter bw = new BufferedWriter(fw)) {
            for (Dietitian dietitian: dietitians) {
                bw.write(dietitian.tocsv() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Se ha producido un error al guardar los pacientes: " + e.getMessage());
        }
        dietitians.removeIf(dietitian -> dietitian.getdietitianId().equals(deleteid));

        // Guardar la nueva información en el archivo CSV
        try (FileWriter fw = new FileWriter(f1, false); BufferedWriter bw = new BufferedWriter(fw)) {
            for (Dietitian dietitian : dietitians) {
                bw.write(dietitian.tocsv() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Se ha producido un error al guardar los pacientes: " + e.getMessage());
        }
    }
    

}
    

