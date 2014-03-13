Floating Point Computation Test
===================================
These programs are inspired by a note (*) that I found outside of the office of Prof. William Kahan. 

Define a function h(x) that does the following operations:

1. Given a non-negative number, repeatedly square root it 128 times. 
2. Then "undo" these actions by repeatedly squaring that result 128 times. 

The result should be what we started with, such that h(x) = x.

However, most computers will not yield the correct answer. 

(Sometimes they correctly compute that h(0) = 0 and h(1) = 1, but other values of x produce incorrect results.)

(*) "Why is Floating-Point Computation so Hard to Debug when it Goes Wrong?", William Kahan.

- William Wu (w@qe-design.com), 2013 March 13

