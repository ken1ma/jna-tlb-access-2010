
package jp.kenichi.jna.tlb.acedao;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({C8D258D0-9239-3C8D-A2F1-F483968220F6})</p>
 */
public enum _DAOSuppHelp implements IComEnum {
    
    /**
     * (0)
     */
    LogMessages(0),
    
    /**
     * (0)
     */
    KeepLocal(0),
    
    /**
     * (0)
     */
    Replicable(0),
    
    /**
     * (0)
     */
    ReplicableBool(0),
    
    /**
     * (0)
     */
    V1xNullBehavior(0),
    ;

    private _DAOSuppHelp(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}