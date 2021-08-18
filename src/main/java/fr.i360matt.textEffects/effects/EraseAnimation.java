package fr.i360matt.textEffects.effects;


import fr.i360matt.textEffects.Animation;
import org.bukkit.ChatColor;

public final class EraseAnimation extends Animation {
    public EraseAnimation (final String text) {
        final String lastColor = ChatColor.getLastColors(text);
        final StringBuilder sb = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            sb.append(" ");
            String cutText = text.substring(i);
            this.formatted.add(sb + lastColor + cutText);
        }
    }
}