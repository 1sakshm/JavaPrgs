class FactorialExample{  
 static int factorial(int n){    
  if (n==0)    
    return 1;  
  if(n<0)
    return -1;  
  else    
    return(n * factorial(n-1));    
 }    
 public static void main(String args[]){  
  int i,fact=1;  
  int number=4;//It is the number to calculate factorial    
  fact = factorial(number);   
  if(fact==-1) System.out.println("Negative number!!!");
  System.out.println("Factorial of "+number+" is: "+fact);    
 }  
}  
