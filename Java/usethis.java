class student{
    String name;
    int rollno;
    float fee;
    student(String name,int rollno,float fee){
        this.name=name;
        this.rollno=rollno;
        this.fee=fee;
    }
    void display(){
        System.out.println(name+" "+rollno+" "+fee+"\n");
    }
}
class usethis{
    public static void main(String args[]){
        student s1=new student("AB",111,4000f);
        student s2=new student("CD",222,5000f);
        s1.display();
        s2.display();
    }
}y
