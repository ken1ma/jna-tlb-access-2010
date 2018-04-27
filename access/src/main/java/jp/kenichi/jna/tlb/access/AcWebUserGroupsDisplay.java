
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({90500B0F-827A-4F28-9730-D2B12239B96E})</p>
 */
public enum AcWebUserGroupsDisplay implements IComEnum {
    
    /**
     * (0)
     */
    acWebUserGroupID(0),
    
    /**
     * (1)
     */
    acWebUserGroupName(1),
    ;

    private AcWebUserGroupsDisplay(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}