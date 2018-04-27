
package jp.kenichi.jna.tlb.acedao;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({86DBAF96-C3BE-3773-A5E6-97EB2F1749F4})</p>
 */
public enum RecordsetOptionEnum implements IComEnum {
    
    /**
     * (1)
     */
    dbDenyWrite(1),
    
    /**
     * (2)
     */
    dbDenyRead(2),
    
    /**
     * (4)
     */
    dbReadOnly(4),
    
    /**
     * (8)
     */
    dbAppendOnly(8),
    
    /**
     * (16)
     */
    dbInconsistent(16),
    
    /**
     * (32)
     */
    dbConsistent(32),
    
    /**
     * (64)
     */
    dbSQLPassThrough(64),
    
    /**
     * (128)
     */
    dbFailOnError(128),
    
    /**
     * (256)
     */
    dbForwardOnly(256),
    
    /**
     * (512)
     */
    dbSeeChanges(512),
    
    /**
     * (1024)
     */
    dbRunAsync(1024),
    
    /**
     * (2048)
     */
    dbExecDirect(2048),
    ;

    private RecordsetOptionEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}