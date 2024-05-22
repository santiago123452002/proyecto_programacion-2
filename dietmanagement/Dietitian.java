public class Dietitian {
    
    private String dietitianId;
    private String name;
    private String specialty;

    public Dietitian(String dietitianId, String name, String specialty){
       
        this.dietitianId= dietitianId;
        this.name=name;
        this.specialty= specialty;
         
     }
     public String tocsv(){
         return this.dietitianId+","+this.name+","+this.specialty;
     }
    public String getdietitianId(){
        return dietitianId;
    }
    public String getname(){
        return name;
    }
    public String getspecialty(){
        return specialty;
    }
    public void setDietitianId(String dietitianId) {
        this.dietitianId = dietitianId;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }
}
    
