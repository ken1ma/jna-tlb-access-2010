
package jp.kenichi.jna.tlb.acedao;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({32E7BBC7-C15F-38F5-A17F-A073E51C1DB3})</p>
 */
public enum SetOptionEnum implements IComEnum {
    
    /**
     * (6)
     */
    dbPageTimeout(6),
    
    /**
     * (57)
     */
    dbLockRetry(57),
    
    /**
     * (8)
     */
    dbMaxBufferSize(8),
    
    /**
     * (58)
     */
    dbUserCommitSync(58),
    
    /**
     * (59)
     */
    dbImplicitCommitSync(59),
    
    /**
     * (60)
     */
    dbExclusiveAsyncDelay(60),
    
    /**
     * (61)
     */
    dbSharedAsyncDelay(61),
    
    /**
     * (62)
     */
    dbMaxLocksPerFile(62),
    
    /**
     * (63)
     */
    dbLockDelay(63),
    
    /**
     * (65)
     */
    dbRecycleLVs(65),
    
    /**
     * (66)
     */
    dbFlushTransactionTimeout(66),
    
    /**
     * (80)
     */
    dbPasswordEncryptionProvider(80),
    
    /**
     * (81)
     */
    dbPasswordEncryptionAlgorithm(81),
    
    /**
     * (82)
     */
    dbPasswordEncryptionKeyLength(82),
    ;

    private SetOptionEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}