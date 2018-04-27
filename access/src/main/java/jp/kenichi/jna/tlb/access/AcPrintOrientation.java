
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({B5D49F6F-69D8-38AA-B6CA-BF6AAA4D1910})</p>
 */
public enum AcPrintOrientation implements IComEnum {
    
    /**
     * (1)
     */
    acPRORPortrait(1),
    
    /**
     * (2)
     */
    acPRORLandscape(2),
    ;

    private AcPrintOrientation(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}