import abstract_class.LowerBody;
import abstract_class.UpperBody;

public class Jeeg {
    public LowerBody LbDx;
    public LowerBody LbSx;
    public UpperBody UbDx;
    public UpperBody UbSx;

    Jeeg(LowerBody LbDx, LowerBody LbSx, UpperBody UbDx, UpperBody UbSx) {
        this.LbDx = LbDx;
        this.LbSx = LbSx;
        this.UbDx = UbDx;
        this.UbSx = UbSx;

    }

    public void attackLeft() {
        this.UbSx.upper_attack();
    }

    public void attackRight() {
        this.UbSx.upper_attack();
    }

    public void useLowerBodyRight() {
        this.LbDx.low_attack();
    }

    public void useLowerBodyLeft() {
        this.LbSx.low_attack();
    }
}
