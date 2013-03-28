package tradingcardgame.engine.cards.monsters;

import tradingcardgame.engine.Card;
import tradingcardgame.engine.Type;

public abstract class Monster extends Card{
    private Integer level;
    private Integer attack;
    private Integer defence;
    private Type type;

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getDefence() {
        return defence;
    }

    public void setDefence(Integer defence) {
        this.defence = defence;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
