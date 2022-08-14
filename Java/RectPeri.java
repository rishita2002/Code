import java.io.DataInputStream;
class Rectangle{
    int length,width;
    void getData(int x,int y){
        length=x;
        width=y;

    }
    public int rectPeri(){
        int peri=2*(length+width);
        return (peri);
    }

}
class RectPeri{
    public static void main(String args[]){
        try{
            DataInputStream inp=new DataInputStream(System.in);
            int peri1,peri2;
            int l,w;
            int L,W;
            System.out.println("Enter length:");
            l=Integer.parseInt(inp.readLine());
            System.out.println("Enter width:");
            w=Integer.parseInt(inp.readLine());
            System.out.println("Enter length:");
            L=Integer.parseInt(inp.readLine());
            System.out.println("Enter width:");
            W=Integer.parseInt(inp.readLine());
            Rectangle rect1=new Rectangle();
            Rectangle rect2=new Rectangle();
            rect1.length=l;
            rect1.width=w;
            peri1=2*(rect1.length+rect1.width);
            rect2.getData(L,W);
            peri2=rect2.rectPeri();
            System.out.println("Perimeter: "+peri1);
            System.out.println("Perimeter: "+peri2);

        }
        catch(Exception e) { }

    }
}