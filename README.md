Floating Point Computation Test
===================================
These programs are inspired by a note I found outside the office of Professor William Kahan, who was the primary architect of floating-point, and many other accomplishments. 

Define a function h(x) that does the following operations:

    - Given a non-negative number, repeatedly square root it 128 times. 
    - Then "undo" these actions by repeatedly squaring that result 128 times. 

The result should be what we started with, such that h(x) = x.

However, computer programs typically produce h(x) = 0, for almost any x.

(Sometimes they correctly compute that h(0) = 0 and h(1) = 1.)

- William Wu (w@qe-design.com), 2013 March 13

