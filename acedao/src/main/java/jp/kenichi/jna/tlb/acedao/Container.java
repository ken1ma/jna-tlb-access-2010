
package jp.kenichi.jna.tlb.acedao;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00000091-0000-0010-8000-00AA006D2EA4})</p>
 */
@ComInterface(iid="{00000091-0000-0010-8000-00AA006D2EA4}")
public interface Container extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * <p>id(0x60030001)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Owner", dispId = 0x60030001)
    String getOwner();
            
    /**
     * <p>id(0x60030001)</p>
     * <p>vtableId(10)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "Owner", dispId = 0x60030001)
    void setOwner(String param0);
            
    /**
     * <p>id(0x60030003)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "UserName", dispId = 0x60030003)
    String getUserName();
            
    /**
     * <p>id(0x60030003)</p>
     * <p>vtableId(12)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "UserName", dispId = 0x60030003)
    void setUserName(String param0);
            
    /**
     * <p>id(0x60030005)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Permissions", dispId = 0x60030005)
    Integer getPermissions();
            
    /**
     * <p>id(0x60030005)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Permissions", dispId = 0x60030005)
    void setPermissions(Integer param0);
            
    /**
     * <p>id(0x60030007)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Inherit", dispId = 0x60030007)
    Boolean getInherit();
            
    /**
     * <p>id(0x60030007)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "Inherit", dispId = 0x60030007)
    void setInherit(Boolean param0);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "Documents", dispId = 0x0)
    Documents getDocuments();
            
    /**
     * <p>id(0x6003000a)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "AllPermissions", dispId = 0x6003000a)
    Integer getAllPermissions();
            
    
}