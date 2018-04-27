
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({6986CCDB-1C67-32D0-A58F-AF1F02906401})</p>
 */
public enum AcExportXMLSchemaFormat implements IComEnum {
    
    /**
     * (0)
     */
    acSchemaNone(0),
    
    /**
     * (1)
     */
    acSchemaXSD(1),
    ;

    private AcExportXMLSchemaFormat(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}