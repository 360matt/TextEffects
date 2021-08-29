package fr.i360matt.textEffects.effects;


import fr.i360matt.textEffects.Animation;

public final class GlowAnimation extends Animation {

    public static class Options {
        public String normal = "§e";
        public String start = "§d";
        public String middle = "§5";
        public String end = "§d";
        public int size = 3;
        public int pause = 10;
    }

    public GlowAnimation (final String text, final Options options) {

        for (int i = 0; i < text.length() + options.size; i++) {
            final int startGi = Math.max(i - options.size, 0);
            final int midGi = Math.max(startGi + (startGi > 0 ? 1 : 0), 0) + (i - options.size == 0 ? 1 : 0);

            this.frames.add(
                   options.normal + text.substring(0, startGi) +
                   options.start + text.substring(startGi, Math.min(midGi, text.length())) +
                   options.middle + text.substring(midGi, Math.min(Math.max(i - 1, 0), text.length())) +
                   options.end + text.substring(Math.max(Math.min(i - 1, text.length()), 0), Math.min(i, text.length())) +
                   options.normal + text.substring(Math.min(i, text.length()))
            );
        }

        for (int i = 0; i < options.pause; i++)
            this.frames.add(options.normal + text);
    }
}
