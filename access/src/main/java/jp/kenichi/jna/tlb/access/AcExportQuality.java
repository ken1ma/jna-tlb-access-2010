
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({E5335569-7CE9-3A68-9840-E97D7A0EAC85})</p>
 */
public enum AcExportQuality implements IComEnum {
    
    /**
     * (0)
     */
    acExportQualityPrint(0),
    
    /**
     * (1)
     */
    acExportQualityScreen(1),
    ;

    private AcExportQuality(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}