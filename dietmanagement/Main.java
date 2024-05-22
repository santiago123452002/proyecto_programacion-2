public class Main{

    public static void main(String [] args){
        int option=0;
        Patient patient = new Patient(null, null, option, null, null, null, null);
       
        do{
            Console.writeLine("... MENU PRINCIPAL...");
            Console.writeLine("------------------------");
            Console.writeLine(" 1.Gestion de pacientes  ");
            Console.writeLine("2.Gestion de nutricionistas ");
            Console.writeLine("3.Plan de alimentacion");
            Console.writeLine("4.Registro de comidas");
            Console.writeLine("5.Persistencia de datos ");
            Console.writeLine("6.Interfaz de usuario ");
            Console.writeLine("7. Salir");
            Console.writeLine("------------------------");
            Console.writeLine("Ingrese una opción y presione [ENTER]");
            option = Integer.parseInt(Console.readLine());

            switch (option) {
                case 1: 

                int opciones=0;  
                
                Console.writeLine("Elija cual de las opciones necesita ");
                Console.writeLine("1.Registrar usuario");
                Console.writeLine("2.Actualizar informacion del usuario"); 
                Console.writeLine("3.Eliminar informacion del usuario");
                Console.writeLine("4.Lista pacientes");
                Console.writeLine("5.Devolver al menu inicial");
                opciones = Integer.parseInt(Console.readLine());
                

                if (opciones==1) {
                    Console.writeLine("va agregar un usuario");
                    patientRegisterCsv.main(args);
                    
                }
                else if(opciones==2){

                  clientupdate.main(args);
                }
  
                else if (opciones==3){
                  deleteclient.main(args);
                } 
                else if(opciones==4){
                  
                }               
                  break;

                  case 2: 

                  Console.writeLine("Elija cual de las opciones necesita ");
                  Console.writeLine("1.Registrar nutricionista");
                  Console.writeLine("2.Actualizar informacion del nutricionista"); 
                  Console.writeLine("3.Eliminar informacion del nutricionista");
                  Console.writeLine("4.Devolver al menu inicial");
                  opciones = Integer.parseInt(Console.readLine());

                  if (opciones==1) {
                    Console.writeLine("va agregar un usuario");
                    registerNutritionistCsv.main(args);
                    
                }
                else if(opciones==2){

                  nutritionistUpdate.main(args);
                }
  
                else if (opciones==3){

                  nutritionistUpdate.main(args);
                }    


                  break;

                  case 3:

                  int opc;
                  Console.writeLine("Elija cual de las opciones necesita ");
                  Console.writeLine("1.Crear plan de alimentacion");
                  Console.writeLine("2.Ajustar plan de alimentacion"); 
                  Console.writeLine("3.Consultar parametros de dieta de un paciente");
                  Console.writeLine("4.Devolver al menu inicial");
                   opc=Integer.parseInt(Console.readLine());

                  if (opc== 1) {
                    dietplanRegister.main(args);                  
                  }else if(opc == 2){
                    dietplanUpdate.main(args);
                  }else if(opc == 3){
                    mealplan.main(args);
                  }
                  
                  

                  
                  break;

                  
                
           
              }
            }while(option !=7);
          
      }
    }
