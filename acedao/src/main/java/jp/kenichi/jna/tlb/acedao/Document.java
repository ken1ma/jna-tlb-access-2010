
package jp.kenichi.jna.tlb.acedao;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00000099-0000-0010-8000-00AA006D2EA4})</p>
 */
@ComInterface(iid="{00000099-0000-0010-8000-00AA006D2EA4}")
public interface Document extends IUnknown, IRawDispatchHandle, IDispatch {
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
    @ComProperty(name = "Container", dispId = 0x60030003)
    String getContainer();
            
    /**
     * <p>id(0x60030004)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "UserName", dispId = 0x60030004)
    String getUserName();
            
    /**
     * <p>id(0x60030004)</p>
     * <p>vtableId(13)</p>
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "UserName", dispId = 0x60030004)
    void setUserName(String param0);
            
    /**
     * <p>id(0x60030006)</p>
     * <p>vtableId(14)</p>
     */
    @ComProperty(name = "Permissions", dispId = 0x60030006)
    Integer getPermissions();
            
    /**
     * <p>id(0x60030006)</p>
     * <p>vtableId(15)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Permissions", dispId = 0x60030006)
    void setPermissions(Integer param0);
            
    /**
     * <p>id(0x60030008)</p>
     * <p>vtableId(16)</p>
     */
    @ComProperty(name = "DateCreated", dispId = 0x60030008)
    Object getDateCreated();
            
    /**
     * <p>id(0x60030009)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "LastUpdated", dispId = 0x60030009)
    Object getLastUpdated();
            
    /**
     * <p>id(0x6003000a)</p>
     * <p>vtableId(18)</p>
     */
    @ComProperty(name = "AllPermissions", dispId = 0x6003000a)
    Integer getAllPermissions();
            
    /**
     * <p>id(0x6003000b)</p>
     * <p>vtableId(19)</p>
     * @param Name [in, optional] {@code Object}
     * @param Type [in, optional] {@code Object}
     * @param Value [in, optional] {@code Object}
     * @param DDL [in, optional] {@code Object}
     */
    @ComMethod(name = "CreateProperty", dispId = 0x6003000b)
    Property CreateProperty(Object Name,
            Object Type,
            Object Value,
            Object DDL);
            
    
}