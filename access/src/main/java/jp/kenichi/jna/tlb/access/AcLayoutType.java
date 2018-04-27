
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({C9790E1A-82F0-376A-B83C-70754307E90B})</p>
 */
public enum AcLayoutType implements IComEnum {
    
    /**
     * (0)
     */
    acLayoutNone(0),
    
    /**
     * (1)
     */
    acLayoutTabular(1),
    
    /**
     * (2)
     */
    acLayoutStacked(2),
    ;

    private AcLayoutType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}