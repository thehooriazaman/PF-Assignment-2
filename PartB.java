public static int[] convertToBinaryArray(int num) {
    int[] binaryArray = new int[32]; // Standard size for a 32-bit integer
    int index = 31; // Start from the last position

    if (num == 0) return new int[32]; // Returns array of zeros

    while (num > 0 && index >= 0) {
        binaryArray[index] = num % 2;
        num = num / 2;
        index--;
    }
    return binaryArray; 
    // Note: The binary number starts from (index + 1) to 31
}