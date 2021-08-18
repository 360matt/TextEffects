package fr.i360matt.textEffects.effects;



import fr.i360matt.textEffects.Animation;

import java.util.Collections;

public final class AlignAnimation {
    public static class Options {
        public int width = 32;
    }

    public static class LEFT extends Animation {
        public LEFT (final String text, final Options options) {
            this.formatted = Collections.singletonList(alignText(text, options.width, false));
        }
    }

    public static class RIGHT extends Animation {
        public RIGHT (final String text, final Options options) {
            this.formatted = Collections.singletonList(alignText(text, options.width, true));
        }
    }

    private static String alignText (final String text, final int width, final boolean right) {
        final StringBuilder space = new StringBuilder();

        for (int i = 0; i < Math.max(0, (width - text.length())); i++)
            space.append(" ");

        return right ? (space + text) : (text + space);
    }
}
