//print "Good Morning!"

//character patterns

/*fo=new File('demo.txt')
for(i in fo.readLines())
{
if(i=~/qw*e/){
println i
}
}
println "**********************************************"
fo=new File('demo.txt')
for(i in fo.readLines())
{
if(i=~/qw+e/){
println i
}
}
println "**********************************************"
fo=new File('demo.txt')
for(i in fo.readLines())
{
if(i=~/qw?e/){
println i
}
}*/
//----------------------------------------------------

/*fo=new File('demo.txt')
for(i in fo.readLines())
{
if(i=~/^\w+\s\w+\s\w+$/){
println i
}
}*/

//--------------------------------------------------------------------
//name validation minimum 2 characters only string

/*fo=new File('demo.txt')
for(i in fo.readLines())
{
if(i=~/^[A-Za-z]{2,}+$/){
println i
}
}*/

//mobile number validation only 10 digits number should start with 6 to 9

/*fo=new File('demo.txt')
for(i in fo.readLines())
{
if(i=~/^[6-9][0-9]{9}/){
println i
}
}*/

//valid mail id
/*fo=new File('demo.txt')
for(i in fo.readLines())
{
if(i=~/^[a-z]\w+@[a-z]+.[a-z]{2,3}$/){
println i
}
}*/

//exact word pattern

/*fo=new File('demo.txt')
for(i in fo.readLines())
{
if(i=~/\bsai\b/){
println i
}}

println "*****************************************"

fo=new File('demo.txt')
for(i in fo.readLines())
{
if(i=~/^sai$/){
println i
}}*/


/*fo=new File('demo.txt')
for(i in fo.readLines())
{
if(i=~/\bgroovy\b\s\w+\s\bgroovy\b/){ //^groovy.*groovy$

println i
}}*/

//--------------------------------------------------------------------------------

//Functions or sub-routines or procedures

/*def printname(){

println "saisudha"
}
printname()
printname()

//functions with arguments

def arithmetic(x,y){

println "Sum of $x and $y :${x+y}"
println "Diff of $x and $y :${y-x}"
println "Div of $x and $y :${x/y}"
println "Product of $x and $y :${x*y}"
}

arithmetic(2,3)
arithmetic(10,100)
arithmetic(11,19)


v2=100
def f1()
{
v1=10//global variable
def v2=20//local variable
return 1000

}
def f2(){
println v1
//println v2
}
x=f1()
println x
f2()
*/

/*def find_avg(name,marks){

println "hello $name"
sum_of_marks=marks.sum()
total_sub=marks.size()
avg=sum_of_marks/total_sub
return avg
}

def grade(avg){
if(avg>=90){
g="A1"
}
else if(avg>=70){
g="A"
}
else{
g="B"
}
return g
}

marks=[100,70,78,60]
a=find_avg("sai",marks)
println "your avg mark is $avg"
g=grade(a)

println "your grade is $g"
//default arguments
def arg(a,b=10){
println a
println b 
}
arg(1,2)
arg(2)
*/
//----------------------------------------------------------------------------------------------------------------------------------------------------------

//Module

/*import arithmatic as arith // alias name
num1 = System.console().readLine"Enter number1 "
num1 = num1 as int
num2 = System.console().readLine"Enter number2 "
num2 = num2 as int

r1=new arith().product(num1,num2)
r2=new arith().sum(num1,num2)
println "product:$r1"
println "sum:$r2"
*/

//----------------------------------------------------------------------------------------------------------------------------------------------------------

//json file to groovy
//import groovy.json.JsonSlurper 

/*def jsontxt='{"name":"John", "age":30, "car":null}'//json txt
def jsonSlurpur=new JsonSlurper()
def jsonobj=jsonSlurpur.parseText(jsontxt)//jsontxt conv to groovy obj or groovy dictinory
println jsonobj
println "Name:${jsonobj.name},Age:${jsonobj.age}"
*/

//reading from json file
/*def jsonSlurpur=new JsonSlurper()
def jsonobj=jsonSlurpur.parse(new File('json1.json'))
println jsonobj
println "Name:${jsonobj.name},Age:${jsonobj.age}"
*/

//write in json file
/*import groovy.json.JsonOutput

def data=["name":"sai",
		"dob":"01-10-2001"]//groovy dic
def json_str=JsonOutput.toJson(data)//groovy dic to json format
File f=new File('json2.json')//create a file and write json content to the file
f.write(json_str)*/


//string is immutable
/*str1="groovy"
println str1
println str1.getClass()
println System.identityHashCode(str1)
str1=str1.replace('g','a')
println str1
println System.identityHashCode(str1)*/
//println "********************************************************"
//list is mutable
/*list=["groovy",1,2]
println list
println list.getClass()
println System.identityHashCode(list)
list[1]=2
println list
println System.identityHashCode(list)// to identify the hashcode
*/

//connecting_server.groovy hostname username password

/*host_info=args
println host_info
len=host_info.size()
if(len==3){
host_name=args[0]
username=args[1]
password=args[2]
println host_name
println username
println password
}
else{
println "invalid arguments"
}
*/
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------

//exception handling

/*n1=10
n2=0
try{
def r=n1/n2
println r
}
catch(ArithmeticException e){
println "ArithmeticException error:${e.message}"
}
catch(Exception e){
println "error ${e.message}"
}
println "bye"
*/

//read file using try and catch file is available or not


/*try{
fo=new File('textdemo.txt')
for (i in fo.readLines()){
print i
}}
catch(Exception e){
println "error:${e.message}"
}
*/

/*import groovy.json.JsonOutput

def jsondata=[
name:"sai",
age:22,
city:"sydney"
]


try{
def jsonContent=JsonOutput.toJson(jsondata)
new File('json2.json').text=jsonContent
println "data writen"
}
catch(Exception e){
println "error:${e.message}"
}
*/
//----------------------------------------------------------------------------------------------------------------------------------------
//oops

class employee{

def print(){
println "my name is sai"
}
}
sai=new employee()
sai.print()
