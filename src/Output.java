import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Jakub Brindza a Viliam Mihalik on 6.2.2016.
 */
public class Output {
    public List<String> lines;

    public Output() {
        lines = new ArrayList<>();
    }

    public void paintLine(int rowX, int rowY, int columnX, int columnY){
        lines.add("PAINT_LINE " + rowX + " " + rowY + " " + columnX + " " + columnY);
    }
    public void paintSquare(int row, int column, int width){
        lines.add("PAINT_SQUARE " + row + " " + column + " " + (width-1)/2);
    }
    public void ereaseCell(int row, int column){
        lines.add("ERASE_CELL " + row + " " + column);
    }
    public void generateOutput(){
        lines.add(0, "" + lines.size()); //add number of painting commands
        Path file = Paths.get("output.out");
        //test if file exist
        if (file.toFile().isFile()){
            Scanner reader = new Scanner(System.in);  // Reading from System.in
            System.out.println("The filename file already exists. Do you want to overwrite it? y/n");
            String answer = reader.nextLine();
            if(!answer.equalsIgnoreCase("y")){
                return;
            }
        }

        try {
            Files.write(file, lines, Charset.forName("US-ASCII"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
