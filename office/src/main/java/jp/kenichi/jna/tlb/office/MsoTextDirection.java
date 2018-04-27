
package jp.kenichi.jna.tlb.office;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoTextDirection implements IComEnum {
    
    /**
     * (-2)
     */
    msoTextDirectionMixed(-2),
    
    /**
     * (1)
     */
    msoTextDirectionLeftToRight(1),
    
    /**
     * (2)
     */
    msoTextDirectionRightToLeft(2),
    ;

    private MsoTextDirection(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}