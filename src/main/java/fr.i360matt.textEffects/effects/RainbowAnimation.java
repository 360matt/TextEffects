package fr.i360matt.textEffects.effects;


import fr.i360matt.textEffects.Animation;

public final class RainbowAnimation extends Animation {
    public RainbowAnimation (final String text) {
        for (int i = 0; i < 9; ++i)
            this.formatted .add("§" + i + text);
        for (int i = 97; i < 102; ++i)
            this.formatted .add("§" + (char) i + text);
    }
}
