class encap{
    private int id;
    private String name;
    //In encapsulation "get" method is used to display the date.
    public int getid(){
        return id;
    }
    public String getname(){
        return name;
    }
    //while the "set" method is used to pass the value in variable.
    public void setid(int id){
        this.id=id;
    }
    public void setname(String name){
        this.name=name;
    }
}
public class Encapsulation {
    public static void main(String args[]){
        encap ob=new encap();
        ob.setid(34);
        ob.setname("Shahid");
        System.out.println("The I'd is: "+ob.getid()+" And name is: "+ob.getname());
        System.out.println("The name is: "+ob.getname());
    }
}
