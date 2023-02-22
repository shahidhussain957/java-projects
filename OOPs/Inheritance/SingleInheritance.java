class Animal{
 void eat(){
    System.out.println("Animal Eating Their Food.....");
 }
}
class dog extends Animal{
    void bark(){
        System.out.println("The Dog barks in the Night...");
    }
}

public class SingleInheritance {
    public static void main(String[]args){
        dog d=new dog();
        d.eat();
        d.bark();
    }
    
}
