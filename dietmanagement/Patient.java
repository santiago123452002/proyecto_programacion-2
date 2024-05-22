import java.util.ArrayList;

public class Patient{
    private String patienid;
    private String name;
    private int age;
    private Double weight;
    private Double height;
    private String preexistingCondition2;
    private Double Imc;



    public Patient(String patienid, String name, int age, Double weight, Double height, String preexistingCondition2, Double Imc){
       
       this.patienid= patienid;
       this.name=name;
       this.age= age;
       this.weight=weight;
       this.height=height;
       this.preexistingCondition2=preexistingCondition2;
       this.Imc=Imc;
        
    }
    public String tocsv(){
        return this.patienid+","+this.name+","+this.age+","+this.weight+","+this.height+","+this.preexistingCondition2+","+this.Imc+" ";
    }


  
    public String getpatienid(){
        return patienid;

    }
    public void setPatienid(String patienid) {
        this.patienid = patienid;
    }

    
    public String getname(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    
    public int getage(){
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public Double getweight(){
        return weight;

    }
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    
    public Double getheight(){
        return height;
    }
    public void setHeight(Double height) {
        this.height = height;
    }
    
    public void setPreexistingCondition2(String preexistingCondition2){
        this.preexistingCondition2= preexistingCondition2;
    }

    
}
 
    /*public Patient register (int patienid, String name, int age, int weight, int height, String preexistingCondition){
        Patient patient = new Patient();
        patient.setPatienid(patienid);
        patient.setName(name);
        patient.setAge(age);
        patient.setWeight(weight);
        patient.setHeight(height);
        patient.setPreexistingCondition(preexistingCondition);
        return patient;

    }
    */


    
