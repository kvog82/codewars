package org.example.sumStringsAsNumbers;

// Sum Strings as numbers: https://www.codewars.com/kata/5324945e2ece5e1f32000370
public class SumBuilder {

    public String sumStrings(String a, String b) {
        if (a.equals("") && b.equals("")) {
            return "0";
        }

        int lengthA = a.length();
        int lengthB = b.length();
        int lengthToUse = Math.max(lengthA, lengthB);

        int[] aArray = createIntArray(a, lengthToUse);
        int[] bArray = createIntArray(b, lengthToUse);
        int[] resultArray = new int[lengthToUse+5];

        buildSumInResultArray(lengthToUse, aArray, bArray, resultArray);

        String resultString = getResultString(resultArray);
        return getStringWithoutLeadingZeros(resultString);
    }

    private static String getStringWithoutLeadingZeros(String resultString) {
        int startIndex = 0;
        for (int i = 0; i < resultString.length(); i++) {
            if(resultString.charAt(i) != '0') {
                startIndex = i;
                break;
            }
        }
        return resultString.substring(startIndex);
    }

    private static String getResultString(int[] resultArray) {
        StringBuilder builder = new StringBuilder();
        for (int num : resultArray) {
            builder.append(num);
        }
        return builder.toString();
    }

    private static void buildSumInResultArray(int lengthToUse, int[] aArray, int[] bArray, int[] resultArray) {
        int arrayIndex = lengthToUse -1;
        for (int i = resultArray.length-1; i >= 0 ; i--) {
            if(arrayIndex >= 0) {
                if (resultArray[i] + aArray[arrayIndex] + bArray[arrayIndex] < 10) {
                    resultArray[i] += aArray[arrayIndex] + bArray[arrayIndex];
                    arrayIndex--;
                } else {
                    resultArray[i] += aArray[arrayIndex] + bArray[arrayIndex] - 10;
                    resultArray[i - 1] = 1;
                    arrayIndex--;
                }
            }
        }
    }

    private int[] createIntArray(String string, int lengthToUse) {
        int[] result = new int[lengthToUse];
        int stringIndex = string.length()-1;
        for (int i = lengthToUse-1 ; i >= 0 ; i--) {
            if (stringIndex >= 0) {
                result[i] = Integer.parseInt(String.valueOf(string.charAt(stringIndex)));
                stringIndex--;
            }
        }
        return result;
    }
}
