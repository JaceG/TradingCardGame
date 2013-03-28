package tradingcardgame.engine;

public class Effect {

    public static final Effect FLIP = new Effect("flip");
    public static final Effect CONTINUOUS = new Effect("continuous");
    public static final Effect FIRED = new Effect("fired");
    public static final Effect TRIGGERED = new Effect("triggered");
    public static final Effect FAST = new Effect("fast");
    private String effectType;

    public Effect(String effectType) {
        this.effectType = effectType;
    }

    public String getEffectType() {
        return effectType;
    }
}
