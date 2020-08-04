package 字符串;

import utils.Utils;

/**
 * @Auther: valarcfcc
 * @Date: 2020/8/4 22:48
 * @Description:
 */
public class reverseString {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
        Utils.show(s);
    }
    public static void reverseString(char[] s) {
        char temp ;
        int length = s.length;
        for (int i = 0;i < length;i++){
            temp = s[i];
            s[i] = s[length-1-i];
            s[length-1-i] = temp;
            if (i == length-1-i || i + 1 ==length-1-i){
                break;
            }
        }

    }
}
