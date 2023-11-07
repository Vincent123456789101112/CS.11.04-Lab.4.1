public class Main {

public class Main {


        public static boolean parenthesesCheck(String str) {
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c == '(') {
                    count++;
                } else if (c == ')') {
                    count--;
                    if (count < 0) {
                        return false;
                    }
                }
            }

            return count == 0;
        }


        public static String reverseInteger(int a) {
            int length = (a+"").length();
            String result = "";
            for (int i = length-1; i>=0; i--) {
                result = result + (a+"").charAt(i);
            }
            return result;
        }

        public static String encryptThis(String str) {
            String[] words = str.split(" ");
            String result = "";
            for (String word : words) {
                if (word.length() == 3) {
                    int code = (char) word.charAt(0);
                    result = result + code + word.charAt(2) + word.charAt(1) + " ";
                }
                else if (word.length() == 2) {
                    int code = (char) word.charAt(0);
                    result = result + code + word.charAt(1) + " ";
                }
                else {
                    int code = (char) word.charAt(0);
                    result = result + code + word.charAt(word.length() - 1) + word.substring(2, word.length() - 1) + word.charAt(1) + " ";
                }
            }
            return result.substring(0,result.length()-1);
        }


        public static String decipherThis(String str) {
            String[] words = str.split(" ");
            String result = "";

            for (String word : words) {
                if ((Character.isDigit(word.charAt(2))) && word.length() == 4) {
                    int code = Integer.parseInt(word.substring(0,3));
                    char firstChar = (char) code;
                    result = result +  firstChar + word.charAt(3) + " ";
                }
                else if ((Character.isDigit(word.charAt(2))) && word.length() == 5) {
                    int code = Integer.parseInt(word.substring(0,3));
                    char firstChar = (char) code;
                    result = result +  firstChar + word.charAt(word.length() - 1) + word.charAt(3) + " ";
                } else if (((Character.isDigit(word.charAt(2)) && word.length() == 6))) {
                    int code = Integer.parseInt(word.substring(0,3));
                    char firstChar = (char) code;
                    result = result +  firstChar + word.charAt(word.length() - 1) + word.charAt(4) + word.charAt(3) + " ";
                } else if (((!Character.isDigit(word.charAt(2)) && word.length() == 6))) {
                    int code = Integer.parseInt(word.substring(0,2));
                    char firstChar = (char) code;
                    result = result +  firstChar + word.charAt(word.length() - 1) + word.substring(3,5) + word.charAt(2) + " ";
                } else if (Character.isDigit(word.charAt(2))){
                    int code = Integer.parseInt(word.substring(0,3));
                    char firstChar = (char) code;
                    result = result +  firstChar + word.charAt(word.length() - 1) + word.substring(3, word.length() - 1) + word.charAt(3) + " ";
                }
                else {
                    int code = Integer.parseInt(word.substring(0,2));
                    char firstChar = (char) code;
                    result = result +  firstChar + word.charAt(word.length() - 1) + word.substring(3, word.length() - 1) + word.charAt(2) + " ";
                }
            }

            return result.substring(0,result.length()-1);
        }

    }



}
