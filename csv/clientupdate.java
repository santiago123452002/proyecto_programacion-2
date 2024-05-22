

import java.io.*;
import java.util.*;



public class clientupdate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el código que quiere buscar:");
        String updateid = sc.nextLine();

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

        // Actualizar la información del paciente
        for (Patient patient : patients) {
            if (patient.getpatienid().equals(updateid)) {
                System.out.println("Paciente encontrado: " + patient.getname());
                System.out.println("Ingrese la nueva información del paciente:");

                System.out.println("Nombre completo: ");
                patient.setName(sc.nextLine());

                System.out.println("Edad: ");
                patient.setAge(sc.nextInt());

                System.out.println("Peso: ");
                patient.setWeight(sc.nextDouble());

                System.out.println("Altura: ");
                patient.setHeight(sc.nextDouble());

                System.out.println("Condición preexistente: ");
                sc.nextLine();
                patient.setPreexistingCondition2(sc.nextLine());

              }

                break;
            }
        }

    }

    
