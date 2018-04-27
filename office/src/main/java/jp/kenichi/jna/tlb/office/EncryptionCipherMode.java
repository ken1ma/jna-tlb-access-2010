
package jp.kenichi.jna.tlb.office;

import com.sun.jna.platform.win32.COM.util.IComEnum;

public enum EncryptionCipherMode implements IComEnum {
    
    /**
     * (0)
     */
    cipherModeECB(0),
    
    /**
     * (1)
     */
    cipherModeCBC(1),
    ;

    private EncryptionCipherMode(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}