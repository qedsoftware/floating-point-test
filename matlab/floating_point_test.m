clear; clc; close all;

n = 10;
d = 1/n;
x = 0;
for i=1:(n+1)
    out = h(x);
    disp([x,out]);
    x = x + d;
end