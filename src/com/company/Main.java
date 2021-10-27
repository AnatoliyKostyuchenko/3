package com.company;
public class Main {

    public static void main(String[] args) {
	// write your code here
        massiveTwo(5,5);

    }
    public static void massiveTwo(int b,int a){
String[][] arr = new String[b][a];
try {
massiveTwo(5,5);
} catch(MyArraySizeException massiveTwo){
System.out.println("Не тот размер");
} catch(MyArrayDataException massiveTwo){
System.out.println("Преобразование не удалось");
}finally{
System.out.println("Закончено");
}
    }
   public static void MyArraySizeException(){

    }

}