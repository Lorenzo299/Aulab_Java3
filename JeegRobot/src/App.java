import abstract_class.LowerBody;
import abstract_class.UpperBody;

public class App {
    public static void main(String[] args) throws Exception {

        LowerBody motoreDx = new Engine("Motore destro");
        LowerBody motoreSx = new Engine("Motore sinistro");
        UpperBody alaDx = new Wing("Ala destra");
        UpperBody alasx = new Wing("Ala sinistra");

        Jeeg robot1 = new Jeeg(motoreDx, motoreSx, alaDx, alasx);

        robot1.useLowerBodyLeft();
        robot1.attackLeft();
        robot1.useLowerBodyRight();
        ((Wing) robot1.UbDx).back(); // casting dell oggetto posso usare anche i metodi delle classi astratte
    }
}
