package com.mavenfundamentals.simplejavaproject;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Enter 2 nos:" );
        Scanner scan = new Scanner(System.in);
        int a,b;
        a=scan.nextInt();
        b=scan.nextInt();
        System.out.println("Addition: "+add(a,b) );
        System.out.println("Subtraction: "+sub(a,b) );
        System.out.println("Division: "+div(a,b) );
        System.out.println("Multiplication: "+mul(a,b) );
        
        
        System.out.println("Enter 5 nos.");
        int arr[]= new int[5];
        for(int i=0;i<5;i++){
        	arr[i]=scan.nextInt();       	
        }
      //does they enter 5 nos. only
        System.out.println("The max of 5 nos is : "+findmax(arr));

        
        
        
    }
    
    public static int add(int a,int b){
    	return a+b;   	
    }
    public static int sub(int a,int b){
    	return a-b;   	
    }
    public static int div(int a,int b){
    	if(b==0){
    		System.out.println("Division not possible bhai");
    		return -1; //// able to solve this using junit
    	}
    	
    	return a/b;   	
    }
    public static int mul(int a,int b){
    	return a*b;   	
    }
    public static int findmax(int[] arr){
        
        int max;
        
        
        max=arr[0];                    //// able to solvee this using junit test 
        for(int i=1;i<5;i++){
        	if(max<arr[i]){
        		max=arr[i];
        	}       	
        }
        
        return max;
    }
    
    
}
