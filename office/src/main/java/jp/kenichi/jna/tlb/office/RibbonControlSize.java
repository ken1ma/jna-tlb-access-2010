
package jp.kenichi.jna.tlb.office;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum RibbonControlSize implements IComEnum {
    
    /**
     * (0)
     */
    RibbonControlSizeRegular(0),
    
    /**
     * (1)
     */
    RibbonControlSizeLarge(1),
    ;

    private RibbonControlSize(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}