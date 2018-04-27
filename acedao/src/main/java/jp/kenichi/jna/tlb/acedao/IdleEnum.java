
package jp.kenichi.jna.tlb.acedao;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({191F6C41-7AE0-3FAE-A6FC-B51BE325C767})</p>
 */
public enum IdleEnum implements IComEnum {
    
    /**
     * (1)
     */
    dbFreeLocks(1),
    
    /**
     * (8)
     */
    dbRefreshCache(8),
    ;

    private IdleEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}