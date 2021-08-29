package fr.i360matt.textEffects.effects;



import fr.i360matt.textEffects.Animation;

import java.util.List;

public final class TypeWriterAnimation extends Animation {
    public static class Options {
        public String cursor = "_";
        public int pause = 10;
        public boolean reverse = true;
    }


    public TypeWriterAnimation (final String text, Options options) {
        final StringBuilder current = new StringBuilder();
        int counter = 0;

        for (int i = 0; i < options.pause; i++) {
            this.frames.add("");
            this.frames.add("");
            this.frames.add(options.cursor);
            this.frames.add(options.cursor);
        }

        for (final char character : text.toCharArray()) {
            current.append(character);
            counter = counterCheck(this.frames, options.cursor, current, counter);
        }

        for (int i = 0; i < options.pause; i++)
            counter = counterCheck(this.frames, options.cursor, current, counter);

        if (options.reverse) {
            for (int i = text.length(); i > 0; i--) {
                current.deleteCharAt(i - 1);
                counter = counterCheck(this.frames, options.cursor, current, counter);
            }
        }
    }

    private int counterCheck( final List<String> frames, final String cursor, final StringBuilder current, final int counter) {
        frames.add(current + ((counter < 2) ? "" : cursor));
        return (counter == 4) ? 0 : counter + 1;
    }

}