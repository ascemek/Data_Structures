public class LetterChar implements Letter{
    
    private char c;

    //constructor
    public LetterChar(char c) {
        this.c  = c;

        if(Character.isLetter(c)){
            System.out.println("Valid Character");
        }else{
            throw new IllegalArgumentException("Not a char");
        }
    }

    @Override
    public int getInt() {
        int num  = (int) c; 
        return num;
    }

    @Override
    public char getChar() {
        return c;
    }
}