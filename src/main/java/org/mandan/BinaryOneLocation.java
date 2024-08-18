package org.mandan;

public class BinaryOneLocation {

    /**
     *
     * @param inputInt
     * @return Location of longest 1's in binary string
     * If no 1's exist will return -1
     */
    public int findLocation(int inputInt) {

        String binaryString = Integer.toBinaryString(inputInt);
        System.out.println("binaryString = "+ binaryString);
        char prevChar = '0';
        int currentStringStart = -1;
        int currentStringLen = -1;
        int longestStringFoundLen = -1;
        int longestStringStartLoc = -1;

        for(int i = 0; i < binaryString.length(); ++i){
            char currChar = binaryString.charAt(i);

            if(currChar == '1' && prevChar == '0'){//Starting of a new 1's string
                currentStringStart = i;
                currentStringLen = 1;
            } else if (currChar == '1' && prevChar == '1') {//We are in current string
                ++currentStringLen;
            }

            if(longestStringFoundLen < currentStringLen){
                longestStringStartLoc = currentStringStart;
                longestStringFoundLen = currentStringLen;
            }

            prevChar = currChar;
        }

        if(longestStringStartLoc == -1)
            //Assumption : Return -1 if the binary string do not contain 1
            return longestStringStartLoc;
        else
            return longestStringStartLoc + 1;
    }
}
