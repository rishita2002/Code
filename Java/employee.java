import java.io.DataInputStream;

class emp{
    String name;
    String dept;
    int age;
    int sal;

}
class employee{
    public static void main(String args[]){
        try{
            DataInputStream inp=new DataInputStream(System.in);
            int n=5;
            emp e[]=new emp[n];
            for(int i=1;i<=2;i++){
                e[i]=new emp();
                System.out.println("enter employee details:");
                System.out.println("name:");
                e[i].name=inp.readLine();
                System.out.println("department:");
                e[i].dept=inp.readLine();
                System.out.println("age:");
                e[i].age=Integer.parseInt(inp.readLine());
                System.out.println("salary:");
                e[i].sal=Integer.parseInt(inp.readLine());
            }
            System.out.println("employee details are:");
            for(int i=1a
            ;i<=2;i++){
                System.out.println("Employee name:"+e[i].name+'\n'+"department:"+e[i].dept+'\n'+"age:"+e[i].age+'\n'+"salary:"+e[i].sal+'\n');
            }
            

            
        }
        catch(Exception e){}
        
    }
}