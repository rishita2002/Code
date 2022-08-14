class A{
    int a=10;
    void display(){
        int a=5;
        System.out.println(this.a);
        System.out.println(a);
    }
}
class B extends A{
    int a=6;
    void display(){
        System.out.println(super.a);
    }

}
class thissuper{
    public static void main(String args[]){
        A a1=new A();
        B b1=new B();
        a1.display();
        b1.display();
    }
}