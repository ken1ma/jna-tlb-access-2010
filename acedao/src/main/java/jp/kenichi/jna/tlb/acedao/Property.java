
package jp.kenichi.jna.tlb.acedao;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00000027-0000-0010-8000-00AA006D2EA4})</p>
 */
@ComInterface(iid="{00000027-0000-0010-8000-00AA006D2EA4}")
public interface Property extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0xa)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Properties", dispId = 0xa)
    Properties getProperties();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Value", dispId = 0x0)
    Object getValue();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(9)</p>
     * @param param0 [in] {@code Object}
     */
    @ComProperty(name = "Value", dispId = 0x0)
    void setValue(Object param0);
            
    /**
     * <p>id(0x60030002)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "Name", dispId = 0x60030002)
    String getName();
            
    /**
     * <p>id(0x60030002)</p>
     * <p>vtableId(11)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x60030002)
    void setName(String param0);
            
    /**
     * <p>id(0x60030004)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "Type", dispId = 0x60030004)
    Short getType();
            
    /**
     * <p>id(0x60030004)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code Short}
     */
    @ComProperty(name = "Type", dispId = 0x60030004)
    void setType(Short param0);
            
    /**
     * <p>id(0x60030006)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Inherited", dispId = 0x60030006)
    Boolean getInherited();
            
    
}