class A{
    int a,b,c;
    
    void add(){
        a=10;b=20;c=a+b;
        System.out.println("The addition on two number is : "+c);
    }
    void sub(){
        a=30; b=5;c=a-b;
        System.out.println("The Subtraction of a and b is :" +c);
    }
}
class B extends A{
    void multi(){
        a=20;b=10;c=a*b;
        System.out.println("The Multiplication of and b is: " +c);
    }
    void devide(){
        a=25;b=5;c=a/b;
        System.out.println("The devision of a and b is : " +c);
    }
}
class C extends B{
    void area(){
        a=20;b=35;c=1/2*a*b;
        System.out.println("The Area of triangle is: "+ c);
    }
}
public class MultiLevel {
    public static void main(String[]args){
        C n=new C();
        B S=new B();
        S.sub();

        n.add();
        n.sub();
        n.multi();
        n.devide();
        n.area();
    }
    
}
