
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({7D687B70-2A5C-4C90-A75D-E2391FCC880F})</p>
 */
public enum AcNavigationSpan implements IComEnum {
    
    /**
     * (0)
     */
    acHorizontal(0),
    
    /**
     * (1)
     */
    acVertical(1),
    ;

    private AcNavigationSpan(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}