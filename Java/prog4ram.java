import java.io.DataInputStream;
interface shape{
    void area();
}
class circle implements shape{
    float pi=3.14f;
    int r;
    circle(int r){
    this.r=r;
    }
    public void area(){
        System.out.println("Area of circle="+pi*r*r);
    }

}
class triangle implements shape{
    int b,h;
    triangle(int b,int h){
        this.b=b;
        this.h=h;
    }
    public void area(){
        System.out.println("Area of Rectangle="+0.5*b*h);
    }
}
class prog4ram{
    public static void main(String args[]){
        try{
        DataInputStream inp=new DataInputStream(System.in);
        System.out.println("enter radius:");
        int r=Integer.parseInt(inp.readLine());
        circle c=new circle(r);
        c.area();
        System.out.println("enter base of triangle:");
        int b=Integer.parseInt(inp.readLine());
        System.out.println("enter height of triangle:");
        int h=Integer.parseInt(inp.readLine());
        triangle t=new triangle(b,h);
        t.area();
        }
        catch(Exception e){}
        
    }
}