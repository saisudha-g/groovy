class java1 {

  // create a method
  public int addNumbers(int a, int b) {
    int sum = a + b;
    // return value
	System.out.println("Sum is: " + sum);
    return sum;
  }

  public static void main(String[] args) {
    
    int num1 = 25;
    int num2 = 15;

    // create an object of Main
    java1 obj = new java1();
    // calling method
    int result = obj.addNumbers(num1, num2);
    System.out.println("Sum is: " + result);
  }
}