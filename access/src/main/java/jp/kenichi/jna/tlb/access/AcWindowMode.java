
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({F42B9186-09C8-3B8F-85F5-7071A0ADD127})</p>
 */
public enum AcWindowMode implements IComEnum {
    
    /**
     * (0)
     */
    acWindowNormal(0),
    
    /**
     * (1)
     */
    acHidden(1),
    
    /**
     * (2)
     */
    acIcon(2),
    
    /**
     * (3)
     */
    acDialog(3),
    ;

    private AcWindowMode(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}