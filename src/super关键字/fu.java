package super关键字;
public class fu {
    public int n1 = 100;
    protected  int n2 = 200;
    int n3 = 300;
    private int n4 = 400;
    public int returnn4(){
        return n4;
    }

    //    public fu(){
//        System.out.println("fu()");
//    }
    public fu(){
    }
    public fu(String name){
        System.out.println(name);
    }
    public fu(String name,int age){
        System.out.println("fu(String name,int age)");
    }
    public void cal(){
        System.out.println("fu类的cal方法");
    }
    public void test100(){
        System.out.println("test100");
    }
    protected void test200(){
        System.out.println("test200");
    }
    void test300(){
        System.out.println("test300");
    }
    private void  test400(){
        System.out.println("test400");
    }
    public void calltest400(){
        test400();
    }
}
