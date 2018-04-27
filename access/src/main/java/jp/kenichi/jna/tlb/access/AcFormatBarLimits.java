
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({69AE78A2-1EB9-33B0-BA74-3AE561CB30B6})</p>
 */
public enum AcFormatBarLimits implements IComEnum {
    
    /**
     * (0)
     */
    acAutomatic(0),
    
    /**
     * (1)
     */
    acNumber(1),
    
    /**
     * (2)
     */
    acPercent(2),
    ;

    private AcFormatBarLimits(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}