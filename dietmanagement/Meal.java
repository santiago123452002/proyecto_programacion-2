public class Meal {

    private String name;
    private String macronutrients;
    private int calories;
    private int timeOfDay;

    public String getname(){
        return name;
    }
    public String getmacronutrients(){
        return macronutrients;
    }
    public int getcalories(){
        return calories;
    }
    public int gettimeOfDay(){
        return timeOfDay;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setMacronutrients(String macronutrients) {
        this.macronutrients = macronutrients;
    }
    public void setCalories(int calories) {
        this.calories = calories;
    }
    public void setTimeOfDay(int timeOfDay) {
        this.timeOfDay = timeOfDay;
    }

    
}
