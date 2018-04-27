
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({792E7534-71A4-304B-9C33-5B597C9CA2F6})</p>
 */
public enum AcSendObjectType implements IComEnum {
    
    /**
     * (-1)
     */
    acSendNoObject(-1),
    
    /**
     * (0)
     */
    acSendTable(0),
    
    /**
     * (1)
     */
    acSendQuery(1),
    
    /**
     * (2)
     */
    acSendForm(2),
    
    /**
     * (3)
     */
    acSendReport(3),
    
    /**
     * (5)
     */
    acSendModule(5),
    
    /**
     * (6)
     */
    acSendDataAccessPage(6),
    ;

    private AcSendObjectType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}