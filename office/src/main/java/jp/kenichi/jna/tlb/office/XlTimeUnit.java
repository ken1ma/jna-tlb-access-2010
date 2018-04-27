
package jp.kenichi.jna.tlb.office;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({14710A1D-071F-4BFF-B1C2-4BEF5E8B2CEA})</p>
 */
public enum XlTimeUnit implements IComEnum {
    
    /**
     * (0)
     */
    xlDays(0),
    
    /**
     * (1)
     */
    xlMonths(1),
    
    /**
     * (2)
     */
    xlYears(2),
    ;

    private XlTimeUnit(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}