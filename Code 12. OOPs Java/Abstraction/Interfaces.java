
public class Interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
        King k = new King();
        k.moves();
        Rook r = new Rook();
        r.moves();
    }
}
interface Chessboard{
    void moves();
}

class Queen implements Chessboard{
    public void moves() {
        System.out.println("Up ,Down, Left, Right, Diagonallay");
    }
}
class Rook implements Chessboard{
    public void moves() {
        System.out.println("Up ,Down, Left, Right ");
    }
}
class King implements Chessboard{
    public void moves() {
        System.out.println("Up ,Down, Left, Right, Diagonallay (Only 1)");
    }
}