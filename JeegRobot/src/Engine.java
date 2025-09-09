import abstract_class.LowerBody;

public class Engine extends LowerBody {

    Engine(String lower_body_side) {
        super(lower_body_side);
    }

    @Override
    public void low_attack() {
        System.out.println("");
    };

}
