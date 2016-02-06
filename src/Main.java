/**
 * Created by Jakub Brindza a Viliam Mihalik on 5.2.2016.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("WUAAA");
        Output out = new Output();
        out.paintLine(1,1,2,2);
        out.paintSquare(1,1,3);
        out.ereaseCell(1,1);
        out.generateOutput();
    }
}
