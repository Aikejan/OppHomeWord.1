import java.util.Scanner;

public class Triangle {
    int a;
    int b;
    int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public  int  triangleMethod(){
        int n = a+b+c;
        return n;

    }

    @Override
    public String toString() {
        return "a \n" + a +
                " b\n" + b +
                " c\n" + c ;
    }
}

