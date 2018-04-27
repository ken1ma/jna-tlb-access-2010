
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({7A14031E-DF18-3670-8A8C-B254D3292E3A})</p>
 */
public enum AcHorizontalAnchor implements IComEnum {
    
    /**
     * (0)
     */
    acHorizontalAnchorLeft(0),
    
    /**
     * (1)
     */
    acHorizontalAnchorRight(1),
    
    /**
     * (2)
     */
    acHorizontalAnchorBoth(2),
    ;

    private AcHorizontalAnchor(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}