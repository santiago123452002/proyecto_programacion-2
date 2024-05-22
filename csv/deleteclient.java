import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class deleteclient {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
        System.out.println("Escriba el código que quiere eliminar:");
        String deleteid = sc.nextLine();

        File f1 = new File("./register.csv");
        ArrayList<Patient> patients = new ArrayList<>();

        try (Scanner fileScanner = new Scanner(f1)) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");
                if (parts.length >= 7) {
                    Patient patient = new Patient(parts[0], parts[1], Integer.parseInt(parts[2]), Double.parseDouble(parts[3]), Double.parseDouble(parts[4]), parts[5], Double.parseDouble(parts[6]));
                    patients.add(patient);
                } else {
                    System.out.println("La línea " + line + " no tiene suficientes elementos para crear un paciente.");
                }
                
            }
        } catch (FileNotFoundException e) {
            System.out.println("Se ha producido un error al cargar los pacientes: " + e.getMessage());
        }
     // Guardar la nueva información en el archivo CSV
        try (FileWriter fw = new FileWriter(f1, false); BufferedWriter bw = new BufferedWriter(fw)) {
            for (Patient patient : patients) {
                bw.write(patient.tocsv() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Se ha producido un error al guardar los pacientes: " + e.getMessage());
        }
        patients.removeIf(patient -> patient.getpatienid().equals(deleteid));

        // Guardar la nueva información en el archivo CSV
        try (FileWriter fw = new FileWriter(f1, false); BufferedWriter bw = new BufferedWriter(fw)) {
            for (Patient patient : patients) {
                bw.write(patient.tocsv() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Se ha producido un error al guardar los pacientes: " + e.getMessage());
        }
    }
    

}