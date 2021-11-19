public class Solution {

    /*
     * Complete the 'alternatingCharacters' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public int alternatingCharacters(String s) {
        StringBuilder sBuilder = new StringBuilder(s);
        int count = 0;
        for (int i = 0; i < sBuilder.length();) {
            if (sBuilder.length() == 1 || i == sBuilder.length()-1) {
                break;
            }
            if (sBuilder.charAt(i+1) == sBuilder.charAt(i)) {
                sBuilder.deleteCharAt(i + 1);
                count++;
            }
            else {
                i++;
            }
        }
        return count;
    }
}
