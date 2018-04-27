
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({00000571-0000-0010-8000-00AA006D2EA4})</p>
 */
public enum RecordOpenOptionsEnum implements IComEnum {
    
    /**
     * (-1)
     */
    adOpenRecordUnspecified(-1),
    
    /**
     * (8388608)
     */
    adOpenSource(8388608),
    
    /**
     * (4096)
     */
    adOpenAsync(4096),
    
    /**
     * (16384)
     */
    adDelayFetchStream(16384),
    
    /**
     * (32768)
     */
    adDelayFetchFields(32768),
    ;

    private RecordOpenOptionsEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}