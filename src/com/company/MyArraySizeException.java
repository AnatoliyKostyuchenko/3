package com.company;

public class MyArraySizeException extends Exception{

    public void isParsable(String[][] arr)throws MyArraySizeException{
        if(arr.length!=16){
            System.out.println("Не тот размер");
        }
        else{
            System.out.println("Всё верно");
        }
    }

}
