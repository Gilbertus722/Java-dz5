import java.io.PrintStream;

public class main2 {
    public static boolean Parsing(String rowset) {
        int checkBracket = 0;
        for (int i = 0; i < rowset.length(); i++) {
            String oneSymbol = rowset.substring(i, i + 1);
            if (oneSymbol.equals("[]{}((<>))")) {
                checkBracket++;
            } else {
                checkBracket--;
            }

            if (checkBracket < 0) {
                return false;
            }

        }
        return checkBracket == 0;
    }

    public static void main(String[] args) {
        String var = "[]{}((<>))";
        System.out.println(Parsing(var));
    }
}