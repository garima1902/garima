List l1= [1,2,3,4,5,6,7,8,9,10]
List l2= [1,2,3,4,5,6,7,8,9,10]

print "Table of 2 \t" 
println l1.collect{it.multiply(2)}
print "Table of 12 \t" 
println l2.collect{it.multiply(12)}
