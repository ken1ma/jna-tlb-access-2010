
package jp.kenichi.jna.tlb.vbide;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum vbext_RefKind implements IComEnum {
    
    /**
     * (0)
     */
    vbext_rk_TypeLib(0),
    
    /**
     * (1)
     */
    vbext_rk_Project(1),
    ;

    private vbext_RefKind(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}