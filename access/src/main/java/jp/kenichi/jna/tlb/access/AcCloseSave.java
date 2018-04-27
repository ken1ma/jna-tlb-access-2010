
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({C57B6542-1AA0-3A95-B505-2B627D14447E})</p>
 */
public enum AcCloseSave implements IComEnum {
    
    /**
     * (0)
     */
    acSavePrompt(0),
    
    /**
     * (1)
     */
    acSaveYes(1),
    
    /**
     * (2)
     */
    acSaveNo(2),
    ;

    private AcCloseSave(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}