
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({A66A7F7E-2652-3E6D-8D5B-52675FEAE3F7})</p>
 */
public enum AcTextTransferType implements IComEnum {
    
    /**
     * (0)
     */
    acImportDelim(0),
    
    /**
     * (1)
     */
    acImportFixed(1),
    
    /**
     * (2)
     */
    acExportDelim(2),
    
    /**
     * (3)
     */
    acExportFixed(3),
    
    /**
     * (4)
     */
    acExportMerge(4),
    
    /**
     * (5)
     */
    acLinkDelim(5),
    
    /**
     * (6)
     */
    acLinkFixed(6),
    
    /**
     * (7)
     */
    acImportHTML(7),
    
    /**
     * (8)
     */
    acExportHTML(8),
    
    /**
     * (9)
     */
    acLinkHTML(9),
    ;

    private AcTextTransferType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}