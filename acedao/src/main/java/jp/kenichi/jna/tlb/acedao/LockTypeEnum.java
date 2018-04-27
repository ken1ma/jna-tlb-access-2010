
package jp.kenichi.jna.tlb.acedao;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({D5662DFD-B471-3E11-865D-F0177E687E3D})</p>
 */
public enum LockTypeEnum implements IComEnum {
    
    /**
     * (2)
     */
    dbPessimistic(2),
    
    /**
     * (3)
     */
    dbOptimistic(3),
    
    /**
     * (1)
     */
    dbOptimisticValue(1),
    
    /**
     * (5)
     */
    dbOptimisticBatch(5),
    ;

    private LockTypeEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}