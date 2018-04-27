
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({AED31F68-091E-3F96-9008-BCFA8C792887})</p>
 */
public enum AcBrowseToObjectType implements IComEnum {
    
    /**
     * (2)
     */
    acBrowseToForm(2),
    
    /**
     * (3)
     */
    acBrowseToReport(3),
    ;

    private AcBrowseToObjectType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}