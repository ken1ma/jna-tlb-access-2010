
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({0000054B-0000-0010-8000-00AA006D2EA4})</p>
 */
public enum ADCPROP_ASYNCTHREADPRIORITY_ENUM implements IComEnum {
    
    /**
     * (1)
     */
    adPriorityLowest(1),
    
    /**
     * (2)
     */
    adPriorityBelowNormal(2),
    
    /**
     * (3)
     */
    adPriorityNormal(3),
    
    /**
     * (4)
     */
    adPriorityAboveNormal(4),
    
    /**
     * (5)
     */
    adPriorityHighest(5),
    ;

    private ADCPROP_ASYNCTHREADPRIORITY_ENUM(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}