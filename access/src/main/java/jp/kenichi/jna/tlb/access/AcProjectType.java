
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({6E7B71EC-A786-3DE8-BE95-F16CC8511094})</p>
 */
public enum AcProjectType implements IComEnum {
    
    /**
     * (0)
     */
    acNull(0),
    
    /**
     * (1)
     */
    acADP(1),
    
    /**
     * (2)
     */
    acMDB(2),
    ;

    private AcProjectType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}