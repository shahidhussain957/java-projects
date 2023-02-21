public class Constructor{
    public static void main(String args[]){
        students s=new students();
        students p=new students();
        //by refernce variable
        // s.id=10;
        // s.name="Shahid";
        // s.marks=20.5f;
        System.out.println(s.id+" "+s.name+" "+s.marks);
        System.out.println(p.id+" "+p.name+" "+p.marks);
        //s.display();
    }
}
class students{
    int id;
    String name;
    float marks;
    students(){
        this.id=23;
        this.name="Sonu";
        this.marks=23.4f;
    }
    
    void display(){
        float marks=40f;
        System.out.println("The marks is:"+marks);
    }
}