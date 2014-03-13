#!/usr/bin/env python
from math import sqrt
from numpy import linspace
def h(x):
    y = abs(x)
    for k in xrange(128):
        y = sqrt(y)
    w = y
    for k in xrange(128):
        w = w**2
    return w

if __name__ == "__main__":
    for x in linspace(0,1,6):
        print (x,h(x),x==h(x))
