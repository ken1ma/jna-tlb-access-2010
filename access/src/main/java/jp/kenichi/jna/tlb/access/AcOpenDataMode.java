
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({69154FF9-C26B-3AB1-8092-9ABD6343295C})</p>
 */
public enum AcOpenDataMode implements IComEnum {
    
    /**
     * (0)
     */
    acAdd(0),
    
    /**
     * (1)
     */
    acEdit(1),
    
    /**
     * (2)
     */
    acReadOnly(2),
    ;

    private AcOpenDataMode(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}