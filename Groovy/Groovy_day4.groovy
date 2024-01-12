//print "hi!"

/*class demo{
def a 
def m1(){
this.a=10 //best practice
//a=10 //not best practice
//def a=10 //local variable
println "m1"
println a
}
def m2(){
def b=100
println "m2"
println b
println a
}}
d=new demo()
println d
d.m1()
d.m2()

*/
//constructor
/*class x
{
def x()
{
println "i am constructor"
}
def m1()
{
println "i am m1 in x"
}
}
x1=new x()
x1.m1()
*/
//constructor with arguments


/*class x
{
def a
def b
def x(a,b)
{

println "i am constructor"
this.a=a
this.b=b
}
def m1()
{
println "i am m1 in x"
println a
println b
}
}
x1=new x(10,20)
x1.m1()

*/

//BankApp

/*class bankApp
{
def bankname="SBI"
def cusname
def cusacc
def bal
def adrs
def bankApp(cusname,cusacc,bal,adrs)
{
this.cusname=cusname
this.cusacc=cusacc
this.bal=bal
this.adrs=adrs
}

def withdraw(w){

if(w>bal){

println "no amount"
}
else{
bal=bal-w
println "money withdrawn, your balance amt is:${bal}"
}
}
def deposit(d){
bal=bal+d
println "money deposited"
}

def balanceeq(){

println "Balance enq"
println bal
}

def customerdetails(){
println bankname
println cusname
println cusacc
println adrs
}
}
bank=new bankApp("sai",12345,10000,"chennai")
bank.deposit(10)
bank.balanceeq()
bank.withdraw(1000)
bank.balanceeq()
bank.customerdetails()
*/

//running java file in groovy
import java1
//import GroovyModule
def javaInstance=new java1()
javaInstance.addNumbers(10,11)
//def groovyInstance=new GroovyModule()
//groovyInstance.greet()
