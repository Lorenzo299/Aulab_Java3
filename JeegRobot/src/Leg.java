import abstract_class.LowerBody;
import interface_files.Move;

public class Leg extends LowerBody implements Move {

    public String material;

    public Leg(String lower_body_side, String material) {
        super(lower_body_side);
        this.material = material;
    }

    @Override
    public void low_attack() {
        System.out.println(lower_body_side);

    }

    @Override
    public void back() {
        System.out.println(lower_body_side);

    }

    @Override
    public void forward() {
        System.out.println(lower_body_side);

    }

    @Override
    public void jump() {
        System.out.println(lower_body_side);

    }

    @Override
    public void left() {
        System.out.println(lower_body_side);

    }

    @Override
    public void right() {
        System.out.println(lower_body_side);

    }

    @Override
    public void run() {
        System.out.println(lower_body_side);

    }

}
