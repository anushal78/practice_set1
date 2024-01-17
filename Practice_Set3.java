public class Practice_Set3 {
    public static void main(String[] args) {
        //Question1 : Program to convert a string to lowercase:
        String name = "ANUSHA";
        System.out.println(name.toLowerCase());

        //Question2 : Program to replace spaces with underscores:
        String x = "My name is Anusha";
        x = x.replace(" ", "_");
        System.out.println(x);

        //Question3 : Program to fill in a letter template which looks like below:
        /*
        * letter = "Dear <|name|>, Thanks a lot"
        * Replace <|name|> with a string(some name)
        * */
        String letter = "Dear <|name|>, Thanks a lot";
        letter = letter.replace("<|name|>", "Bhavana");
        System.out.println(letter);

        //Question4 : Program to detect double and triple spaces in a string
        String a = "A  String variable   contains a collection of characters surrounded by double quotes";
        System.out.println(a.indexOf("  "));
        System.out.println(a.indexOf("   "));

        //Question5 : Program to format a letter using escape sequence characters
        String b = "Hello Everyone,\n\t I am Anusha. I am doing internship in a \n\t Back-end where we are using Java";
        System.out.println(b);

    }
}
