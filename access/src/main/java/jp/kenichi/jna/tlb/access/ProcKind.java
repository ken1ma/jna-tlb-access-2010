
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({C94EF443-1C11-39D1-9E9E-A55AAE881CD0})</p>
 */
public enum ProcKind implements IComEnum {
    
    /**
     * (0)
     */
    Proc(0),
    
    /**
     * (1)
     */
    Let(1),
    
    /**
     * (2)
     */
    Set(2),
    
    /**
     * (3)
     */
    Get(3),
    ;

    private ProcKind(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}