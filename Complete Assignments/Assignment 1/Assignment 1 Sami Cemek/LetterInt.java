public class LetterInt implements Letter{

    //getInt returns the integer value of the letter
    // ... using the ASCII character encoding to map integers to letters

    private int i;
    
    //constructor

    public LetterInt(int i) {
        this.i = i;

        if(65 <= i && i <= 90){
            System.out.println("Valid integer - Uppercase Letter");
        }else if(97 <= i && i <= 122){
            System.out.println("Valid integer - Lowercase Letter");
        }
        else{
            throw new IllegalArgumentException("Not a valid int");
        }
    }

    @Override
    public int getInt() {
        return i;

    }

    @Override
    public char getChar() {
        char letter = (char) i;
        return letter;
    }

}