package base;

/**
 * Created by QrCeric on 22/02/2017.
 */
public enum NumberToChinese {

    ZERO("零"), ONE("一"), TWO("二"), THREE("三"), FOUR("四"), FIVE("五"), SIX("六"), SEVEN("七"), EIGHT("八"), NINE("九");

    private String stringCN;

    NumberToChinese(String string) {
        this.stringCN = string;
    }

    public String getStringCN() {
        return this.stringCN;
    }

    public String get(int i) {
        return get(i);
    }
}
