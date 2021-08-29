package fr.i360matt.textEffects.effects;


import fr.i360matt.textEffects.Animation;

import java.util.Arrays;

public final class BlinkAnimation extends Animation {
    public BlinkAnimation (final String text) {
        this.frames = Arrays.asList(text, "");
    }

}
