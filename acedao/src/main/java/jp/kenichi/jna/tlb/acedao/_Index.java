
package jp.kenichi.jna.tlb.acedao;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00000059-0000-0010-8000-00AA006D2EA4})</p>
 */
@ComInterface(iid="{00000059-0000-0010-8000-00AA006D2EA4}")
public interface _Index extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Properties", dispId = 0xa)
    Properties getProperties();
            
    /**
     * <p>id(0x60030000)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Name", dispId = 0x60030000)
    String getName();
            
    /**
     * <p>id(0x60030000)</p>
     * <p>vtableId(9)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x60030000)
    void setName(String param0);
            
    /**
     * <p>id(0x60030002)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Foreign", dispId = 0x60030002)
    Boolean getForeign();
            
    /**
     * <p>id(0x60030003)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Unique", dispId = 0x60030003)
    Boolean getUnique();
            
    /**
     * <p>id(0x60030003)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Unique", dispId = 0x60030003)
    void setUnique(Boolean param0);
            
    /**
     * <p>id(0x60030005)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Clustered", dispId = 0x60030005)
    Boolean getClustered();
            
    /**
     * <p>id(0x60030005)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Clustered", dispId = 0x60030005)
    void setClustered(Boolean param0);
            
    /**
     * <p>id(0x60030007)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Required", dispId = 0x60030007)
    Boolean getRequired();
            
    /**
     * <p>id(0x60030007)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Required", dispId = 0x60030007)
    void setRequired(Boolean param0);
            
    /**
     * <p>id(0x60030009)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "IgnoreNulls", dispId = 0x60030009)
    Boolean getIgnoreNulls();
            
    /**
     * <p>id(0x60030009)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "IgnoreNulls", dispId = 0x60030009)
    void setIgnoreNulls(Boolean param0);
            
    /**
     * <p>id(0x6003000b)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "Primary", dispId = 0x6003000b)
    Boolean getPrimary();
            
    /**
     * <p>id(0x6003000b)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Primary", dispId = 0x6003000b)
    void setPrimary(Boolean param0);
            
    /**
     * <p>id(0x6003000d)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "DistinctCount", dispId = 0x6003000d)
    Integer getDistinctCount();
            
    /**
     * <p>id(0x6003000e)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "Fields", dispId = 0x6003000e)
    Object getFields();
            
    /**
     * <p>id(0x6003000e)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Fields", dispId = 0x6003000e)
    void setFields(Object param0);
            
    /**
     * <p>id(0x60030010)</p>
     * <p>vtableId(24)</p>
     * @param Name [in, optional] {@code Object}
     * @param Type [in, optional] {@code Object}
     * @param Size [in, optional] {@code Object}
     */
    @ComMethod(name = "CreateField", dispId = 0x60030010)
    Field CreateField(Object Name,
            Object Type,
            Object Size);
            
    /**
     * <p>id(0x60030011)</p>
     * <p>vtableId(25)</p>
     * @param Name [in, optional] {@code Object}
     * @param Type [in, optional] {@code Object}
     * @param Value [in, optional] {@code Object}
     * @param DDL [in, optional] {@code Object}
     */
    @ComMethod(name = "CreateProperty", dispId = 0x60030011)
    Property CreateProperty(Object Name,
            Object Type,
            Object Value,
            Object DDL);
            
    
}