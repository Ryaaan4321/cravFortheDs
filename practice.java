package aryanhere.Striver;

class cunt{

    public int a;
    public int name(){
        return 1;
    }
    public void meth1(){
        System.out.println(" i am a method1 of cunt class");
    }

}
class dcik extends cunt{
    public void meth1(){
        System.out.println("i am a method of dcik class");
    }
    public void meth2(){
        System.out.println(" I am a anotherr method of dcik class");
    }
}

public class practice {
    public static void main(String[]args){
        cunt cc = new cunt();
        cc.meth1();
        dcik dd = new dcik();
        dd.meth1();
    }

}