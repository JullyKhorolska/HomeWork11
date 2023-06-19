import unique.Unique;
public class Main {
    public static void main(String[] args) {
        String str = "The bats COME out.The cats come out.the pumpkins come out too.cOme toO";
        Unique unique = new Unique(str);
        unique.hashSet();
        unique.hashMap();
    }
}
