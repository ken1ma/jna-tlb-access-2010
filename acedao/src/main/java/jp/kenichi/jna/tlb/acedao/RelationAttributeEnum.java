
package jp.kenichi.jna.tlb.acedao;

import com.sun.jna.platform.win32.COM.util.IComEnum;

/**
 * <p>uuid({E9E3CB7C-052B-3808-A4A1-1DDB096DE50C})</p>
 */
public enum RelationAttributeEnum implements IComEnum {
    
    /**
     * (1)
     */
    dbRelationUnique(1),
    
    /**
     * (2)
     */
    dbRelationDontEnforce(2),
    
    /**
     * (4)
     */
    dbRelationInherited(4),
    
    /**
     * (256)
     */
    dbRelationUpdateCascade(256),
    
    /**
     * (4096)
     */
    dbRelationDeleteCascade(4096),
    
    /**
     * (16777216)
     */
    dbRelationLeft(16777216),
    
    /**
     * (33554432)
     */
    dbRelationRight(33554432),
    ;

    private RelationAttributeEnum(long value) {
        this.value = value;
    }
    private long value;

    public long getValue() {
        return this.value;
    }
}