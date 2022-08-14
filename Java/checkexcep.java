import java.io.*;
class checkexcep{
    public static void main(String args[]){
        FileInputStream file_data=new FileInputStream("C:\\Users\\User\\Downloads\\Hello.txt");
        int m;
        while((m=file_data.read())!=-1){
            System.out.println((char)m);
        }
        file_data.close();
    }
}