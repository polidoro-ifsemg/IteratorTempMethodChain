package tests;


import classes.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    EntryLevelSmartphone entryPhone;
    MediumLevelSmartphone mediumPhone;
    TopLevelSmartphone topPhone;
    Game game1;
    Game game2;
    Game game3;
    Game game4;

    @BeforeEach
    void setUp() {
        topPhone = new TopLevelSmartphone(null);
        mediumPhone = new MediumLevelSmartphone(topPhone);
        entryPhone = new EntryLevelSmartphone(mediumPhone);
        game1 = new Game("Jogo 1", 2);
        game2 = new Game("Jogo 2", 4);
        game3 = new Game("Jogo 3", 6);
        game4 = new Game("Jogo 4", 8);
    }

    @Test
    void mustReturnSuperior() {
        assertEquals("O game roda a partir do device Medium phone", entryPhone.canPlayGame(game2));
    }

    @Test
    void mustReturnCanPlay() {
        assertEquals("O game roda a partir do device Low level phone", entryPhone.canPlayGame(game1));
    }

    @Test
    void mustReturnNoDevices() {
        assertEquals("Sem device capaz de rodar", entryPhone.canPlayGame(game4));
    }

    @Test
    void mustDenySupport() {
        entryPhone.setYearRelease(2016);
        assertEquals("Aparelho sem suporte", entryPhone.verificarSuporte());
    }

    @Test
    void mustGetSupport() {
        mediumPhone.setYearRelease(2021);
        assertEquals("Possui suporte da fabricante", mediumPhone.verificarSuporte());
    }

    @Test
    void numberDevicesGamer() {
        entryPhone.setHasGraphicCard(false);
        mediumPhone.setHasGraphicCard(true);
        topPhone.setHasGraphicCard(true);
        SmartphoneIterator gamer = new SmartphoneIterator(entryPhone, mediumPhone, topPhone);
        assertEquals(2, Gamer.countGamerDevices(gamer));
    }

}