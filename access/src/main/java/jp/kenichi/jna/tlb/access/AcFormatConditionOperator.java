
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({4188B383-5011-3BCB-8249-8D8D688A7BE6})</p>
 */
public enum AcFormatConditionOperator implements IComEnum {
    
    /**
     * (0)
     */
    acBetween(0),
    
    /**
     * (1)
     */
    acNotBetween(1),
    
    /**
     * (2)
     */
    acEqual(2),
    
    /**
     * (3)
     */
    acNotEqual(3),
    
    /**
     * (4)
     */
    acGreaterThan(4),
    
    /**
     * (5)
     */
    acLessThan(5),
    
    /**
     * (6)
     */
    acGreaterThanOrEqual(6),
    
    /**
     * (7)
     */
    acLessThanOrEqual(7),
    ;

    private AcFormatConditionOperator(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}