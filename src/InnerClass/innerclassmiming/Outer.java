package InnerClass.innerclassmiming;

public class Outer {
    public void method(){
//        new Inter(){
//            @Override
//            public void show() {
//                System.out.println("OrtherDemo.method yinchang");
//            }
//        }.show();
        Inter i = new Inter() {
            @Override
            public void show() {
                System.out.println("OrtherDemo.method neibulei");
            }
        };
        i.show();
        i.show();
    }
}
