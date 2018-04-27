
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({C9C5193B-87D6-331A-9848-2AEF25476C94})</p>
 */
public enum AcPrintRange implements IComEnum {
    
    /**
     * (0)
     */
    acPrintAll(0),
    
    /**
     * (1)
     */
    acSelection(1),
    
    /**
     * (2)
     */
    acPages(2),
    ;

    private AcPrintRange(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}