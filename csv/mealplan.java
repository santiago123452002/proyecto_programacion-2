import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class mealplan {
    public static void main(String[] args) {
       try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader reader = new BufferedReader(new FileReader("register.csv"));
            System.out.println("Buscando en archivo CSV...");
            System.out.println("Ingrese un nombre: ");
            String patientName = in.readLine();
            boolean found = false;
            String line;
            int opc;
            int opc1;
            double dailyCalories=0;
            String macronutrientDistribution;
            String specificRecomendations;
            double proteins;
            double carbohydrates;
            double fats;
            double calories;

            

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                for (String part : parts) {
                    if (patientName.equals(part)) {
                        System.out.println("Nombre encontrado: " + part);
                        System.out.println("Datos del paciente:");
                        System.out.println("Código: " + parts[0]);
                        System.out.println("Nombre: " + parts[1]);
                        System.out.println("Edad: " + parts[2]);
                        System.out.println("Peso: " + parts[3]);
                        System.out.println("Altura: " + parts[4]);
                        System.out.println("Condición: " + parts[5]);
                        System.out.println("IMC: " + parts[6]);

                        System.out.println("Diga cuál es su factor de actividad:");
                        System.out.println("1. Persona sedentaria");
                        System.out.println("2. Ejercicio de 1 a 3 veces por semana");
                        System.out.println("3. Ejercicio de 3 a 5 veces por semana");
                        System.out.println("4. Ejercicio de 6 a 7 veces por semana");
                        System.out.println("5. Atletas profesionales");
                        opc = Integer.parseInt(in.readLine());

                        System.out.println("Marque 1 si es Hombre" );
                        System.out.println("Marque 2 si es Mujer");
                        opc1 = Integer.parseInt(in.readLine());

                       
        


                        if (opc == 1 && opc1==2) {
                            dailyCalories = (65 + (9.6 * Double.parseDouble(parts[3]))) + ((1.8 * Double.parseDouble(parts[4])) - (4.7 * Double.parseDouble(parts[2]))) * 1.2;
                            System.out.println("Resultado de su dailyCalories " + dailyCalories);

                        }else if(opc == 1 && opc1==1){
                            dailyCalories=(66 + (13.7 * Double.parseDouble(parts[3])) + (5 * Double.parseDouble(parts[4])) - (6.8 * Double.parseDouble(parts[2])))*1.2;
                            System.out.println("Resultado de su dailyCalories: "+ dailyCalories);

                          
                        }
                        if (opc == 2 && opc1 == 1) {
                            dailyCalories=(66 + (13.7 * Double.parseDouble(parts[3])) + (5 * Double.parseDouble(parts[4])) - (6.8 * Double.parseDouble(parts[2])))*1.375;
                            System.out.println("Resultado de su dailyCalories " + dailyCalories);

                          
                        }else if(opc == 2 && opc1==2){
                            dailyCalories = (65 + (9.6 * Double.parseDouble(parts[3]))) + ((1.8 * Double.parseDouble(parts[4])) - (4.7 * Double.parseDouble(parts[2]))) * 1.375;
                            System.out.println("Resultado de su dailyCalories " + dailyCalories);

                          
                        }
                        if (opc==3 && opc1==1) {
                            dailyCalories=(66 + (13.7 * Double.parseDouble(parts[3])) + (5 * Double.parseDouble(parts[4])) - (6.8 * Double.parseDouble(parts[2])))*1.55;
                            System.out.println("Resultado de su dailyCalories " + dailyCalories);

                          

                        }else if(opc==3 && opc1==2){

                            dailyCalories = (65 + (9.6 * Double.parseDouble(parts[3]))) + ((1.8 * Double.parseDouble(parts[4])) - (4.7 * Double.parseDouble(parts[2]))) * 1.55;
                            System.out.println("Resultado de su dailyCalories " + dailyCalories);

                          

                        }
                        if (opc==4 && opc1==1) {
                            dailyCalories=(66 + (13.7 * Double.parseDouble(parts[3])) + (5 * Double.parseDouble(parts[4])) - (6.8 * Double.parseDouble(parts[2])))*1.725;
                            System.out.println("Resultado de su dailyCalories " + dailyCalories);

                          

                        }else if(opc==4 && opc1==2){

                            dailyCalories = (65 + (9.6 * Double.parseDouble(parts[3]))) + ((1.8 * Double.parseDouble(parts[4])) - (4.7 * Double.parseDouble(parts[2]))) * 1.725;
                            System.out.println("Resultado de su dailyCalories " + dailyCalories);

                          

                        }
                        if (opc==5 && opc1==1) {
                            dailyCalories=(66 + (13.7 * Double.parseDouble(parts[3])) + (5 * Double.parseDouble(parts[4])) - (6.8 * Double.parseDouble(parts[2])))*1.9;
                            System.out.println("Resultado de su dailyCalories " + dailyCalories);

                          

                        }else if(opc==5 && opc==2){

                            dailyCalories = (65 + (9.6 * Double.parseDouble(parts[3]))) + ((1.8 * Double.parseDouble(parts[4])) - (4.7 * Double.parseDouble(parts[2]))) * 1.9;
                            System.out.println("Resultado de su dailyCalories " + dailyCalories);


                        }
                        if (parts[6].length() < 18.5) {
                            carbohydrates= dailyCalories *0.55;
                            System.out.println("Sus carbohidratos equivalen al 55% de su ingesta calorica que corresponde a: "+ carbohydrates);
                            proteins= dailyCalories*0.25;
                            System.out.println("Sus proteinas equivalen al 25% de su ingesta calorica que corresponde a: "+proteins);
                            fats= dailyCalories*0.20;
                            System.out.println("Sus grasas equivalen al 20% de su ingesta calorica que corresponde a: "+fats);   
                            System.out.println("Recomendaciones: ");
                            System.out.println("1.Se recomienda realizar al menos 150 minutos de actividad física moderada a la semana.");  
                            System.out.println("2.Se recomienda realizar al menos 150 minutos de actividad física moderada a la semana."); 
                            System.out.println("3.La actividad moderada incluye caminar, nadar, andar en bicicleta a un ritmo constante, etc.");

                       }else if(parts[6].length() >=18.5 && parts[6].length()<=24.9){
                       carbohydrates= dailyCalories *0.50;
                            System.out.println("Sus carbohidratos equivalen al 55% de su ingesta calorica que corresponde a: "+ carbohydrates);
                            proteins= dailyCalories*0.25;
                            System.out.println("Sus proteinas equivalen al 25% de su ingesta calorica que corresponde a: "+proteins);
                            fats= dailyCalories*0.25;
                            System.out.println("Sus grasas equivalen al 20% de su ingesta calorica que corresponde a: "+fats); 
                            System.out.println("Recomendaciones:");
                            System.out.println("1.se recomienda aumentar la actividad física.");
                            System.out.println("2.Pueden realizar 150-300 minutos de actividad moderada a la semana");
                            System.out.println("3.Pueden hacer 75-150 minutos de actividad vigorosa (como correr o hacer ejercicio intenso) a la semana.");
        
                         }else if(parts[6].length() >25 && parts[6].length()<=29.9){
                             carbohydrates= dailyCalories *0.40;
                             System.out.println("Sus carbohidratos equivalen al 55% de su ingesta calorica que corresponde a: "+ carbohydrates);
                             proteins= dailyCalories*0.30;
                             System.out.println("Sus proteinas equivalen al 25% de su ingesta calorica que corresponde a: "+proteins);
                             fats= dailyCalories*0.30;
                             System.out.println("Sus grasas equivalen al 20% de su ingesta calorica que corresponde a: "+fats); 
                             System.out.println("Recomendaciones:");
                             System.out.println("Se recomienda realizar al menos 150 minutos de actividad moderada o 75 minutos de actividad vigorosa a la semana.");
                            }else if(parts[6].length() >= 30 ){
                          carbohydrates= dailyCalories *0.25;
                            System.out.println("Sus carbohidratos equivalen al 55% de su ingesta calorica que corresponde a: "+ carbohydrates);
                            proteins= dailyCalories*0.40;
                            System.out.println("Sus proteinas equivalen al 25% de su ingesta calorica que corresponde a: "+proteins);
                            fats= dailyCalories*0.35;
                            System.out.println("Sus grasas equivalen al 20% de su ingesta calorica que corresponde a: "+fats); 
                            System.out.println("Recomendaciones:");
                            System.out.println("1.Estar siempre hidratados a base de agua, zumos de frutas y algunas otras bebidas como puede ser el té o el café.\n" + //
                                                                "2.Comer a diario productos ricos en hidratos de carbono, frutas y verduras.\n" + //
                                                                "3.Evitar a diario productos lácteos, como la leche entera, yogures, queso o derivados.\n" + //
                                                                "4.Incluir en su dieta pescado, huevos y carnes blancas. ");
                }
                       

                        found = true;
                        break;
                        
                }
                        
                        
                    }

                   
                
                
                    
            }
                

            if (!found) {
                System.out.println("No se encontró el nombre.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        
 
       

    }

    
    }
    

            
       
           
        
    



    