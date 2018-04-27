
package jp.kenichi.jna.tlb.office;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoSharedWorkspaceTaskPriority implements IComEnum {
    
    /**
     * (1)
     */
    msoSharedWorkspaceTaskPriorityHigh(1),
    
    /**
     * (2)
     */
    msoSharedWorkspaceTaskPriorityNormal(2),
    
    /**
     * (3)
     */
    msoSharedWorkspaceTaskPriorityLow(3),
    ;

    private MsoSharedWorkspaceTaskPriority(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}