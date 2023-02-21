
public class ConstOverloading{
    public static void main(String args[]){
        Student s=new Student(22,"Shahid");
        Student p=new Student(23, "Khushbu", 55);
        //Calling the display function or method.
        s.display();
        p.display();
    }
}
class Student{
    int id=101;
    String name="Shakib";
    float marks;
    //Here s.id(22) is passed, and s.name(Shahid) is passed in this constructor.
    Student(int id,String name){
        this.id=id;
        this.name=name;
    }
    //Here p.id(23) is passed, p.name(Khushbu)is passed,p.marks(55)is passed.
    Student(int id,String name,float marks){
        this.id=id;
        this.name=name;
        this.marks=marks;
    }
    void display(){
        System.out.println(this.id+" "+this.name+" "+this.marks);
    }
}