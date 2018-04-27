
package jp.kenichi.jna.tlb.acedao;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({91DE8E14-DEE2-3AC6-BB31-415EE24EFFC9})</p>
 */
public enum SynchronizeTypeEnum implements IComEnum {
    
    /**
     * (1)
     */
    dbRepExportChanges(1),
    
    /**
     * (2)
     */
    dbRepImportChanges(2),
    
    /**
     * (4)
     */
    dbRepImpExpChanges(4),
    
    /**
     * (16)
     */
    dbRepSyncInternet(16),
    ;

    private SynchronizeTypeEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}