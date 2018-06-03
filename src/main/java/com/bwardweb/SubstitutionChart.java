package com.bwardweb;

public class SubstitutionChart {
    private char[][] substititionChart;
    private static final int ASCII_LOWERCASE_START = 97;
    private static final int ASCII_LOWERCASE_END = 122;

    public SubstitutionChart(){
        substititionChart = new char[26][26];
        for(int i=0;i<substititionChart.length;i++){
            int nextChar = ASCII_LOWERCASE_START + i;
            for(int j=0;j<substititionChart[i].length;j++){
                if(nextChar > ASCII_LOWERCASE_END){
                    substititionChart[i][j] = (char) (nextChar - ASCII_LOWERCASE_END + ASCII_LOWERCASE_START -1);
                }else {
                    substititionChart[i][j] = (char) nextChar;
                }
                nextChar++;
            }
        }
    }

    public char getSubstituteChar(char row, char column){
        return substititionChart[row-ASCII_LOWERCASE_START][column-ASCII_LOWERCASE_START];
    }

    public void printSubtitutionChart(){
        for(char[] characterArray:substititionChart){
            for(char character: characterArray){
                System.out.print(character + ", ");
            }
            System.out.println();
        }
    }

}
