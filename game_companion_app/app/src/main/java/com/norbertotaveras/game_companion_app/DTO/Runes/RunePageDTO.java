package com.norbertotaveras.game_companion_app.DTO.Runes;

import java.io.Serializable;
import java.util.Set;

/**
 * Created by Emanuel on 11/28/2017.
 */

public class RunePageDTO implements Serializable {
    public boolean isCurrent; // Indicates if the page is the current page.
    public Set<RuneSlotDTO> slots; // Collection of rune slots associated with the rune page.
    public String runepgname; // Rune page name.
    public long id; // Rune page ID;
}
