package tradingcardgame;

import tradingcardgame.engine.Deck;
import tradingcardgame.engine.Card;
import java.util.ArrayList;

public class Board {
    private Deck deck;
    private Card[] monsterZone;
    private Card[] magicTrapZone;
    private ArrayList<Card> graveyard;
    private ArrayList<Card> extraDeck;
    private Card FieldCard;
}
