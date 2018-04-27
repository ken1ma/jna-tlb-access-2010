
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({00000548-0000-0010-8000-00AA006D2EA4})</p>
 */
public enum PersistFormatEnum implements IComEnum {
    
    /**
     * (0)
     */
    adPersistADTG(0),
    
    /**
     * (1)
     */
    adPersistXML(1),
    ;

    private PersistFormatEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}