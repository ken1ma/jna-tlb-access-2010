
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({00000532-0000-0010-8000-00AA006D2EA4})</p>
 */
public enum ObjectStateEnum implements IComEnum {
    
    /**
     * (0)
     */
    adStateClosed(0),
    
    /**
     * (1)
     */
    adStateOpen(1),
    
    /**
     * (2)
     */
    adStateConnecting(2),
    
    /**
     * (4)
     */
    adStateExecuting(4),
    
    /**
     * (8)
     */
    adStateFetching(8),
    ;

    private ObjectStateEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}