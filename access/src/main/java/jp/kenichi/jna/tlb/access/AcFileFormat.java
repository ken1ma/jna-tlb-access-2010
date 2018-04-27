
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({435B8121-D36F-30A7-A307-57A2CA3C2AE3})</p>
 */
public enum AcFileFormat implements IComEnum {
    
    /**
     * (2)
     */
    acFileFormatAccess2(2),
    
    /**
     * (7)
     */
    acFileFormatAccess95(7),
    
    /**
     * (8)
     */
    acFileFormatAccess97(8),
    
    /**
     * (9)
     */
    acFileFormatAccess2000(9),
    
    /**
     * (10)
     */
    acFileFormatAccess2002(10),
    
    /**
     * (12)
     */
    acFileFormatAccess2007(12),
    ;

    private AcFileFormat(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}