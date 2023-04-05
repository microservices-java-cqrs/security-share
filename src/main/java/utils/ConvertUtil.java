package utils;

public class ConvertUtil {
    public static String convertCamelToUnder(String name) {
        if (name == null) return null;
        String regex = "([a-z])([A-Z])";
        String replacement = "$1_$2";
        return name.replaceAll(regex, replacement).toLowerCase();
    }
    public static String convertUnderToCamel(String name) {
        if (name == null) return null;
        String[] words = name.split("[\\W_]+");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (i == 0) {
                word = word.isEmpty() ? word : word.toLowerCase();
            } else {
                word = word.isEmpty() ? word : Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
            }
            builder.append(word);
        }
        return builder.toString();
    }
}
