
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({00000527-0000-0010-8000-00AA006D2EA4})</p>
 */
public enum RecordStatusEnum implements IComEnum {
    
    /**
     * (0)
     */
    adRecOK(0),
    
    /**
     * (1)
     */
    adRecNew(1),
    
    /**
     * (2)
     */
    adRecModified(2),
    
    /**
     * (4)
     */
    adRecDeleted(4),
    
    /**
     * (8)
     */
    adRecUnmodified(8),
    
    /**
     * (16)
     */
    adRecInvalid(16),
    
    /**
     * (64)
     */
    adRecMultipleChanges(64),
    
    /**
     * (128)
     */
    adRecPendingChanges(128),
    
    /**
     * (256)
     */
    adRecCanceled(256),
    
    /**
     * (1024)
     */
    adRecCantRelease(1024),
    
    /**
     * (2048)
     */
    adRecConcurrencyViolation(2048),
    
    /**
     * (4096)
     */
    adRecIntegrityViolation(4096),
    
    /**
     * (8192)
     */
    adRecMaxChangesExceeded(8192),
    
    /**
     * (16384)
     */
    adRecObjectOpen(16384),
    
    /**
     * (32768)
     */
    adRecOutOfMemory(32768),
    
    /**
     * (65536)
     */
    adRecPermissionDenied(65536),
    
    /**
     * (131072)
     */
    adRecSchemaViolation(131072),
    
    /**
     * (262144)
     */
    adRecDBDeleted(262144),
    ;

    private RecordStatusEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}