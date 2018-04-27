
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({C65D1554-AE8E-322A-AC2C-4268DE56E921})</p>
 */
public enum AcDataTransferType implements IComEnum {
    
    /**
     * (0)
     */
    acImport(0),
    
    /**
     * (1)
     */
    acExport(1),
    
    /**
     * (2)
     */
    acLink(2),
    ;

    private AcDataTransferType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}