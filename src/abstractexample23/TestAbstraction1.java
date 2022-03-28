package abstractexample23;

public class TestAbstraction1 {
    public static void main(String[] args) {
        Shape s = new Circle1() {
            @Override
            public void draw() {
                super.draw();
            }
        };
    }
        }







