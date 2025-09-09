import abstract_class.LowerBody;
import interface_files.Move;

public class Crawler extends LowerBody implements Move {

    public String name;

    public Crawler(String lower_body_side, String name) {
        super(lower_body_side);
        this.name = name;
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
