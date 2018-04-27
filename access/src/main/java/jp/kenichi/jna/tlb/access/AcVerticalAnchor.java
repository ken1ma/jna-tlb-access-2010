
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({0B7E0878-AA59-38D8-993F-6A0547DB3AAD})</p>
 */
public enum AcVerticalAnchor implements IComEnum {
    
    /**
     * (0)
     */
    acVerticalAnchorTop(0),
    
    /**
     * (1)
     */
    acVerticalAnchorBottom(1),
    
    /**
     * (2)
     */
    acVerticalAnchorBoth(2),
    ;

    private AcVerticalAnchor(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}