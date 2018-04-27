
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({B6B7208C-0B50-371A-8D12-7F47709C7D88})</p>
 */
public enum AcPrintQuality implements IComEnum {
    
    /**
     * (0)
     */
    acHigh(0),
    
    /**
     * (1)
     */
    acMedium(1),
    
    /**
     * (2)
     */
    acLow(2),
    
    /**
     * (3)
     */
    acDraft(3),
    ;

    private AcPrintQuality(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}