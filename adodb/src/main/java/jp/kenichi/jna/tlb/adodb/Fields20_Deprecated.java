
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({0000054D-0000-0010-8000-00AA006D2EA4})</p>
 */
@ComInterface(iid="{0000054D-0000-0010-8000-00AA006D2EA4}")
public interface Fields20_Deprecated extends IUnknown, IRawDispatchHandle, IDispatch {
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
    Field_Deprecated getItem(Object Index);
            
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
            
    
}