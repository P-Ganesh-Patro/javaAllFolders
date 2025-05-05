import java.util.stream.Stream;

public class StringMethdsJava {

    public static void main(String[] args) {
        System.out.println(" \"String methods\" ");
        String name = "Ram suhaas";
        String name1 = " varma";
        String concat = name.concat(name1);
        char charAt = name.charAt(1);
        boolean endsWith = name.endsWith("Ram");
        boolean contain = name.contains("Ram");
        int indexOf = name.indexOf("a", 3);
        int lastIndex = name.lastIndexOf("a");
        int lastIndexPosition = name.lastIndexOf("s", 9);
        String[] stringDelimiter = { "java", "python", "javascript" };
        String resultStringDelimiter = String.join(" | ", stringDelimiter);
        boolean startWith = name.startsWith("Ram");
        String subString = name.substring(2, 6);
        String candidate = " harish kalaga ";
        // System.out.println(candidate.trim());
        // System.out.println(candidate);
        String replaceChar = name.replace("a", "h");
        // String animalNames = "\nDog\nCat\nSnake\nCow";
        // System.out.println(animalNames.indent(5));
        // Date currentDate = new Date();
        // SimpleDateFormat formatter = new SimpleDateFormat("dd-mm-yyyy");
        // String todayDate = formatter.format(currentDate);
        // System.out.println(currentDate);
        // System.out.println(todayDate);

        int num = 99;
        double valueOfDouble = 09877.009;
        String valueOf = String.valueOf(valueOfDouble);
        // System.out.println(valueOf);

        String word = "java is independent programming language";
        String[] wordSplit = word.split(" ");
        // for (String string : wordSplit) {
        // System.out.println(string);
        // }
        // java 11
        String sentacne = "\njava is compiler and \ninterpreter \nlanguage";
        Stream<String> stream = sentacne.lines();
        // stream.forEach(System.out::println);
        // String word= "imaginnovate ";
        // String repeat = word.repeat(30);
        // System.out.println(repeat);
        String eString = "black day";
        // System.out.println(eString.isBlank());
        String string = "ganesh";
        StringBuffer stringBuf = new StringBuffer("aakash varma");
        stringBuf.append("ram suhass...");
        stringBuf.deleteCharAt(2);
        stringBuf.insert(2, "jogn");
        stringBuf.setLength(20);
        System.out.println(stringBuf.length());

    }
}