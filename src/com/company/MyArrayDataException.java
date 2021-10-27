package com.company;

public class MyArrayDataException {
    public void isParsable(String[][] arr)throws MyArrayDataException {
        int sum = 0;
        int i= 0;
        for(int b = 0; b<arr.length; b++){
            for(int a = 0; a < arr[b].length; a++){
                try {
                    sum += Integer.parseInt(arr[b][a]);
                }catch(NumberFormatException ex){
                    throw new MyArrayDataException(b,a);
                }
            }
        }
    }
}

