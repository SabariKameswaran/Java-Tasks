import java.util.Locale;

public class StringMethodsDemo {

    public static void main(String[] args) {
        StringMethodsDemo demo = new StringMethodsDemo();
        demo.run();
    }
    public void run() {
        String str1 = "Hello, World!";
        String str2 = "Hello, Java!";
        String str3 = "Hello, WoRlD!";
        String str4 = "Hello";
        String str5 = "World";

        // 1. char charAt(int index)
        char charAtExample = str1.charAt(1);
        System.out.println("charAt(1): " + charAtExample);

        // 2. boolean equals(Object obj)
        boolean equalsExample = str1.equals(str2);
        System.out.println("equals(str2): " + equalsExample);

        // 3. boolean equalsIgnoreCase(String string)
        boolean equalsIgnoreCaseExample = str1.equalsIgnoreCase(str3);
        System.out.println("equalsIgnoreCase(str3): " + equalsIgnoreCaseExample);

        // 4. int compareTo(String string)
        int compareToExample = str1.compareTo(str2);
        System.out.println("compareTo(str2): " + compareToExample);

        // 5. int compareToIgnoreCase(String string)
        int compareToIgnoreCaseExample = str1.compareToIgnoreCase(str3);
        System.out.println("compareToIgnoreCase(str3): " + compareToIgnoreCaseExample);

        // 6. boolean startsWith(String prefix, int offset)
        boolean startsWithOffsetExample = str1.startsWith("World", 7);
        System.out.println("startsWith(\"World\", 7): " + startsWithOffsetExample);
        // 7. boolean startsWith(String prefix)
        boolean startsWithExample = str1.startsWith("Hello");
        System.out.println("startsWith(\"Hello\"): " + startsWithExample);

        // 8. boolean endsWith(String suffix)
        boolean endsWithExample = str1.endsWith("World!");
        System.out.println("endsWith(\"World!\"): " + endsWithExample);

        // 9. int hashCode()
        int hashCodeExample = str1.hashCode();
        System.out.println("hashCode(): " + hashCodeExample);

        // 10. int indexOf(int ch)
        int indexOfCharExample = str1.indexOf('o');
        System.out.println("indexOf('o'): " + indexOfCharExample); // 4

        // 11. int indexOf(int ch, int fromIndex)
        int indexOfCharFromIndexExample = str1.indexOf('o', 5);
        System.out.println("indexOf('o', 5): " + indexOfCharFromIndexExample);

        // 12. int lastIndexOf(int ch)
        int lastIndexOfCharExample = str1.lastIndexOf('o');
        System.out.println("lastIndexOf('o'): " + lastIndexOfCharExample);

        // 13. int lastIndexOf(int ch, int fromIndex)
        int lastIndexOfCharFromIndexExample = str1.lastIndexOf('o', 7);
        System.out.println("lastIndexOf('o', 7): " + lastIndexOfCharFromIndexExample);

        // 14. int indexOf(String str)
        int indexOfStringExample = str1.indexOf("World");
        System.out.println("indexOf(\"World\"): " + indexOfStringExample);

        // 15. int lastIndexOf(String str)
        int lastIndexOfStringExample = str1.lastIndexOf("World");
        System.out.println("lastIndexOf(\"World\"): " + lastIndexOfStringExample);

        // 16. String substring(int beginIndex)
        String substringExample = str1.substring(7);
        System.out.println("substring(7): " + substringExample);

        // 17. String substring(int beginIndex, int endIndex)
        String substringRangeExample = str1.substring(7, 12);
        System.out.println("substring(7, 12): " + substringRangeExample);

        // 18. String concat(String str)
        String concatExample = str1.concat(" Enjoy!");
        System.out.println("concat(\" Enjoy!\"): " + concatExample);

        // 19. String replace(char oldChar, char newChar)
        String replaceExample = str1.replace('o', 'a');
        System.out.println("replace('o', 'a'): " + replaceExample);

        // 20. boolean contains(CharSequence s)
        boolean containsExample = str1.contains("World");
        System.out.println("contains(\"World\"): " + containsExample);

        // 21. String toUpperCase(Locale locale)
        String toUpperCaseLocaleExample = str1.toUpperCase(Locale.US);
        System.out.println("toUpperCase(Locale.US): " + toUpperCaseLocaleExample);

        // 22. String toUpperCase()
        String toUpperCaseExample = str1.toUpperCase();
        System.out.println("toUpperCase(): " + toUpperCaseExample);

        // 23. public String intern()
        String internExample = str1.intern();
        System.out.println("intern(): " + internExample);

        // 24. public boolean isEmpty()
        boolean isEmptyExample = str1.isEmpty();
        System.out.println("isEmpty(): " + isEmptyExample);

        // 25. public static String join(CharSequence delimiter, CharSequence... elements)
        String joinExample = String.join(" ", str4, str5);
        System.out.println("join(\" \", str4, str5): " + joinExample);

        // 26. String replaceFirst(String regex, String replacement)
        String replaceFirstExample = str1.replaceFirst("o", "a");
        System.out.println("replaceFirst(\"o\", \"a\"): " + replaceFirstExample);

        // 27. String replaceAll(String regex, String replacement)
        String replaceAllExample = str1.replaceAll("o", "a");
        System.out.println("replaceAll(\"o\", \"a\"): " + replaceAllExample);

        // 28. String[] split(String regex, int limit)
        String[] splitLimitExample = str1.split(" ", 2);
        System.out.println("split(\" \", 2): " + String.join(", ", splitLimitExample));

        // 29. String[] split(String regex)
        String[] splitExample = str1.split(" ");
        System.out.println("split(\" \"): " + String.join(", ", splitExample));

        // 30. String toLowerCase(Locale locale)
        String toLowerCaseLocaleExample = str1.toLowerCase(Locale.US);
        System.out.println("toLowerCase(Locale.US): " + toLowerCaseLocaleExample);

        // 31. String toLowerCase()
        String toLowerCaseExample = str1.toLowerCase();
        System.out.println("toLowerCase(): " + toLowerCaseExample);

        // 32. String trim()
        String trimExample = "  Hello, World!  ".trim();
        System.out.println("trim(): " + trimExample);

        // 33. char[] toCharArray()
        char[] toCharArrayExample = str1.toCharArray();
        System.out.println("toCharArray(): " + new String(toCharArrayExample));

        // 34. static String copyValueOf(char[] data)
        char[] data = {'H', 'e', 'l', 'l', 'o'};
        String copyValueOfExample = String.copyValueOf(data);
        System.out.println("copyValueOf(data): " + copyValueOfExample);

        // 35. static String copyValueOf(char[] data, int offset, int count)
        String copyValueOfRangeExample = String.copyValueOf(data, 1, 3);
        System.out.println("copyValueOf(data, 1, 3): " + copyValueOfRangeExample);

        // 36. void getChars(int srcBegin, int srcEnd, char[] dest, int destBegin)
        char[] dest = new char[5];
        str1.getChars(0, 5, dest, 0);
        System.out.println("getChars(0, 5, dest, 0): " + new String(dest));

        // 37. static String valueOf(Object obj)
        String valueOfExample = String.valueOf(123);
        System.out.println("valueOf(123): " + valueOfExample);

        // 38. boolean contentEquals(StringBuffer sb)
        StringBuffer sb = new StringBuffer("Hello, World!");
        boolean contentEqualsExample = str1.contentEquals(sb);
        System.out.println("contentEquals(sb): " + contentEqualsExample);

        // 39. boolean regionMatches(int srcoffset, String dest, int destoffset, int len)
        boolean regionMatchesExample = str1.regionMatches(0, "Hello", 0, 5);
        System.out.println("regionMatches(0, \"Hello\", 0, 5): " + regionMatchesExample);

        // 40. boolean regionMatches(boolean ignoreCase, int srcoffset, String dest, int destoffset, int len)
        boolean regionMatchesIgnoreCaseExample = str1.regionMatches(true, 0, str3, 0, 5);
        System.out.println("regionMatches(true, 0, str3, 0, 5): " + regionMatchesIgnoreCaseExample);

        // 41. byte[] getBytes(String charsetName)
        try {
            byte[] getBytesCharsetExample = str1.getBytes("UTF-8");
            System.out.println("getBytes(\"UTF-8\"): " + new String(getBytesCharsetExample, "UTF-8"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 42. byte[] getBytes()
        byte[] getBytesExample = str1.getBytes();
        System.out.println("getBytes(): " + new String(getBytesExample));

        // 43. int length()
        int lengthExample = str1.length();
        System.out.println("length(): " + lengthExample); // 13

        // 44. boolean matches(String regex)
        boolean matchesExample = str1.matches(".*World.*");
        System.out.println("matches(\".*World.*\"): " + matchesExample);

        // 45. int codePointAt(int index)
        int codePointAtExample = str1.codePointAt(1);
        System.out.println("codePointAt(1): " + codePointAtExample);
    }
}
