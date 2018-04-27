
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({18180698-ACF2-36CE-82E2-D46DA465ABFC})</p>
 */
public enum AcNewDatabaseFormat implements IComEnum {
    
    /**
     * (0)
     */
    acNewDatabaseFormatUserDefault(0),
    
    /**
     * (9)
     */
    acNewDatabaseFormatAccess2000(9),
    
    /**
     * (10)
     */
    acNewDatabaseFormatAccess2002(10),
    
    /**
     * (12)
     */
    acNewDatabaseFormatAccess2007(12),
    ;

    private AcNewDatabaseFormat(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}