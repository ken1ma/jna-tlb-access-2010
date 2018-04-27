
package jp.kenichi.jna.tlb.acedao;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00000089-0000-0010-8000-00AA006D2EA4})</p>
 */
@ComInterface(iid="{00000089-0000-0010-8000-00AA006D2EA4}")
public interface _Relation extends IUnknown, IRawDispatchHandle, IDispatch {
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
    @ComProperty(name = "Table", dispId = 0x60030002)
    String getTable();
            
    /**
     * <p>id(0x60030002)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Table", dispId = 0x60030002)
    void setTable(String param0);
            
    /**
     * <p>id(0x60030004)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "ForeignTable", dispId = 0x60030004)
    String getForeignTable();
            
    /**
     * <p>id(0x60030004)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "ForeignTable", dispId = 0x60030004)
    void setForeignTable(String param0);
            
    /**
     * <p>id(0x60030006)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Attributes", dispId = 0x60030006)
    Integer getAttributes();
            
    /**
     * <p>id(0x60030006)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Attributes", dispId = 0x60030006)
    void setAttributes(Integer param0);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "Fields", dispId = 0x0)
    Fields getFields();
            
    /**
     * <p>id(0x60030009)</p>
     * <p>vtableId(17)</p>
     * @param Name [in, optional] {@code Object}
     * @param Type [in, optional] {@code Object}
     * @param Size [in, optional] {@code Object}
     */
    @ComMethod(name = "CreateField", dispId = 0x60030009)
    Field CreateField(Object Name,
            Object Type,
            Object Size);
            
    /**
     * <p>id(0x6003000a)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "PartialReplica", dispId = 0x6003000a)
    Boolean getPartialReplica();
            
    /**
     * <p>id(0x6003000a)</p>
     * <p>vtableId(19)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "PartialReplica", dispId = 0x6003000a)
    void setPartialReplica(Boolean param0);
            
    
}