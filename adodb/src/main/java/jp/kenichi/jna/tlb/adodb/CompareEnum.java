
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({00000545-0000-0010-8000-00AA006D2EA4})</p>
 */
public enum CompareEnum implements IComEnum {
    
    /**
     * (0)
     */
    adCompareLessThan(0),
    
    /**
     * (1)
     */
    adCompareEqual(1),
    
    /**
     * (2)
     */
    adCompareGreaterThan(2),
    
    /**
     * (3)
     */
    adCompareNotEqual(3),
    
    /**
     * (4)
     */
    adCompareNotComparable(4),
    ;

    private CompareEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}