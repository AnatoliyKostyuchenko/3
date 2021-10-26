package com.company;
public class Main {

    public static void main(String[] args) {
	// write your code here
        massiveTwo();

    }
    public static void massiveTwo(int b,int a){
String[][] massiveTwo = new String[b][a];
try {
massiveTwo(5,5);
} catch(MyArraySizeException arr){
System.out.println("Не тот размер");
} catch(MyArrayDataException arr){
System.out.println("");
}finally{
System.out.println("Всё верно");
}
    }
   public static void MyArraySizeException(){

    }

}