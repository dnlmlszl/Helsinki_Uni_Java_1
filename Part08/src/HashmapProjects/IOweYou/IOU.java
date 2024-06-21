package HashmapProjects.IOweYou;

import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> IOweYou;
    public IOU() {
        this.IOweYou = new HashMap<>();
    }
    public void setSum(String toWhom, double amount) {
        this.IOweYou.put(toWhom, amount);
    }
    public double howMuchDoIOweTo(String toWhom) {
        return this.IOweYou.getOrDefault(toWhom, 0.0);
    }
}
