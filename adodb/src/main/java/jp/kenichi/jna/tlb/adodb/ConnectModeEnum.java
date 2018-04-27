
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({00000521-0000-0010-8000-00AA006D2EA4})</p>
 */
public enum ConnectModeEnum implements IComEnum {
    
    /**
     * (0)
     */
    adModeUnknown(0),
    
    /**
     * (1)
     */
    adModeRead(1),
    
    /**
     * (2)
     */
    adModeWrite(2),
    
    /**
     * (3)
     */
    adModeReadWrite(3),
    
    /**
     * (4)
     */
    adModeShareDenyRead(4),
    
    /**
     * (8)
     */
    adModeShareDenyWrite(8),
    
    /**
     * (12)
     */
    adModeShareExclusive(12),
    
    /**
     * (16)
     */
    adModeShareDenyNone(16),
    
    /**
     * (4194304)
     */
    adModeRecursive(4194304),
    ;

    private ConnectModeEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}