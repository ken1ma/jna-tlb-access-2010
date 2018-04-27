
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00001564-0000-0010-8000-00AA006D2EA4})</p>
 */
@ComInterface(iid="{00001564-0000-0010-8000-00AA006D2EA4}")
public interface Fields extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Count", dispId = 0x1)
    Integer getCount();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(9)</p>
     */
    @ComMethod(name = "Refresh", dispId = 0x2)
    void Refresh();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(10)</p>
     * @param Index [in] {@code Object}
     */
    @ComProperty(name = "Item", dispId = 0x0)
    Field getItem(Object Index);
            
    /**
     * <p>id(0x60040000)</p>
     * <p>vtableId(11)</p>
     * @param Name [in] {@code String}
     * @param Type [in] {@code DataTypeEnum}
     * @param DefinedSize [in, optional] {@code Integer}
     * @param Attrib [in, optional] {@code FieldAttributeEnum}
     */
    @ComMethod(name = "_Append", dispId = 0x60040000)
    void _Append(String Name,
            DataTypeEnum Type,
            Integer DefinedSize,
            FieldAttributeEnum Attrib);
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(12)</p>
     * @param Index [in] {@code Object}
     */
    @ComMethod(name = "Delete", dispId = 0x4)
    void Delete(Object Index);
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(13)</p>
     * @param Name [in] {@code String}
     * @param Type [in] {@code DataTypeEnum}
     * @param DefinedSize [in, optional] {@code Integer}
     * @param Attrib [in, optional] {@code FieldAttributeEnum}
     * @param FieldValue [in, optional] {@code Object}
     */
    @ComMethod(name = "Append", dispId = 0x3)
    void Append(String Name,
            DataTypeEnum Type,
            Integer DefinedSize,
            FieldAttributeEnum Attrib,
            Object FieldValue);
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(14)</p>
     */
    @ComMethod(name = "Update", dispId = 0x5)
    void Update();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(15)</p>
     * @param ResyncValues [in, optional] {@code ResyncEnum}
     */
    @ComMethod(name = "Resync", dispId = 0x6)
    void Resync(ResyncEnum ResyncValues);
            
    /**
     * <p>id(0x7)</p>
     * <p>vtableId(16)</p>
     */
    @ComMethod(name = "CancelUpdate", dispId = 0x7)
    void CancelUpdate();
            
    
}