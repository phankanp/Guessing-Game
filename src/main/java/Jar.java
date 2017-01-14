import java.util.Random;

public class Jar {

    private String itemName;
    private int maxItemsAllowed;
    private int fillNumber;

    public Jar(String mItemName, int mMaxItemsAllowed) {
        itemName = mItemName;
        maxItemsAllowed = mMaxItemsAllowed;
        fillNumber = 0;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getMaxItemsAllowed() {
        return maxItemsAllowed;
    }

    public void setMaxItemsAllowed(int maxItemsAllowed) {
        this.maxItemsAllowed = maxItemsAllowed;
    }

    public int getFillNumber() {
        return fillNumber;
    }

    public void setFillNumber(int fillNumber) {
        this.fillNumber = fillNumber;
    }

    public int fill() {
        Random random = new Random();

        fillNumber = random.nextInt(maxItemsAllowed) + 1;

        return fillNumber;
    }
}