/**
 * Created by Jakub Brindza a Viliam Mihalik on 5.2.2016.
 */
public class Main {
    public static void main(String[] args) {
        Output out = new Output();
        InputReader input = new InputReader();

        for (int i  = 0; i < input.numberOfRows; i++){
            for (int j = 0; j < input.numberOfColumns; j++){
                if (input.getCell(i,j)){
                    int start = j;
                    while(j < input.numberOfColumns && input.getCell(i,j)){
                        j++;
                    }
                    out.paintLine(i, start, i, --j);
                }
            }
        }
        out.generateOutput("output.out");

    }
}
