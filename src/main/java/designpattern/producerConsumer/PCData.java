package designpattern.producerConsumer;

/**
 * Created by QrCeric on 22/02/2017.
 */
public class PCData {

    private final int intData;

    PCData(int i) {
        this.intData = i;
    }

    PCData(String string) {
        this.intData = Integer.valueOf(string);
    }

    @Override
    public String toString() {
        return "intData is: " + intData;
    }

    public int getIntData() {
        return this.intData;
    }
}