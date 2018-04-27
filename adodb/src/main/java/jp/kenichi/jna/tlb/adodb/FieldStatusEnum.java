
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({0000057E-0000-0010-8000-00AA006D2EA4})</p>
 */
public enum FieldStatusEnum implements IComEnum {
    
    /**
     * (0)
     */
    adFieldOK(0),
    
    /**
     * (2)
     */
    adFieldCantConvertValue(2),
    
    /**
     * (3)
     */
    adFieldIsNull(3),
    
    /**
     * (4)
     */
    adFieldTruncated(4),
    
    /**
     * (5)
     */
    adFieldSignMismatch(5),
    
    /**
     * (6)
     */
    adFieldDataOverflow(6),
    
    /**
     * (7)
     */
    adFieldCantCreate(7),
    
    /**
     * (8)
     */
    adFieldUnavailable(8),
    
    /**
     * (9)
     */
    adFieldPermissionDenied(9),
    
    /**
     * (10)
     */
    adFieldIntegrityViolation(10),
    
    /**
     * (11)
     */
    adFieldSchemaViolation(11),
    
    /**
     * (12)
     */
    adFieldBadStatus(12),
    
    /**
     * (13)
     */
    adFieldDefault(13),
    
    /**
     * (15)
     */
    adFieldIgnore(15),
    
    /**
     * (16)
     */
    adFieldDoesNotExist(16),
    
    /**
     * (17)
     */
    adFieldInvalidURL(17),
    
    /**
     * (18)
     */
    adFieldResourceLocked(18),
    
    /**
     * (19)
     */
    adFieldResourceExists(19),
    
    /**
     * (20)
     */
    adFieldCannotComplete(20),
    
    /**
     * (21)
     */
    adFieldVolumeNotFound(21),
    
    /**
     * (22)
     */
    adFieldOutOfSpace(22),
    
    /**
     * (23)
     */
    adFieldCannotDeleteSource(23),
    
    /**
     * (24)
     */
    adFieldReadOnly(24),
    
    /**
     * (25)
     */
    adFieldResourceOutOfScope(25),
    
    /**
     * (26)
     */
    adFieldAlreadyExists(26),
    
    /**
     * (65536)
     */
    adFieldPendingInsert(65536),
    
    /**
     * (131072)
     */
    adFieldPendingDelete(131072),
    
    /**
     * (262144)
     */
    adFieldPendingChange(262144),
    
    /**
     * (524288)
     */
    adFieldPendingUnknown(524288),
    
    /**
     * (1048576)
     */
    adFieldPendingUnknownDelete(1048576),
    ;

    private FieldStatusEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}