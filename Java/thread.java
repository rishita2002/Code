import java.lang.Thread;
class t1 extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
    }
}
class t2 extends Thread{
    public void run(){
        char c;
        for(c='A';c <='J'; ++c){
            System.out.println(c+" ");
        }
    }
}
class thread{
    public static void main(String args[]){
        t1 thread1=new t1();
        t2 thread2=new t2();
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.start();
        thread1.start();
        }
}