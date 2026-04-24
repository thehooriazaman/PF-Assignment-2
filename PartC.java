public static String convertToBinaryString(int num) {
    if (num == 0) return "0";
    
    String binaryStr = "";
    while (num > 0) {
        int bit = num % 2;
        binaryStr = bit + binaryStr; // Concatenate at the start
        num = num / 2;
    }
    return binaryStr;
}