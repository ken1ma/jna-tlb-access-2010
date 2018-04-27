
package jp.kenichi.jna.tlb.acedao;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({2EF8E039-F0C8-3A24-B0C7-F151D7F584E5})</p>
 */
public enum PermissionEnum implements IComEnum {
    
    /**
     * (0)
     */
    dbSecNoAccess(0),
    
    /**
     * (1048575)
     */
    dbSecFullAccess(1048575),
    
    /**
     * (65536)
     */
    dbSecDelete(65536),
    
    /**
     * (131072)
     */
    dbSecReadSec(131072),
    
    /**
     * (262144)
     */
    dbSecWriteSec(262144),
    
    /**
     * (524288)
     */
    dbSecWriteOwner(524288),
    
    /**
     * (1)
     */
    dbSecDBCreate(1),
    
    /**
     * (2)
     */
    dbSecDBOpen(2),
    
    /**
     * (4)
     */
    dbSecDBExclusive(4),
    
    /**
     * (8)
     */
    dbSecDBAdmin(8),
    
    /**
     * (1)
     */
    dbSecCreate(1),
    
    /**
     * (4)
     */
    dbSecReadDef(4),
    
    /**
     * (65548)
     */
    dbSecWriteDef(65548),
    
    /**
     * (20)
     */
    dbSecRetrieveData(20),
    
    /**
     * (32)
     */
    dbSecInsertData(32),
    
    /**
     * (64)
     */
    dbSecReplaceData(64),
    
    /**
     * (128)
     */
    dbSecDeleteData(128),
    ;

    private PermissionEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}