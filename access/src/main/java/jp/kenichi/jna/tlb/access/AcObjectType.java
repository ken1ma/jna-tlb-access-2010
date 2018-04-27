
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({A89F420D-07FC-3991-B954-B80D9697E89A})</p>
 */
public enum AcObjectType implements IComEnum {
    
    /**
     * (-1)
     */
    acDefault(-1),
    
    /**
     * (0)
     */
    acTable(0),
    
    /**
     * (1)
     */
    acQuery(1),
    
    /**
     * (2)
     */
    acForm(2),
    
    /**
     * (3)
     */
    acReport(3),
    
    /**
     * (4)
     */
    acMacro(4),
    
    /**
     * (5)
     */
    acModule(5),
    
    /**
     * (6)
     */
    acDataAccessPage(6),
    
    /**
     * (7)
     */
    acServerView(7),
    
    /**
     * (8)
     */
    acDiagram(8),
    
    /**
     * (9)
     */
    acStoredProcedure(9),
    
    /**
     * (10)
     */
    acFunction(10),
    
    /**
     * (11)
     */
    acDatabaseProperties(11),
    
    /**
     * (12)
     */
    acTableDataMacro(12),
    ;

    private AcObjectType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}