public class Main
{
    public static void main(String[] args) {
        HouseBuilder stoneHouseBuilder = new StoneHouseBuilder();
        House stoneHouse = stoneHouseBuilder.addWalls().addWindows().addRoof().build();
        System.out.println(stoneHouse.toString());
    }
}