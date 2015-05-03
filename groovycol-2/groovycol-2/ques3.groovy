//initializing the map
Map m = ['garima':22,'vcbnn':22,'gvbbvb':23,'gfhfh':21,'dfgdfgd':23]
println m
//fetching elements
println m.get('garima')
println m['vcbnn']
println m.'gfhfh'

//adding elements
println m.put('garima',24)
println m
m.putAll(m)
println m

//operations on keys
m.containsKey('garima')
println m.keySet()

//operations on values
println m.containsValue(22)
println m.values()

//iteration
println m.find()
println m.findAll()


m.eachWithIndex{entry,index->
if(entry.value>22)
println entry.key+"."+entry.value
}