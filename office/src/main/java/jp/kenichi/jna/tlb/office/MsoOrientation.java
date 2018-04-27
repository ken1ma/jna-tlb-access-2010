
package jp.kenichi.jna.tlb.office;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoOrientation implements IComEnum {
    
    /**
     * (-2)
     */
    msoOrientationMixed(-2),
    
    /**
     * (1)
     */
    msoOrientationHorizontal(1),
    
    /**
     * (2)
     */
    msoOrientationVertical(2),
    ;

    private MsoOrientation(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}