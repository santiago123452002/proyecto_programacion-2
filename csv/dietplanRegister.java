import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class dietplanRegister {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<DietPlan> al1 = listDietPlans(sc);

        File f = new File("./dietplan.csv");
        try (FileWriter fw = new FileWriter(f, true)) {
            for (DietPlan dietPlan : al1) {
                fw.write(dietPlan.tocsv() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Se ha producido un error al escribir en el archivo.");
        }
    }

    public static ArrayList<DietPlan> listDietPlans(Scanner sc) {
        ArrayList<DietPlan> al1 = new ArrayList<>();

        String planID;
        String dailyCalories;
        String macronutrientDistribution;
        String specificRecomendations;
        DietPlan p;
        String opc;

        do {
            System.out.println("¿Desea registrar otro usuario? (si/no)");
            opc = sc.nextLine();

            if (opc.equals("si")) {
                System.out.println("Código: ");
                planID = sc.nextLine();

                System.out.println("Calorías diarias: ");
                dailyCalories = sc.nextLine();
               

                System.out.println("Distribución de macronutrientes: ");
                macronutrientDistribution = sc.nextLine();

                System.out.println("Recomendaciones específicas: ");
                specificRecomendations = sc.nextLine();

                p = new DietPlan(planID, dailyCalories, macronutrientDistribution, specificRecomendations);
                al1.add(p);
            }
        } while (opc.equals("si"));

        return al1;
    }
}
