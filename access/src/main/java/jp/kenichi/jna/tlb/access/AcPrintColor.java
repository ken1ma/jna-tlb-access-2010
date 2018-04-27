
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({9EE93855-A897-37D7-A1FA-ED80D0C72A27})</p>
 */
public enum AcPrintColor implements IComEnum {
    
    /**
     * (1)
     */
    acPRCMMonochrome(1),
    
    /**
     * (2)
     */
    acPRCMColor(2),
    ;

    private AcPrintColor(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}