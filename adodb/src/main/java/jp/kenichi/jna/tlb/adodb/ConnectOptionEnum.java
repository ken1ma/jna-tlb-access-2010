
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({00000541-0000-0010-8000-00AA006D2EA4})</p>
 */
public enum ConnectOptionEnum implements IComEnum {
    
    /**
     * (-1)
     */
    adConnectUnspecified(-1),
    
    /**
     * (16)
     */
    adAsyncConnect(16),
    ;

    private ConnectOptionEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}