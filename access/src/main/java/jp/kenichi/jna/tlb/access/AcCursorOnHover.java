
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({0FCF9FEF-0ED4-30D3-B05D-AF4C2C269734})</p>
 */
public enum AcCursorOnHover implements IComEnum {
    
    /**
     * (0)
     */
    acCursorOnHoverDefault(0),
    
    /**
     * (1)
     */
    acCursorOnHoverHyperlinkHand(1),
    ;

    private AcCursorOnHover(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}