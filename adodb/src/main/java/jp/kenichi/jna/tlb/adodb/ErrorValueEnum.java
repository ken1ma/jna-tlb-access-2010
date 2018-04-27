
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({0000052A-0000-0010-8000-00AA006D2EA4})</p>
 */
public enum ErrorValueEnum implements IComEnum {
    
    /**
     * (3000)
     */
    adErrProviderFailed(3000),
    
    /**
     * (3001)
     */
    adErrInvalidArgument(3001),
    
    /**
     * (3002)
     */
    adErrOpeningFile(3002),
    
    /**
     * (3003)
     */
    adErrReadFile(3003),
    
    /**
     * (3004)
     */
    adErrWriteFile(3004),
    
    /**
     * (3021)
     */
    adErrNoCurrentRecord(3021),
    
    /**
     * (3219)
     */
    adErrIllegalOperation(3219),
    
    /**
     * (3220)
     */
    adErrCantChangeProvider(3220),
    
    /**
     * (3246)
     */
    adErrInTransaction(3246),
    
    /**
     * (3251)
     */
    adErrFeatureNotAvailable(3251),
    
    /**
     * (3265)
     */
    adErrItemNotFound(3265),
    
    /**
     * (3367)
     */
    adErrObjectInCollection(3367),
    
    /**
     * (3420)
     */
    adErrObjectNotSet(3420),
    
    /**
     * (3421)
     */
    adErrDataConversion(3421),
    
    /**
     * (3704)
     */
    adErrObjectClosed(3704),
    
    /**
     * (3705)
     */
    adErrObjectOpen(3705),
    
    /**
     * (3706)
     */
    adErrProviderNotFound(3706),
    
    /**
     * (3707)
     */
    adErrBoundToCommand(3707),
    
    /**
     * (3708)
     */
    adErrInvalidParamInfo(3708),
    
    /**
     * (3709)
     */
    adErrInvalidConnection(3709),
    
    /**
     * (3710)
     */
    adErrNotReentrant(3710),
    
    /**
     * (3711)
     */
    adErrStillExecuting(3711),
    
    /**
     * (3712)
     */
    adErrOperationCancelled(3712),
    
    /**
     * (3713)
     */
    adErrStillConnecting(3713),
    
    /**
     * (3714)
     */
    adErrInvalidTransaction(3714),
    
    /**
     * (3715)
     */
    adErrNotExecuting(3715),
    
    /**
     * (3716)
     */
    adErrUnsafeOperation(3716),
    
    /**
     * (3717)
     */
    adwrnSecurityDialog(3717),
    
    /**
     * (3718)
     */
    adwrnSecurityDialogHeader(3718),
    
    /**
     * (3719)
     */
    adErrIntegrityViolation(3719),
    
    /**
     * (3720)
     */
    adErrPermissionDenied(3720),
    
    /**
     * (3721)
     */
    adErrDataOverflow(3721),
    
    /**
     * (3722)
     */
    adErrSchemaViolation(3722),
    
    /**
     * (3723)
     */
    adErrSignMismatch(3723),
    
    /**
     * (3724)
     */
    adErrCantConvertvalue(3724),
    
    /**
     * (3725)
     */
    adErrCantCreate(3725),
    
    /**
     * (3726)
     */
    adErrColumnNotOnThisRow(3726),
    
    /**
     * (3727)
     */
    adErrURLDoesNotExist(3727),
    
    /**
     * (3728)
     */
    adErrTreePermissionDenied(3728),
    
    /**
     * (3729)
     */
    adErrInvalidURL(3729),
    
    /**
     * (3730)
     */
    adErrResourceLocked(3730),
    
    /**
     * (3731)
     */
    adErrResourceExists(3731),
    
    /**
     * (3732)
     */
    adErrCannotComplete(3732),
    
    /**
     * (3733)
     */
    adErrVolumeNotFound(3733),
    
    /**
     * (3734)
     */
    adErrOutOfSpace(3734),
    
    /**
     * (3735)
     */
    adErrResourceOutOfScope(3735),
    
    /**
     * (3736)
     */
    adErrUnavailable(3736),
    
    /**
     * (3737)
     */
    adErrURLNamedRowDoesNotExist(3737),
    
    /**
     * (3738)
     */
    adErrDelResOutOfScope(3738),
    
    /**
     * (3739)
     */
    adErrPropInvalidColumn(3739),
    
    /**
     * (3740)
     */
    adErrPropInvalidOption(3740),
    
    /**
     * (3741)
     */
    adErrPropInvalidValue(3741),
    
    /**
     * (3742)
     */
    adErrPropConflicting(3742),
    
    /**
     * (3743)
     */
    adErrPropNotAllSettable(3743),
    
    /**
     * (3744)
     */
    adErrPropNotSet(3744),
    
    /**
     * (3745)
     */
    adErrPropNotSettable(3745),
    
    /**
     * (3746)
     */
    adErrPropNotSupported(3746),
    
    /**
     * (3747)
     */
    adErrCatalogNotSet(3747),
    
    /**
     * (3748)
     */
    adErrCantChangeConnection(3748),
    
    /**
     * (3749)
     */
    adErrFieldsUpdateFailed(3749),
    
    /**
     * (3750)
     */
    adErrDenyNotSupported(3750),
    
    /**
     * (3751)
     */
    adErrDenyTypeNotSupported(3751),
    ;

    private ErrorValueEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}