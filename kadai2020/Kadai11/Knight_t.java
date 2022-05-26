package Kadai11;

public class Knight_t {
    protected int magicPoint;

    public Knight_t() {
        this.magicPoint = 50;
    }

    public Knight_t(int magicPoint) {
        this.magicPoint = magicPoint;
    }

    public void SetMagicPoint(int MagicPoint) {
        this.magicPoint = MagicPoint;
    }

    public int getMagicPoint() {
        return this.magicPoint;
    }

    public void useMagicPoint() { // 魔力使うと 20 減る
        this.magicPoint -= 20;
    }

}
