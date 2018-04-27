
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({00000570-0000-0010-8000-00AA006D2EA4})</p>
 */
public enum RecordCreateOptionsEnum implements IComEnum {
    
    /**
     * (8192)
     */
    adCreateCollection(8192),
    
    /**
     * (-2147483648)
     */
    adCreateStructDoc(-2147483648),
    
    /**
     * (0)
     */
    adCreateNonCollection(0),
    
    /**
     * (33554432)
     */
    adOpenIfExists(33554432),
    
    /**
     * (67108864)
     */
    adCreateOverwrite(67108864),
    
    /**
     * (-1)
     */
    adFailIfNotExists(-1),
    ;

    private RecordCreateOptionsEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}