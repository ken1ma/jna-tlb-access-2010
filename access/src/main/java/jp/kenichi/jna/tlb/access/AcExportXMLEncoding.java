
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({9A7CBAAD-F481-34DC-9345-68FAAEC48BB3})</p>
 */
public enum AcExportXMLEncoding implements IComEnum {
    
    /**
     * (0)
     */
    acUTF8(0),
    
    /**
     * (1)
     */
    acUTF16(1),
    ;

    private AcExportXMLEncoding(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}