package me.octo.client.utils.player;

import java.util.ArrayList;
import java.util.List;

/** Test-only sink for the exact c(String) call used by the cache generator; records messages without initializing the game chat stack. */
public final class IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI {
    private static final List<String> MESSAGES = new ArrayList<>();
    private IllllIIlllIIIllIlIllIIIIllllllIIIllllllIlIIlllIllIIllIIIIIIIIllIlIIlIlllIlIlIlIIIlIlI() {}
    public static final void c(String message) {
        if (message == null) throw new NullPointerException("message");
        MESSAGES.add(message);
    }
    public static final List<String> messages() {
        return List.copyOf(MESSAGES);
    }
}