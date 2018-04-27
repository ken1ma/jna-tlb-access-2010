
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({D51DAD50-766F-3491-809C-15DFF68CE5EA})</p>
 */
public enum AcExportXMLOtherFlags implements IComEnum {
    
    /**
     * (1)
     */
    acEmbedSchema(1),
    
    /**
     * (2)
     */
    acExcludePrimaryKeyAndIndexes(2),
    
    /**
     * (4)
     */
    acRunFromServer(4),
    
    /**
     * (8)
     */
    acLiveReportSource(8),
    
    /**
     * (16)
     */
    acPersistReportML(16),
    
    /**
     * (32)
     */
    acExportAllTableAndFieldProperties(32),
    ;

    private AcExportXMLOtherFlags(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}