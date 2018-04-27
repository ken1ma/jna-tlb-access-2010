
package jp.kenichi.jna.tlb.acedao;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00000061-0000-0010-8000-00AA006D2EA4})</p>
 */
@ComInterface(iid="{00000061-0000-0010-8000-00AA006D2EA4}")
public interface _Group extends IUnknown, IRawDispatchHandle, IDispatch {
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
     * @param param0 [in] {@code String}
     */
    @ComProperty(name = "PID", dispId = 0x60030002)
    void setPID(String param0);
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "Users", dispId = 0x0)
    Users getUsers();
            
    /**
     * <p>id(0x60030004)</p>
     * <p>vtableId(12)</p>
     * @param Name [in, optional] {@code Object}
     * @param PID [in, optional] {@code Object}
     * @param Password [in, optional] {@code Object}
     */
    @ComMethod(name = "CreateUser", dispId = 0x60030004)
    User CreateUser(Object Name,
            Object PID,
            Object Password);
            
    
}