
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({7807F137-F773-313B-BA94-9E8E1633A05E})</p>
 */
public enum AcExportXMLObjectType implements IComEnum {
    
    /**
     * (0)
     */
    acExportTable(0),
    
    /**
     * (1)
     */
    acExportQuery(1),
    
    /**
     * (2)
     */
    acExportForm(2),
    
    /**
     * (3)
     */
    acExportReport(3),
    
    /**
     * (7)
     */
    acExportServerView(7),
    
    /**
     * (9)
     */
    acExportStoredProcedure(9),
    
    /**
     * (10)
     */
    acExportFunction(10),
    ;

    private AcExportXMLObjectType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}