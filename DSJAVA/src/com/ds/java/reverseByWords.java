public class ReversByWordString{
    public static void reverse(char[] ch, int left, int right) {
        while (left <= right) {
            char temp = ch[right];
            ch[right] = ch[left];
            ch[left] = temp;
            left++;
            right--;
        }
    }
    public static String reverseByWords(String s) {
        char[] ch = s.toCharArray();
        int beg = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == ' ') {
                reverse(ch, beg, i);
                beg = i + 1;
            }
        }
        reverse(ch, beg, ch.length - 1);
        reverse(ch, 0, ch.length - 1);
        String ans = Arrays.toString(ch);
        return ans;
    }
}