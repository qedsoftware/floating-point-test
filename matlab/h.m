function out = h(x)
   
y = abs(x);
for k=1:128
    y = sqrt(y);
end
w = y;
for k=1:128
    w = w^2;
end
out = w;

end