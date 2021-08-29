package fr.i360matt.textEffects.effects;

import fr.i360matt.textEffects.Animation;
import fr.i360matt.textEffects.utils.GradientText;

import java.awt.*;

public class GradientAnimation extends Animation {

    public static class Options {
        Color start = Color.RED;
        Color end = Color.BLUE;
    }

    public GradientAnimation (final String text, final Options options) {
        this.frames = GradientText.getAnimatedGradient(text, options.start, options.end);
    }

}