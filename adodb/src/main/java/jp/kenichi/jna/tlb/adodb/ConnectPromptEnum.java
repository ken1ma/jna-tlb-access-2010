
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({00000520-0000-0010-8000-00AA006D2EA4})</p>
 */
public enum ConnectPromptEnum implements IComEnum {
    
    /**
     * (1)
     */
    adPromptAlways(1),
    
    /**
     * (2)
     */
    adPromptComplete(2),
    
    /**
     * (3)
     */
    adPromptCompleteRequired(3),
    
    /**
     * (4)
     */
    adPromptNever(4),
    ;

    private ConnectPromptEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}