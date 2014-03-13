import java.io.*;

public class FloatingPointTest {

    public static double h(double x) {
        double y, w;
        y = Math.abs(x);
        for (int k=0; k<128; k++) {
            y = Math.sqrt(y);
        }
        w = y;
        for (int k=0; k<128; k++) {
            w = Math.pow(w,2);
        }
        return w;
    }


    public static void main(String args[]) {
        int n = 10;
        double x = 0;
        double d = 1.0/n;
        for (int k=0; k<=n; k++)  {
            System.out.println(String.format("(%f, %f, %s)", x, h(x), (x==h(x)) ? "true" : "false" ));
            x += d;
        }

    }

}

