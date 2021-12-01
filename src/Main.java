public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println(miles);

        int lowcost = service.calculate(100);
        System.out.println(lowcost);

        int businesclass = service.calculate(1000000);
        System.out.println(businesclass);
    }
}
