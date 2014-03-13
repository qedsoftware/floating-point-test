#include <stdio.h>
#include <math.h>

double h(double x) {
    double y, w;
    int k;
    y = fabs(x);
    for (k=0; k<128; k++) {
        y = sqrt(y);
    }
    w = y;
    for (k=0; k<128; k++) {
        w = pow(w,2);
    }
    return w;
}

int
main(void) 
{
    int k;
    int n = 10;
    double d = 1.0/n;
    double x = 0;
    for (k=0;k<=10;k++) {
        printf("(%lf,%lf,%s)\n", x, h(x), x==h(x) ? "true" : "false" ); 
        x += d;
    }
    return 0;
}
