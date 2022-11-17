package oops.multiple_inheritance;

public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        Amphibians amp = new Amphibians();
        amp.livisIn();
        String str = "NewArray";
        System.out.println(str.toCharArray());
        char a[] = str.toCharArray();
        for (char ele : a) {
            System.out.println(ele);
        }
    }
}

class Amphibians implements Aquatic, Terestial {
    public void livisIn() {
        System.out.println("Amphibians can live in water as well as on land");
    }
}
interface Aquatic {
    public void livisIn();
}

interface Terestial {
    public void livisIn();
}
