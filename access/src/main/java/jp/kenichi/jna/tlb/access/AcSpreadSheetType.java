
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({FA604274-4051-3534-94D0-C3EE879416DE})</p>
 */
public enum AcSpreadSheetType implements IComEnum {
    
    /**
     * (0)
     */
    acSpreadsheetTypeExcel3(0),
    
    /**
     * (2)
     */
    acSpreadsheetTypeLotusWK1(2),
    
    /**
     * (3)
     */
    acSpreadsheetTypeLotusWK3(3),
    
    /**
     * (4)
     */
    acSpreadsheetTypeLotusWJ2(4),
    
    /**
     * (5)
     */
    acSpreadsheetTypeExcel5(5),
    
    /**
     * (5)
     */
    acSpreadsheetTypeExcel7(5),
    
    /**
     * (6)
     */
    acSpreadsheetTypeExcel4(6),
    
    /**
     * (7)
     */
    acSpreadsheetTypeLotusWK4(7),
    
    /**
     * (8)
     */
    acSpreadsheetTypeExcel97(8),
    
    /**
     * (8)
     */
    acSpreadsheetTypeExcel8(8),
    
    /**
     * (8)
     */
    acSpreadsheetTypeExcel9(8),
    
    /**
     * (9)
     */
    acSpreadsheetTypeExcel12(9),
    
    /**
     * (10)
     */
    acSpreadsheetTypeExcel12Xml(10),
    ;

    private AcSpreadSheetType(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}