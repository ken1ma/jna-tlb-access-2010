
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({0000054A-0000-0010-8000-00AA006D2EA4})</p>
 */
public enum ADCPROP_UPDATECRITERIA_ENUM implements IComEnum {
    
    /**
     * (0)
     */
    adCriteriaKey(0),
    
    /**
     * (1)
     */
    adCriteriaAllCols(1),
    
    /**
     * (2)
     */
    adCriteriaUpdCols(2),
    
    /**
     * (3)
     */
    adCriteriaTimeStamp(3),
    ;

    private ADCPROP_UPDATECRITERIA_ENUM(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}