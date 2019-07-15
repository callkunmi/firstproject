 public class Dog{

    private String name;
     private double weight;
    private int age;
  
  public Dog (String name,double weight, int age ){
     
      this.name= name;
      this.weight=weight;
      this.age= age;
 }
  

   public void printDogDetails() {
        System.out.println("name:" + this.name);
        System.out.println("weight" + this.weight);
        System.out.println("Age" + this.age);


  }
   public String getName() {
        return name;

}
public double getWeight(){
	return weight;

}

public int getAge(){
	return age;
}

 public void setName(String name){
  this.name =  name;
}
