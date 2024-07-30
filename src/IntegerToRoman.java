public class IntegerToRoman {

    int[] numbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    String[] strings = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    public String intToRoman(int num) {
        if(num < 1 || num > 3999) {
            return "";
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < numbers.length && num > 0; i++) {
            while (num >= numbers[i]) {
                num -= numbers[i];
                stringBuilder.append(strings[i]);
            }
        }
        return stringBuilder.toString();
    }

}
