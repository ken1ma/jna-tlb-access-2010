
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({A5917218-F28D-314F-AD8D-0FB934F34DE3})</p>
 */
public enum AcSplitFormOrientation implements IComEnum {
    
    /**
     * (0)
     */
    acDatasheetOnTop(0),
    
    /**
     * (1)
     */
    acDatasheetOnBottom(1),
    
    /**
     * (2)
     */
    acDatasheetOnLeft(2),
    
    /**
     * (3)
     */
    acDatasheetOnRight(3),
    ;

    private AcSplitFormOrientation(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}