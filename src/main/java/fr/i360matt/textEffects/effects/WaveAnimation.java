package fr.i360matt.textEffects.effects;

import fr.i360matt.textEffects.Animation;
import org.bukkit.ChatColor;

public final class WaveAnimation extends Animation {
    public static class Options {
        public String colors = "§c,§e,§6,§a,§9,§1,§d";
    }

    public WaveAnimation (String text, final Options options) {
        final String[] colors = options.colors.split(",");

        final String formatting = ChatColor.getLastColors(text);
        text = text.replace(formatting, "");

        int counter = 0;
        int index = 0;

        for (final String ignored : colors) {
            final StringBuilder currentFrame = new StringBuilder();

            for (final char c : text.toCharArray()) {
                final String result = colors[index] + formatting;

                index++;
                if (index >= colors.length)
                    index = 0;
                currentFrame.append(result).append(c);
            }

            index = ++counter;
            this.frames.add(currentFrame.toString());
        }
    }
}