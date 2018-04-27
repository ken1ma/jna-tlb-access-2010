
package jp.kenichi.jna.tlb.acedao;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({A692012E-5124-3B74-8929-14ECB6AA5D57})</p>
 */
public enum DataTypeEnum implements IComEnum {
    
    /**
     * (1)
     */
    dbBoolean(1),
    
    /**
     * (2)
     */
    dbByte(2),
    
    /**
     * (3)
     */
    dbInteger(3),
    
    /**
     * (4)
     */
    dbLong(4),
    
    /**
     * (5)
     */
    dbCurrency(5),
    
    /**
     * (6)
     */
    dbSingle(6),
    
    /**
     * (7)
     */
    dbDouble(7),
    
    /**
     * (8)
     */
    dbDate(8),
    
    /**
     * (9)
     */
    dbBinary(9),
    
    /**
     * (10)
     */
    dbText(10),
    
    /**
     * (11)
     */
    dbLongBinary(11),
    
    /**
     * (12)
     */
    dbMemo(12),
    
    /**
     * (15)
     */
    dbGUID(15),
    
    /**
     * (16)
     */
    dbBigInt(16),
    
    /**
     * (17)
     */
    dbVarBinary(17),
    
    /**
     * (18)
     */
    dbChar(18),
    
    /**
     * (19)
     */
    dbNumeric(19),
    
    /**
     * (20)
     */
    dbDecimal(20),
    
    /**
     * (21)
     */
    dbFloat(21),
    
    /**
     * (22)
     */
    dbTime(22),
    
    /**
     * (23)
     */
    dbTimeStamp(23),
    
    /**
     * (101)
     */
    dbAttachment(101),
    
    /**
     * (102)
     */
    dbComplexByte(102),
    
    /**
     * (103)
     */
    dbComplexInteger(103),
    
    /**
     * (104)
     */
    dbComplexLong(104),
    
    /**
     * (105)
     */
    dbComplexSingle(105),
    
    /**
     * (106)
     */
    dbComplexDouble(106),
    
    /**
     * (107)
     */
    dbComplexGUID(107),
    
    /**
     * (108)
     */
    dbComplexDecimal(108),
    
    /**
     * (109)
     */
    dbComplexText(109),
    ;

    private DataTypeEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}