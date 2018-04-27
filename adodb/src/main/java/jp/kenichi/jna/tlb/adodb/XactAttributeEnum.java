
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({00000524-0000-0010-8000-00AA006D2EA4})</p>
 */
public enum XactAttributeEnum implements IComEnum {
    
    /**
     * (131072)
     */
    adXactCommitRetaining(131072),
    
    /**
     * (262144)
     */
    adXactAbortRetaining(262144),
    
    /**
     * (524288)
     */
    adXactAsyncPhaseOne(524288),
    
    /**
     * (1048576)
     */
    adXactSyncPhaseOne(1048576),
    ;

    private XactAttributeEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}