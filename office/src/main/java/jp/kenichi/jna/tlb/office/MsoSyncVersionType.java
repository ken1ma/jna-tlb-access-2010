
package jp.kenichi.jna.tlb.office;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoSyncVersionType implements IComEnum {
    
    /**
     * (0)
     */
    msoSyncVersionLastViewed(0),
    
    /**
     * (1)
     */
    msoSyncVersionServer(1),
    ;

    private MsoSyncVersionType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}