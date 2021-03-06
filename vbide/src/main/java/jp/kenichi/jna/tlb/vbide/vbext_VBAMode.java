
package jp.kenichi.jna.tlb.vbide;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({BE39F3D2-1B13-11D0-887F-00A0C90F2744})</p>
 */
public enum vbext_VBAMode implements IComEnum {
    
    /**
     * (0)
     */
    vbext_vm_Run(0),
    
    /**
     * (1)
     */
    vbext_vm_Break(1),
    
    /**
     * (2)
     */
    vbext_vm_Design(2),
    ;

    private vbext_VBAMode(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}