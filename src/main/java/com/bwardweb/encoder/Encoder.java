package com.bwardweb.encoder;

import com.bwardweb.SubstitutionChart;

public class Encoder {
    private SubstitutionChart subChart;

    public Encoder(){
        subChart = new SubstitutionChart();
    }

    public String encodeString(String keyword, String message){
        StringBuilder encodedString = new StringBuilder();

        char[] rows = message.toCharArray();
        char[] columns = createColumnArray(keyword,message.length());

        for(int i=0;i<message.length();i++){
            encodedString.append(subChart.getSubstituteChar(rows[i],columns[i]));
        }


        return encodedString.toString();
    }

    private char[] createColumnArray(String keyword, int length){
        char[] columns = new char[length];
        int count = 0;
        for(int i=0;i<length;i++){
            columns[i] = keyword.charAt(count);
            count ++;
            if(count >= keyword.length()){
                count = 0;
            }
        }
        return columns;
    }
}
