package cput.ac.za.Question3.ocp.OCPViolation;

/**
 * Created by Adeebo on 2017/03/30.
 */
public class OpenCloseInitiator {

   public void drawShape(OpenClose s) {
        if (s.type == 2) {
            drawSquare();
        }
        else if (s.type == 1)
            drawCircle();
    }

    public void drawSquare(){

        Square s1 = new Square();
    }
    public void drawCircle(){

        Circle c1 = new Circle();
    }
}
