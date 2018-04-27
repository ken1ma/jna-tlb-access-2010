
package jp.kenichi.jna.tlb.office;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum MsoBarType implements IComEnum {
    
    /**
     * (0)
     */
    msoBarTypeNormal(0),
    
    /**
     * (1)
     */
    msoBarTypeMenuBar(1),
    
    /**
     * (2)
     */
    msoBarTypePopup(2),
    ;

    private MsoBarType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}