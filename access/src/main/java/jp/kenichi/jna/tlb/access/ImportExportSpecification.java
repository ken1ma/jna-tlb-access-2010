
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({55B0E0C9-C75D-4F42-AD20-6939C1D05B70})</p>
 */
@ComInterface(iid="{55B0E0C9-C75D-4F42-AD20-6939C1D05B70}")
public interface ImportExportSpecification extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x7d5)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Application", dispId = 0x7d5)
    Application getApplication();
            
    /**
     * <p>id(0x827)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Parent", dispId = 0x827)
    com.sun.jna.platform.win32.COM.util.IDispatch getParent();
            
    /**
     * <p>id(0x80010000)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Name", dispId = 0x80010000)
    String getName();
            
    /**
     * <p>id(0x80010000)</p>
     * <p>vtableId(10)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Name", dispId = 0x80010000)
    void setName(String param0);
            
    /**
     * <p>id(0x994)</p>
     * <p>vtableId(11)</p>
     * @param Prompt [in, optional] {@code Object}
     */
    @ComMethod(name = "Execute", dispId = 0x994)
    void Execute(Object Prompt);
            
    /**
     * <p>id(0x995)</p>
     * <p>vtableId(12)</p>
     */
    @ComMethod(name = "Delete", dispId = 0x995)
    void Delete();
            
    /**
     * <p>id(0x998)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "XML", dispId = 0x998)
    String getXML();
            
    /**
     * <p>id(0x998)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "XML", dispId = 0x998)
    void setXML(String param0);
            
    /**
     * <p>id(0x999)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Description", dispId = 0x999)
    String getDescription();
            
    /**
     * <p>id(0x999)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Description", dispId = 0x999)
    void setDescription(String param0);
            
    /**
     * <p>id(0x990)</p>
     * <p>vtableId(17)</p>
     * @param dispid [in] {@code Integer}
     */
    @ComMethod(name = "IsMemberSafe", dispId = 0x990)
    Boolean IsMemberSafe(Integer dispid);
            
    
}