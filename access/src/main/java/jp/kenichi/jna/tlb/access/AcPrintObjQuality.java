
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({0EBDB552-929B-35CA-82E7-56F3189E4530})</p>
 */
public enum AcPrintObjQuality implements IComEnum {
    
    /**
     * (-1)
     */
    acPRPQDraft(-1),
    
    /**
     * (-2)
     */
    acPRPQLow(-2),
    
    /**
     * (-3)
     */
    acPRPQMedium(-3),
    
    /**
     * (-4)
     */
    acPRPQHigh(-4),
    ;

    private AcPrintObjQuality(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}