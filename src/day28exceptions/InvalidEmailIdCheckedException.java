package day28exceptions;
/*
    1)Name the class by using "Exception" word at the end.
    Using "Exception" word at the end is not must but it is naming convetion
    2)To create a "checked exception"

 */

public class InvalidEmailIdCheckedException extends Exception {


    private static final long serialVersionUID = 1L;

    public InvalidEmailIdCheckedException(String message) {
        super(message);
    }
}
