import data.Point;
import logic.PointController;

public class PointApplication {

    private static final String ADD_X = "ADD_X";
    private static final String ADD_Y = "ADD_Y";
    private static final String MINUS_X = "MINUS_X";
    private static final String MINUS_Y = "MINUS_Y";

    public static void main(String[] args) {

        Point p1 = new Point(3, 9);
        PointController pc = new PointController();

        String result = "MINUS_Y";

        switch (result){
            case ADD_X:
                pc.addX(p1);
                break;
            case ADD_Y:
                pc.addY(p1);
                break;
            case MINUS_X:
                pc.minusX(p1);
                break;
            case MINUS_Y:
                pc.minusY(p1);
                break;
            default:
                System.out.println("Podano błędną opcję");


        }
        System.out.println("Wartość po zmianie: ");
        System.out.println("Point x;y: (" + p1.getX() + ";" + p1.getY() + ")" );
    }
}
