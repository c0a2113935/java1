package Kadai11;

public class Knight_o {
    protected int magicPoint;

    public Knight_o() {
        this.magicPoint = 50;
    }

    public Knight_o(int magicPoint) {
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
