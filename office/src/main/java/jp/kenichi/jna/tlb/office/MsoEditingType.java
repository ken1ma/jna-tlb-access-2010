
package jp.kenichi.jna.tlb.office;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoEditingType implements IComEnum {
    
    /**
     * (0)
     */
    msoEditingAuto(0),
    
    /**
     * (1)
     */
    msoEditingCorner(1),
    
    /**
     * (2)
     */
    msoEditingSmooth(2),
    
    /**
     * (3)
     */
    msoEditingSymmetric(3),
    ;

    private MsoEditingType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}