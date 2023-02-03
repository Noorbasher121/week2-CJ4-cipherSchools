
//import java.util.*;
class Emp{
    void printSomething(){
        System.out.println("Helo there");
    } 
   void printName() {
    System.out.println("Noor");
    printSomething();

   }
   int factorial(int n){
   // int fact=1;
    int i=1;
   // while(i<n);
    if(n==1)
    return n;
    else 
    return n*factorial(n-1);
    
   // for(int i=1;i<=n;i++){
    //    fact=fact*i;
        
   // }
   // return fact;
   }




    public static void main (String []args){
  
  // Emp obj2=new Emp();
   //obj2.printSomething();
   Emp obj1=new Emp();
  // Scanner sc=new Scanner(System.in);
   //int n= sc.nextInt();
   int n=5;
   int res= obj1.factorial(n);
   System.out.println(res);
  

    
}
}
