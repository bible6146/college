package winter;

public class Time {
    private int h;
    private int m;
    private int s;

    public Time(){
        this(0,0,0);
    }
    public Time(int a,int b,int c){
        if(a<0||a>12)a=0;
        if(b<0||b>60)b=0;
        if(c<0||c>60)c=0;
        h=a;
        m=b;
        s=c;
    }
    public String toString(){
        return String.format("%02d:%02d:%02d",h,m,s);
    }
    public static void main(String[] agar){
        Time time1=new Time();
        Time time2=new Time(12,30,40);
        Time time3=new Time(12,70,80);
        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);
    }
}
