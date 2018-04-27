
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({C0C85AD1-E8FD-3160-8F8A-023567FC8F62})</p>
 */
public enum AcSharePointListTransferType implements IComEnum {
    
    /**
     * (0)
     */
    acImportSharePointList(0),
    
    /**
     * (1)
     */
    acLinkSharePointList(1),
    ;

    private AcSharePointListTransferType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}