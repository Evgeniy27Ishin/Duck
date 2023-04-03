public class StoneHouseBuilder extends HouseBuilder
{
    int numWalls = 5;
    int numWindows = 20;
    String windowMaterial = "Страинное стекло";
    String wallMaterial = "Кмень, 0.5 метра толщиной";
    String interiorWallMaterial = "Камень, 0.25 метра толщиной";
    String roofMaterial = "Черепица";
        
    public StoneHouseBuilder()
    {
        this.builderName = "строитель каменного дома";
        setHouseType(HouseType.STONE);
    }
        
    public HouseBuilder addWalls()
    {
        for (int i = 0; i < numWalls-1; i++)
        {
            house.addWall(new Wall(wallMaterial));
        }
        house.addWall(new InteriorWall(interiorWallMaterial));

        return this;
    }
     public HouseBuilder addRoof()
    {
        house.addRoof(new Roof(roofMaterial));
        return this;
    }
    public HouseBuilder addWindows()
    {
        for (int i = 0; i < numWindows-1; i++)
        {
            house.addWindow(new Window(windowMaterial));
        }
        return this;
    }
    public House build()
    {
        System.out.println("Склеить всё цементом");
        return house;
    }
}