
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({0000051D-0000-0010-8000-00AA006D2EA4})</p>
 */
public enum LockTypeEnum implements IComEnum {
    
    /**
     * (-1)
     */
    adLockUnspecified(-1),
    
    /**
     * (1)
     */
    adLockReadOnly(1),
    
    /**
     * (2)
     */
    adLockPessimistic(2),
    
    /**
     * (3)
     */
    adLockOptimistic(3),
    
    /**
     * (4)
     */
    adLockBatchOptimistic(4),
    ;

    private LockTypeEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}