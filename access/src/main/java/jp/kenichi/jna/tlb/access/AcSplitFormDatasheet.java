
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({2D0484C0-A420-39DF-A468-6B6971017C95})</p>
 */
public enum AcSplitFormDatasheet implements IComEnum {
    
    /**
     * (0)
     */
    acDatasheetAllowEdits(0),
    
    /**
     * (1)
     */
    acDatasheetReadOnly(1),
    ;

    private AcSplitFormDatasheet(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}