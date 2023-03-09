abstract class Parent{
      abstract void career(String name);
    abstract void parent(String name, int age);
    // int age;
    // Parent(int age){
    //     this.age=age;
    // }
    static void hello(){
        System.out.println("Hello I'm Static method: ");
    }
    void show(){
        System.out.println(" I'm Normal method: ");
    }
  
}
 class Daughter extends Parent{ 
    void show(){
        super.show();
    }
    // Daughter(int age){
    //     super(age);
    // }
    void career(String name){
        System.out.println("I'm going to be a doctor and my name is: "+name);
    }
    void parent(String name,int age){
        System.out.println("My name is " +name+ " and my age is "+age);
    }
}
class Son extends Parent{
    // Son(int age){
    //     super(age);
    // }
    void career(String name){
        System.out.println(" My name is "+name+" and i want to become IT professionalist");
    }
    void parent(String name, int age){
        System.out.println(" My name is "+name+" and my is age is "+age);
    }
}
public class Abstract1 {
    public static void main(String args[]){
        Parent ob=new Daughter();
        ob.career("Ayesha");
        ob.parent("Ayesha", 26);
        ob.show();
        Parent son=new Son();
        son.career("Aftab alam");
        son.parent("Aftab Alam", 26);
        Parent.hello();

    }
}
