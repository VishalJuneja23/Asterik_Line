/**
 * Created by jvishal on 12/25/16.
 */
public class AsterikLine {

    private int width;

    public AsterikLine(int size)
    {
        width = size;
    }


    public String displayHorizontalAsterikLine()
    {
        StringBuilder line = new StringBuilder();
        for(int i=0; i<width; i++)
            line.append("*");

        return line.toString();
    }

    public static void main(String[] args) {

        System.out.println(new AsterikLine(10).displayHorizontalAsterikLine());
    }
}
