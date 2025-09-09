import abstract_class.UpperBody;
import interface_files.Move;

public class Wing extends UpperBody implements Move {

    public Wing(String upper_body_side) {
        super(upper_body_side);
    }

    @Override
    public void forward() {
        System.out.println(upper_body_side);
    }

    @Override
    public void back() {
        System.out.println(upper_body_side);

    }

    @Override
    public void left() {
        System.out.println(upper_body_side);

    }

    @Override
    public void right() {
        System.out.println(upper_body_side);

    }

    @Override
    public void jump() {
        System.out.println(upper_body_side);

    }

    @Override
    public void run() {
        System.out.println(upper_body_side);

    }

    @Override
    public void upper_attack() {
        System.out.println(upper_body_side);

    }

    @Override
    public void defence() {
        System.out.println(upper_body_side);

    }

}
