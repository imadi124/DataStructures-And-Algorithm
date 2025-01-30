
// User function Template for Java

class Solution {
    static int dataTypeSize(String str) {
         switch (str) {
            case "Character":
                return 2; // Size of Character in Java
            case "Integer":
                return 4; // Size of Integer in Java
            case "Long":
                return 8; // Size of Long in Java
            case "Float":
                return 4; // Size of Float in Java
            case "Double":
                return 8; // Size of Double in Java
            default:
                return -1; // Invalid data type
        }
    }
}
