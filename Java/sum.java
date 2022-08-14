import java.io.DataInputStream;
class sum{
    public static void main(String args[]){
        DataInputStream inp=new DataInputStream(System.in);
        try{
        System.out.println("Enter first number:");
        int a=Integer.parseInt(inp.readLine());
        System.out.println("Enter second number:");
        int b=Integer.parseInt(inp.readLine());
        int c=a+b;
        System.out.println("sum is "+c);
        }
        catch(Exception e) { }
    }
}