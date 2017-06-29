class Base {
    int i,j;
    void setBase(int i,int j) {
        this.i = i;
        this.j = j;
    }

}
class Derived extends Base {
    int a,b;
    void setDerived(int a,int b) {
        this.a = a;
        this.b = b;
    }
    void showAll() {
        System.out.println("From Base \ni = " + i + "\nj = " + j);
        System.out.println("From Derived \na = " + a + "\nb = " + b);        
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.setBase(1, 2);
        d.setDerived(4, 5);
        d.showAll();
    }
}