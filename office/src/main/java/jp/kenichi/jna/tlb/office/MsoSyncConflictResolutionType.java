
package jp.kenichi.jna.tlb.office;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoSyncConflictResolutionType implements IComEnum {
    
    /**
     * (0)
     */
    msoSyncConflictClientWins(0),
    
    /**
     * (1)
     */
    msoSyncConflictServerWins(1),
    
    /**
     * (2)
     */
    msoSyncConflictMerge(2),
    ;

    private MsoSyncConflictResolutionType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}