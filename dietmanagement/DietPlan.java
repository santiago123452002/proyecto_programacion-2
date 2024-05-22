 public class DietPlan {
    private String planId;
    private String dailyCalories;
    private String macronutrientDistribution;
    private String specificRecomendations;

    public DietPlan(String planId, String dailyCalories, String macronutrientDistribution, String specificRecomendations){
       
        this.planId= planId;
        this.dailyCalories=dailyCalories;
        this.macronutrientDistribution= macronutrientDistribution;
        this.specificRecomendations=specificRecomendations;
         
     }
     public String tocsv() {
     return this.planId+","+this.dailyCalories+","+this.macronutrientDistribution+","+specificRecomendations;
     }
    public String getplanId(){
        return planId;
    }
    public String dailyCalories(){
        return dailyCalories;
    }
    public String getmacronutrientDistribution(){
        return macronutrientDistribution;
    }
    public String getspecificRecomendations(){
        return specificRecomendations;
    }
    public void setPlanId(String planId) {
        this.planId = planId;
    }
    public void setDailyCalories(String dailyCalories) {
        this.dailyCalories = dailyCalories;
    }
    public void setMacronutrientDistribution(String macronutrientDistribution) {
        this.macronutrientDistribution = macronutrientDistribution;
    }
    public void setSpecificRecomendations(String specificRecomendations) {
        this.specificRecomendations = specificRecomendations;
    }
  
    
}
