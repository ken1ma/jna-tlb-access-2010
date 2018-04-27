
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({00000530-0000-0010-8000-00AA006D2EA4})</p>
 */
public enum EventStatusEnum implements IComEnum {
    
    /**
     * (1)
     */
    adStatusOK(1),
    
    /**
     * (2)
     */
    adStatusErrorsOccurred(2),
    
    /**
     * (3)
     */
    adStatusCantDeny(3),
    
    /**
     * (4)
     */
    adStatusCancel(4),
    
    /**
     * (5)
     */
    adStatusUnwantedEvent(5),
    ;

    private EventStatusEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}