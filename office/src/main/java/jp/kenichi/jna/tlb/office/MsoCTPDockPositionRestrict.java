
package jp.kenichi.jna.tlb.office;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoCTPDockPositionRestrict implements IComEnum {
    
    /**
     * (0)
     */
    msoCTPDockPositionRestrictNone(0),
    
    /**
     * (1)
     */
    msoCTPDockPositionRestrictNoChange(1),
    
    /**
     * (2)
     */
    msoCTPDockPositionRestrictNoHorizontal(2),
    
    /**
     * (3)
     */
    msoCTPDockPositionRestrictNoVertical(3),
    ;

    private MsoCTPDockPositionRestrict(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}