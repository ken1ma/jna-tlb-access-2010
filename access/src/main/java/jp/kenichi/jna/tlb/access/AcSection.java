
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({4E9486CD-236F-3420-A6E0-60C62EFF9671})</p>
 */
public enum AcSection implements IComEnum {
    
    /**
     * (0)
     */
    acDetail(0),
    
    /**
     * (1)
     */
    acHeader(1),
    
    /**
     * (2)
     */
    acFooter(2),
    
    /**
     * (3)
     */
    acPageHeader(3),
    
    /**
     * (4)
     */
    acPageFooter(4),
    
    /**
     * (5)
     */
    acGroupLevel1Header(5),
    
    /**
     * (6)
     */
    acGroupLevel1Footer(6),
    
    /**
     * (7)
     */
    acGroupLevel2Header(7),
    
    /**
     * (8)
     */
    acGroupLevel2Footer(8),
    ;

    private AcSection(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}