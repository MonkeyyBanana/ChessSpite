package stinky.monkey.Chess.Pieces;

import stinky.monkey.Chess.Board;
import stinky.monkey.Chess.Position;

import java.util.ArrayList;

public class Rook extends Piece {
    public Rook(TEAM team, Position position) {
        super(team, position);
    }

    @Override
    public ArrayList<Move> getAvailableMoves(Board board) {
        return null;
    }
}
