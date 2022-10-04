public class GarbageEx {
    public static void main(String[] args) {
        String a = new String("Good");
        String b = new String("Bad");
        String c = new String("Normal");
        String d, e;
        a = null;
        d = c;
        c = null;
    }
}
//a에 "Good"을 넣은뒤에 a 에 null을 넣게되며 a 에 있던 "Good"이 가비지가 된다.