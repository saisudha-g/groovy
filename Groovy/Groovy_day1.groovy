
//Loops
//while loop
/*i=1
while(i<=10){
println i
i++
}
i1=10
while(i1>=1){
println i1
i1--
}*/

/*i=1
while(i<=10){

if(i==5){
i++
continue
}
else{
print i
i++
}
}

i=0
while(i<10){
++i
if(i==5||i==7){
continue
}
println i
}
*/

//-------------------------------------------------------


while(true){
	num = System.console().readLine"Enter number "
	num = num as int
	if(num>0){
		println "Square of $num is ${num*num}"
	}
	else if(num<0){
		continue
	}
	else if(num == 0){
		break
	}
}


//---------------------------------------------------------------
//conditional statements

//simple if
/*num1=System.console().readLine "Enter num:"
num1=num1 as int
if(num1>0){
println "$num1 is positive number"
}
println "bye bye tata"
*/
//check number is even or odd 
/*num=System.console().readLine "Enter num:"
num=num as int
if(num%2==0){
println "$num is even number"
}
else{
println "$num is odd number"
}

//3 digit number or not

num2=System.console().readLine "Enter num:"
num2=num2 as int
if(num2>99 && num2<999){
println "$num is 3-digit number"
}
else{
println "$num is not 3-digit number"
}*/

//Ladder if else

/*num=System.console().readLine "Enter num:"
num=num as int
if(num>0){
println "$num is positive"
}
else if(num<0){
println "$num is negative"
}
else {
println "$num is equal to zero"
}*/

/*//FoodMenu

println "\n\n\n\n\n\t\t\t\t\t FoodMenu\n\t\t\t\t\t\t\t\t*********\n1.veg\n2.Non veg\n3.Jain menu\n\n"
option=System.console().readLine "Enter menu option:"
option=option as int
if(option==1){
println "curdrice\nvegrice"
}
else if(option==2){
println "chickenrice\nbiryani"
}
else if(option==3){
println "dhal\nroti"
}
else{
println "invalid option"
}

*/

//accept two numbers

/*num1=System.console().readLine "Enter num1:"
num1=num1 as int
num2=System.console().readLine "Enter num2:"
num2=num2 as int
println "1.sum\n2.sub\n3.mul\n4.div\n5.mod\n6.exponent"
option=System.console().readLine "Enter option:"
option=option as int
if(option==1){
println "sum of $num1 and $num2 is:${num1+num2}"
}
else if(option==2){
println "diff of $num1 and $num2 is:${num1-num2}"
}
else if(option==3){
println "product of $num1 and $num2 is:${num1*num2}"
}
else if(option==4){
println "div of $num1 and $num2 is:${num1/num2}"
}
else if(option==5){
println "Modo f $num1 and $num2 is:${num1%num2}"
}
else if(option==6){
println "exponent of $num1 and $num2 is:${num1**num2}"
}
else{
print "invalid option"
}
*/








//-------------------------------------------------------------------------
/*//Arithmetic operations
n1=System.console().readLine "Enter n1:"
n1=n1 as int
n2=System.console().readLine "Enter n2:"
n2=n2 as int

println "sum of $n1 & $n2 is:${n1+n2}"
println "diff of $n1 & $n2 is:${n1-n2}"
println "div of $n1 & $n2 is:${n1/n2}"
println "Mul of $n1 & $n2 is:${n1*n2}"
println "Mod of $n1 & $n2 is:${n1%n2}"
println "exp of $n1 & $n2 is:${n1**n2}"

//Relational operators
println n1>n2
println n1<n2
println n1==n2
println n1!=n2

s1=System.console().readLine "Enter s1:"
s2=System.console().readLine "Enter s2:"

println s1>s2
println s1<s2
println s1==s2
println s1!=s2

//inc dec operators

i=1
println i++
println i
println ++i
println i*/

//println "*"*10


//-------------------------------------------------------
//Input from user
/*name=System.console().readLine "Enter your name:"
print "Hi!i'm $name"*/
//Typecasting
/*n1=System.console().readLine "Enter n1:"
n1=n1 as int
n2=System.console().readLine "Enter n2:"
n2=n2 as int
//sum=n1+n2
println "sum is:${n1+n2}"*/


//---------------------------------------------------
//String built in fuctions

/*str1="Hi saisudha"
str2="hi.hello"

println str1.length()

println str1.substring(3,6)
println str1.indexOf('a')
println str1.replace('i','e')
println str1.toLowerCase()
println str1.toUpperCase()
println str1.reverse()
println str2.split("[.]")[0]

file_info="22Dec2023 192.161.1.10 80 192.161.1.11 88 web.cgi"
println file_info.split() [1..4].join(" ")*/


//---------------------------------------------------

//slicing 

/*str1='Groovy script'
println str1[0]//1st
println str1[-1]//last
println str1[0..5]//slicing
length=str1.length()

println "total length of the string is:$length" */




//Quoting rules

//not accepted error
/*s1='don't know'
println s1*/
/*s6="hi"hello"
println s6*/


//accepted
/*s2="don't know"
println s2

s3='don\'t know'
println s3

s4="don\"t know"
println s4

s5='hi"hello'
println s5*/





//--------------------------------------------------------
//Groovy Dynamic Datatype

/*x=1
y=100
z="Hi groovy"
a=10
e=true
//to get the datatype of variable
println x.getClass()
println y.getClass()
println z.getClass()
println a.getClass()
println e.getClass()*/

/*print x
println y
print z
println "The variable a value is:"+a

println "the value od a is:$a"
println 'the value od a is:$a'
println "The sum is: ${a+x}"
println "The sum:${z+" "+x}"*/


//-------------------------------------------------------
//basic input & output

/*
class HelloWorld{
    public static void main(String[] args){
	    System.out.println("Hello");
	}
}
*/
//in groovy we can code like below no need of extra code lines
//println("Hello World!") 
//println "Hello World!"
//println "hi sai"
//print "hi all"
//print "Hello";

