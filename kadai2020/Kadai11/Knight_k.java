package Kadai11;

public class Knight_k {
    private int magicPoint;

    public Knight_k() {
        this.magicPoint = 150;
    }

    public Knight_k(int magicPoint) {
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
