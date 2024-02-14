class Rect {
    int l, b;

    void insert(int len, int bre) {
        l = len;
        b = bre;
    }

    void display() {
        System.out.println(l * b);
    }
}

public class rectangle {
    public static void main(String[] args) {
        Rect ob = new Rect();
        ob.insert(10, 20);
        ob.display();
    }
}
