
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({BDFAF52B-81F5-398B-8405-23598D87C882})</p>
 */
public enum AcFormOpenDataMode implements IComEnum {
    
    /**
     * (-1)
     */
    acFormPropertySettings(-1),
    
    /**
     * (0)
     */
    acFormAdd(0),
    
    /**
     * (1)
     */
    acFormEdit(1),
    
    /**
     * (2)
     */
    acFormReadOnly(2),
    ;

    private AcFormOpenDataMode(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}