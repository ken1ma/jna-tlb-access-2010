
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({0000051E-0000-0010-8000-00AA006D2EA4})</p>
 */
public enum ExecuteOptionEnum implements IComEnum {
    
    /**
     * (-1)
     */
    adOptionUnspecified(-1),
    
    /**
     * (16)
     */
    adAsyncExecute(16),
    
    /**
     * (32)
     */
    adAsyncFetch(32),
    
    /**
     * (64)
     */
    adAsyncFetchNonBlocking(64),
    
    /**
     * (128)
     */
    adExecuteNoRecords(128),
    ;

    private ExecuteOptionEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}