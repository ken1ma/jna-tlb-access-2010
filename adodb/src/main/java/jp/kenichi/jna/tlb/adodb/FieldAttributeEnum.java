
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({00000525-0000-0010-8000-00AA006D2EA4})</p>
 */
public enum FieldAttributeEnum implements IComEnum {
    
    /**
     * (-1)
     */
    adFldUnspecified(-1),
    
    /**
     * (2)
     */
    adFldMayDefer(2),
    
    /**
     * (4)
     */
    adFldUpdatable(4),
    
    /**
     * (8)
     */
    adFldUnknownUpdatable(8),
    
    /**
     * (16)
     */
    adFldFixed(16),
    
    /**
     * (32)
     */
    adFldIsNullable(32),
    
    /**
     * (64)
     */
    adFldMayBeNull(64),
    
    /**
     * (128)
     */
    adFldLong(128),
    
    /**
     * (256)
     */
    adFldRowID(256),
    
    /**
     * (512)
     */
    adFldRowVersion(512),
    
    /**
     * (4096)
     */
    adFldCacheDeferred(4096),
    
    /**
     * (8192)
     */
    adFldIsChapter(8192),
    
    /**
     * (16384)
     */
    adFldNegativeScale(16384),
    
    /**
     * (32768)
     */
    adFldKeyColumn(32768),
    
    /**
     * (65536)
     */
    adFldIsRowURL(65536),
    
    /**
     * (131072)
     */
    adFldIsDefaultStream(131072),
    
    /**
     * (262144)
     */
    adFldIsCollection(262144),
    ;

    private FieldAttributeEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}