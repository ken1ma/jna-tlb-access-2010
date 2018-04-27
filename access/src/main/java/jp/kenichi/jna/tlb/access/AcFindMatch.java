
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({453DE5D7-33AE-3B91-8BC2-1578FF0DACC1})</p>
 */
public enum AcFindMatch implements IComEnum {
    
    /**
     * (0)
     */
    acAnywhere(0),
    
    /**
     * (1)
     */
    acEntire(1),
    
    /**
     * (2)
     */
    acStart(2),
    ;

    private AcFindMatch(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}