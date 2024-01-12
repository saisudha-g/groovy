//print "hi"

/*c=0

while(true){
Atm_pin=System.console().readLine"Enter Pin:"
Atm_pin=Atm_pin as int
c++
if(c==1||c==2||c==3){
if(Atm_pin==1234){
println "Welcome"
break
}
else{
continue
}}
else{
println "Exceeded Limit"
continue
}
}*/
//----------------------------------------------------------------------------------------------------------------------------------

//for loop
//==========
//for condition based
/*for(i=1;i<=5;i++)
{
println i
}
*/

//for in
//=======
//for iteration
//for variablename in iterableobj
/*for (i in 1..5)
{
println i
}

for(i in [1,3,5,7,9]){
println i
}

list=[2,4,6,8]
for (i in list){
println i
}*/


//dispaly 1 to 10 except 5
/*for(i in 1..10){
if(i==5){
continue
}
println i 
}


for(i in 1..10){
if(i==5){
break
}
println i 
}
*/



//write a script to dispaly 1 to 50,
//for the multiplies of 3 display "Fizz" instead of number
//for the multiplies of 5 display "Buzz" instead of number
//for the multiplies of 3 and 5 display "FizzBuzz" instead of number

for (i in 1..50){
if(i%3==0){

if(i%5==0){
println "FizzBuzz"
}
else{
println "Fizz"
}}
else if(i%5==0){
println "Buzz"
}
else if(i%3==0){
println "Fizz"
}
else{
println i
}
}
//-----------------------------------------------------------------------------------------------------------------------------------------

//switch case

/*num=System.console().readLine"Enter number:"
num=num as int
switch(num){
case 1:
println "number is 1"
break
case 2:
println "number is 2"
break
case 3:
println "number is 3"
break
case 4:
println "number is 4"
break
default:
println "invalid number"
}
*/

/*num=System.console().readLine"Enter number:"
num=num as int
switch(num){
case 1..3:
println "number is 1/2/3"
break
case 4..6:
println "number is 4/5/6"
break
case 7..9:
println "number is 7/8/9"
break
case 10:
println "number is 10"
break
default:
println "invalid number"
}
*/
//-----------------------------------------------------------------------------
//switch case with regular expression

/*str=System.console().readLine"Enter character:"
switch(str){
case ~/[a-zA-Z]+/:
print "Alphabet"
break
case ~/[0-9]+/:
print "Digit"
break
case ~/[^0-9A-Za-z]+/:
print "special character"
break
default:
print "Not matched"
}*/
//-------------------------------------------------------------------------------------------------------------------------------------

//Arrays

//list=[10,20,30,"hi","sai",[1,2,3]]
//accessing single element
/*println list[1]
println list[3]
println list[-1]*/
//range operator
//println list[0..3]
//array size or length
//println list.size()
//acessing multiple value
//println list[4,5]
//replace the hi
/*list[4]="linux"
println list[4]*/
//replace 10 20 30 with 100 200 300
/*list[0..2]=[100,200,300]
println list

println list[-1][-2]
list[-1][0..2]=[100,200,300]
list[-1][1]=20
println list.getClass()*/
//---------------------------------------------------------------------------------------------------------------------------

//Array Methods

/*array=[1,4,90,"hello",10,"sai","hi",4]

println array.size()
println array.count(4)
array.remove(3)
println array
array.pop()
println array
println array.sort()
println array.reverse()
array.add(10)
println array
println array.contains("hi")
array.push(2)
println array
a=array.drop(4)
println a
*/

//-----------------------------------------------------------------------------------------------------------------------------------

//Hashmap
/*emp=[101:"sai",102:"shalz",103:"varr"]
println emp[101]
println emp[101]="sudha"
println emp
emp1=[101:["john","prodapt","DS"],102:"bob"]
println emp1
println emp1[101][1]

for (i in emp1){
println i
}


car=["brandname":"KIA","color":"White","model":"K1z","price":1000000]
println car["brandname"]
println car["price"]

car["color"]="Black"
println car*/

//Hashmap methods

/*println car.keySet()
println car.values()
println car.size()
println car.containsKey("price")

a=car.keySet()
for (i in a){
println i +"<<=>>"+ car[i]
}
*/
//---------------------------------------------------------------------------------------------------------------------------------

// if file created in the same directory location of groovy file
/*fo=new File('textdemo.txt')
println fo
k=fo.getText() //read
println k
println k.getClass()*/

// if the file is at another location

/*fh=new File("C:/groovydemos/text1.txt")
println fo
k=fh.getText() //read
println k
println k.getClass()

fo=new File('textd.txt')
if(fo.exists())
{
print "available"
}
else
{
println "not available"
}

//acessing only 3rd and 5th line 
f1=new File('readlines.txt')
k=f1.readLines()
println k
for(i in k[2..4]){
println i 
}*/

//searching for groovy in the text file

/*f2=new File('readlines.txt')
k1=f2.readLines()
if(k1.contains('groovy')){
println "yes"

}
else{
println "no"
}*/


//the line which contains groovy
/*fo=new File('readlines.txt')
for(i in fo.readLines())
{
if(i=~/groovy/){
println i
}}*/


//line starts with groovy
/*fo=new File('readlines.txt')
for(i in fo.readLines())
{
if(i=~/^groovy/){
println i
}}*/

//line ends with groovy
/*fo=new File('readlines.txt')
for(i in fo.readLines())
{
if(i=~/groovy$/){
println i
}}*/

//only groovy word
/*fo=new File('readlines.txt')
for(i in fo.readLines())
{
if(i=~/^groovy$/){
println i
}}*/