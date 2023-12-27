package chess;

import boardgame.BoardExecption;

public class ChessException extends BoardExecption {
    private static final long serialVersionIUD = 1L;
    public ChessException (String msg){
        super(msg);
    }

}
