
package jp.kenichi.jna.tlb.acedao;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({D81A5990-6F34-3189-9F1D-1D503F601AED})</p>
 */
public enum CursorDriverEnum implements IComEnum {
    
    /**
     * (-1)
     */
    dbUseDefaultCursor(-1),
    
    /**
     * (1)
     */
    dbUseODBCCursor(1),
    
    /**
     * (2)
     */
    dbUseServerCursor(2),
    
    /**
     * (3)
     */
    dbUseClientBatchCursor(3),
    
    /**
     * (4)
     */
    dbUseNoCursor(4),
    ;

    private CursorDriverEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}