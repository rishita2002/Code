class employee{
    public String name;
    public int sal;
    public static int count=0;
    employee(String name,int sal){
        this.name=name;
        this.sal=sal;
        count=count+1;
    }
}
public class countobj{
    public static void main(String args[]){
        student s1=new student("AB",111,4000f);
        student s2=new student("CD",222,5000f);
        System.out.println("There are "+employee.countt+" objects in this class!");
    }
}
