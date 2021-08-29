# TextEffects  
Allows you to create frame-by-frame text animations with rgb-gradient support in Minecraft.

## Maven  
```
<repositories>
    <repository>
        <id>bungeecord-repo</id>
        <url>https://oss.sonatype.org/content/repositories/snapshots</url>
    </repository>
</repositories>
<dependency>
    <groupId>io.github.360matt</groupId>
    <artifactId>TextEffects</artifactId>
    <version>1.1.1-SNAPSHOT</version>
</dependency>
```

## How to use:  
All effects extends of ``Animation``.  
To get the next frame, use ``getNext()``.  
  
Effects can be instantiate by text, but also by Options (inner-class) if needed.  

## Credits:  
I use the animations from ``Holographic Display Extension`` plugin.
