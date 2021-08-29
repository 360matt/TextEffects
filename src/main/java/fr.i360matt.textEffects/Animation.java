package fr.i360matt.textEffects;

import java.util.ArrayList;
import java.util.List;

public abstract class Animation {
    public int cursor = 0;
    public List<String> frames = new ArrayList<>();

    public final String getNext () {
        return (cursor < frames.size())
                ? frames.get(cursor++)
                : frames.get( (cursor=0) );
    }

}
