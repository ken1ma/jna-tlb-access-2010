
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({0000051C-0000-0010-8000-00AA006D2EA4})</p>
 */
public enum CursorOptionEnum implements IComEnum {
    
    /**
     * (256)
     */
    adHoldRecords(256),
    
    /**
     * (512)
     */
    adMovePrevious(512),
    
    /**
     * (16778240)
     */
    adAddNew(16778240),
    
    /**
     * (16779264)
     */
    adDelete(16779264),
    
    /**
     * (16809984)
     */
    adUpdate(16809984),
    
    /**
     * (8192)
     */
    adBookmark(8192),
    
    /**
     * (16384)
     */
    adApproxPosition(16384),
    
    /**
     * (65536)
     */
    adUpdateBatch(65536),
    
    /**
     * (131072)
     */
    adResync(131072),
    
    /**
     * (262144)
     */
    adNotify(262144),
    
    /**
     * (524288)
     */
    adFind(524288),
    
    /**
     * (4194304)
     */
    adSeek(4194304),
    
    /**
     * (8388608)
     */
    adIndex(8388608),
    ;

    private CursorOptionEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}