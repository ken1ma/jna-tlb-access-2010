
package jp.kenichi.jna.tlb.acedao;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({42EA269E-1B51-38CE-9EBA-78F23F4D8FDD})</p>
 */
public enum TableDefAttributeEnum implements IComEnum {
    
    /**
     * (65536)
     */
    dbAttachExclusive(65536),
    
    /**
     * (131072)
     */
    dbAttachSavePWD(131072),
    
    /**
     * (-2147483646)
     */
    dbSystemObject(-2147483646),
    
    /**
     * (1073741824)
     */
    dbAttachedTable(1073741824),
    
    /**
     * (536870912)
     */
    dbAttachedODBC(536870912),
    
    /**
     * (1)
     */
    dbHiddenObject(1),
    ;

    private TableDefAttributeEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}