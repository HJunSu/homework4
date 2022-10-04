class Sample {
    public int a;
    private int b;
    int c;
}
public class AccessEx {
    public static void main(String[] args) {
        Sample aClass = new Sample();
        aClass.a = 10;
      //  aClass.b = 10;
        aClass.c = 10;
    }
}
//b가 private 선언이 되었기 때문에 AccessEx 클래스에서 접근 할 수 없다.