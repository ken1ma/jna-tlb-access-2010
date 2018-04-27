
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({CDEFAB49-2006-337F-92A9-6FF64CA964B6})</p>
 */
public enum AcOutputObjectType implements IComEnum {
    
    /**
     * (0)
     */
    acOutputTable(0),
    
    /**
     * (1)
     */
    acOutputQuery(1),
    
    /**
     * (2)
     */
    acOutputForm(2),
    
    /**
     * (3)
     */
    acOutputReport(3),
    
    /**
     * (5)
     */
    acOutputModule(5),
    
    /**
     * (6)
     */
    acOutputDataAccessPage(6),
    
    /**
     * (7)
     */
    acOutputServerView(7),
    
    /**
     * (9)
     */
    acOutputStoredProcedure(9),
    
    /**
     * (10)
     */
    acOutputFunction(10),
    ;

    private AcOutputObjectType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}