
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({00000523-0000-0010-8000-00AA006D2EA4})</p>
 */
public enum IsolationLevelEnum implements IComEnum {
    
    /**
     * (-1)
     */
    adXactUnspecified(-1),
    
    /**
     * (16)
     */
    adXactChaos(16),
    
    /**
     * (256)
     */
    adXactReadUncommitted(256),
    
    /**
     * (256)
     */
    adXactBrowse(256),
    
    /**
     * (4096)
     */
    adXactCursorStability(4096),
    
    /**
     * (4096)
     */
    adXactReadCommitted(4096),
    
    /**
     * (65536)
     */
    adXactRepeatableRead(65536),
    
    /**
     * (1048576)
     */
    adXactSerializable(1048576),
    
    /**
     * (1048576)
     */
    adXactIsolated(1048576),
    ;

    private IsolationLevelEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}