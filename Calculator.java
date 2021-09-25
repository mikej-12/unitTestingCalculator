/*  programming assignment 1
 * Calculator.java
 * @author Solomon Tsehay
 * @since 09/18/2021
 */
package learn.junit.demo;

public class Calculator {
 //adding numbers
 public double add(double a, double b) {
  return a + b;
 }
 //calculate subtraction
 public double subtract(double a, double b) {
  return a - b;
 }
 //calculate multiplication
 public double multiply(double a, double b) {
  return a * b;
 }
 //calculate division 
 public double divide(double a, double b) { 
  if(b == 0) {
   throw new ArithmeticException();
  }
  return a / b;
 }
 
}
		 

	


