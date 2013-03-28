package tradingcardgame.engine;
public class Attribute {
    public static final Attribute DARK = new Attribute("dark");
    public static final Attribute EARTH = new Attribute("earth");
    public static final Attribute FIRE = new Attribute("fire");
    public static final Attribute LIGHT = new Attribute("light");
    public static final Attribute AQUA = new Attribute("aqua");
    public static final Attribute WIND = new Attribute("wind");
    
    private String name;

    public Attribute(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
