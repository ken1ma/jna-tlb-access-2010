
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({0D6ADB6F-A581-3D0E-B0CD-14E08619E7AA})</p>
 */
public enum AcDataObjectType implements IComEnum {
    
    /**
     * (-1)
     */
    acActiveDataObject(-1),
    
    /**
     * (0)
     */
    acDataTable(0),
    
    /**
     * (1)
     */
    acDataQuery(1),
    
    /**
     * (2)
     */
    acDataForm(2),
    
    /**
     * (3)
     */
    acDataReport(3),
    
    /**
     * (7)
     */
    acDataServerView(7),
    
    /**
     * (9)
     */
    acDataStoredProcedure(9),
    
    /**
     * (10)
     */
    acDataFunction(10),
    ;

    private AcDataObjectType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}