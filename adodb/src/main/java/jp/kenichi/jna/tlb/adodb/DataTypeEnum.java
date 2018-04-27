
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({0000051F-0000-0010-8000-00AA006D2EA4})</p>
 */
public enum DataTypeEnum implements IComEnum {
    
    /**
     * (0)
     */
    adEmpty(0),
    
    /**
     * (16)
     */
    adTinyInt(16),
    
    /**
     * (2)
     */
    adSmallInt(2),
    
    /**
     * (3)
     */
    adInteger(3),
    
    /**
     * (20)
     */
    adBigInt(20),
    
    /**
     * (17)
     */
    adUnsignedTinyInt(17),
    
    /**
     * (18)
     */
    adUnsignedSmallInt(18),
    
    /**
     * (19)
     */
    adUnsignedInt(19),
    
    /**
     * (21)
     */
    adUnsignedBigInt(21),
    
    /**
     * (4)
     */
    adSingle(4),
    
    /**
     * (5)
     */
    adDouble(5),
    
    /**
     * (6)
     */
    adCurrency(6),
    
    /**
     * (14)
     */
    adDecimal(14),
    
    /**
     * (131)
     */
    adNumeric(131),
    
    /**
     * (11)
     */
    adBoolean(11),
    
    /**
     * (10)
     */
    adError(10),
    
    /**
     * (132)
     */
    adUserDefined(132),
    
    /**
     * (12)
     */
    adVariant(12),
    
    /**
     * (9)
     */
    adIDispatch(9),
    
    /**
     * (13)
     */
    adIUnknown(13),
    
    /**
     * (72)
     */
    adGUID(72),
    
    /**
     * (7)
     */
    adDate(7),
    
    /**
     * (133)
     */
    adDBDate(133),
    
    /**
     * (134)
     */
    adDBTime(134),
    
    /**
     * (135)
     */
    adDBTimeStamp(135),
    
    /**
     * (8)
     */
    adBSTR(8),
    
    /**
     * (129)
     */
    adChar(129),
    
    /**
     * (200)
     */
    adVarChar(200),
    
    /**
     * (201)
     */
    adLongVarChar(201),
    
    /**
     * (130)
     */
    adWChar(130),
    
    /**
     * (202)
     */
    adVarWChar(202),
    
    /**
     * (203)
     */
    adLongVarWChar(203),
    
    /**
     * (128)
     */
    adBinary(128),
    
    /**
     * (204)
     */
    adVarBinary(204),
    
    /**
     * (205)
     */
    adLongVarBinary(205),
    
    /**
     * (136)
     */
    adChapter(136),
    
    /**
     * (64)
     */
    adFileTime(64),
    
    /**
     * (138)
     */
    adPropVariant(138),
    
    /**
     * (139)
     */
    adVarNumeric(139),
    
    /**
     * (8192)
     */
    adArray(8192),
    ;

    private DataTypeEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}