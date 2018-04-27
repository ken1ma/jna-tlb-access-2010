
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({A2D6DB7F-F73A-307A-B72B-C94BDE06E738})</p>
 */
public enum AcFilterType implements IComEnum {
    
    /**
     * (0)
     */
    acFilterNormal(0),
    
    /**
     * (1)
     */
    acServerFilter(1),
    ;

    private AcFilterType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}