
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({11135F5C-AED7-323A-884D-AB5CAA278463})</p>
 */
public enum AcModuleType implements IComEnum {
    
    /**
     * (0)
     */
    acStandardModule(0),
    
    /**
     * (1)
     */
    acClassModule(1),
    ;

    private AcModuleType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}