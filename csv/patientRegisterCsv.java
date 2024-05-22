import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class patientRegisterCsv {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Patient> al= listPatient(sc);

        File f= new File("./register.csv");
        try(FileWriter fw= new FileWriter(f, true)){
            for (Patient patient : al){
                fw.write(patient.tocsv()+ "\n");
            }

        }catch (Exception e){
            System.out.println("se ha producido un error");
        }

    }

    public static ArrayList<Patient> listPatient (Scanner sc){
        ArrayList<Patient> al= new ArrayList<Patient>();
       String patienid;
        String name;
        int age;
        Double weight;
        Double height;
        String preexistingCondition2;
        Double Imc;
        Patient p;
       String opc="si";
    
       
        do{
            
           
            if(opc.equals("si")){

                System.out.println("Codigo: ");
                patienid= sc.nextLine();
                System.out.println("Nombre completo ");
                name= sc.nextLine();

                System.out.println("Edad");
                age=sc.nextInt();

                System.out.println("Peso");
                weight= sc.nextDouble();

                System.out.println("Altura");
                height= sc.nextDouble();

                System.out.println("condicion");
                sc.nextLine();
                preexistingCondition2=sc.nextLine();

                 Imc= (weight/(height*height));

                if (Imc < 18.5) {
                    System.out.println("Su imc es: "+Imc+" Es clasificado en bajo peso y su codigo de planID es 1 ");
                }else if(Imc >=18.5 && Imc<=24.9){
                    System.out.println("Su imc es: "+Imc+" Es clasificado en Normal y su codigo de planID es 2");
                }else if(Imc >25 && Imc<=29.9){
                    System.out.println("Su imc es: "+Imc+" Es clasificado en Sobre peso y su codigo de planID es 3");
                }else if(Imc >= 30 ){
                    System.out.println("Su imc es: "+Imc+" Es clasificado en Obeso y su codigo de planID es 4");
                }




                p = new Patient(patienid, name, age, weight, height, preexistingCondition2, Imc);
                al.add(p);
               
                

                
            
            
            
            
           try {
        
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader reader = new BufferedReader(new FileReader("registerNutritionist.csv"));
            System.out.println("Buscando en archivo CSV...");
            System.out.println("Cual es el planId que se le asigno");
            String planID = in.readLine();
            boolean found = false;
            String line;        
           
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                for (String part : parts) {
                    if (planID.equals(part)) {
                        if (planID.equals(part)) {      
                               
                        System.out.println("Codigo encontrado "+part);
                        System.out.println("La informacion de su nutricionista asignado es:");
                        System.out.println("Datos del nutricionista:");
                        System.out.println("Código: " + parts[0]);
                        System.out.println("nombre: " + parts[1]);
                        System.out.println("especialidad: " + parts[2]);
                        }
                      
                    }
                

    found = true;
    break;
      } 
         }
               


               if (!found) {

System.out.println("No se encontró el nombre.");
}
} catch (IOException e) {
e.printStackTrace();
}
}
System.out.println("Desea registrar otro usuario");
opc= sc.nextLine();

        }while (opc.equals("si") );
        return al;
    
    

    }
}
       
           
        
    