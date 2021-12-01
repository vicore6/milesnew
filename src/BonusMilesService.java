public class BonusMilesService {
    public int calculate(int price) {
        int cost = price;
        int divider = 20;
        int mile = cost / divider;
        return mile;
    }
}
