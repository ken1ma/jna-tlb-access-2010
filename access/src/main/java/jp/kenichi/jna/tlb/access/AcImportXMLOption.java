
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({C7E99269-5329-3329-B15B-708794DA2ED1})</p>
 */
public enum AcImportXMLOption implements IComEnum {
    
    /**
     * (0)
     */
    acStructureOnly(0),
    
    /**
     * (1)
     */
    acStructureAndData(1),
    
    /**
     * (2)
     */
    acAppendData(2),
    ;

    private AcImportXMLOption(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}