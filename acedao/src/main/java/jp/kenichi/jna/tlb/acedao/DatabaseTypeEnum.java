
package jp.kenichi.jna.tlb.acedao;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({57CD4321-2AEC-3A3A-B673-E9542ED0C9A3})</p>
 */
public enum DatabaseTypeEnum implements IComEnum {
    
    /**
     * (1)
     */
    dbVersion10(1),
    
    /**
     * (2)
     */
    dbEncrypt(2),
    
    /**
     * (4)
     */
    dbDecrypt(4),
    
    /**
     * (8)
     */
    dbVersion11(8),
    
    /**
     * (16)
     */
    dbVersion20(16),
    
    /**
     * (32)
     */
    dbVersion30(32),
    
    /**
     * (64)
     */
    dbVersion40(64),
    
    /**
     * (128)
     */
    dbVersion120(128),
    
    /**
     * (256)
     */
    dbVersion140(256),
    ;

    private DatabaseTypeEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}