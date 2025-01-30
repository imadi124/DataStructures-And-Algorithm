
class Solution {
    public static String compareNM(int n, int m) {
        if(int n < int m){
            return "lesser";
        }else if(int n == int m){
            return "equal";
        }else{
            return "greater";
        }
    }
}
